package com.login;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class CommonMethods {
    public static void takeScreenshot(WebDriver driver, String testCaseName){
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotPath = "src/test_output/ExecutionResults";
        try {
            FileHandler.createDir(new File(screenshotPath));
            FileHandler.copy(srcFile, new File(screenshotPath + File.separator + testCaseName + ".PNG"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
