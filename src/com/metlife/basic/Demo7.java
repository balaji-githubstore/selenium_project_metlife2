package com.metlife.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class Demo7 {

    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver", "D:\\Software\\IEDriverServer.exe");

        InternetExplorerOptions options=new InternetExplorerOptions();
        options.ignoreZoomSettings();
        options.attachToEdgeChrome();

        options.withInitialBrowserUrl("https://opensource-demo.orangehrmlive.com/");
        options.withEdgeExecutablePath("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");

        WebDriver driver = new InternetExplorerDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");  //check for presence of element in 0.5s

        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        driver.findElement(By.name("Submit")).click();

        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.id("welcome")).click();

        driver.findElement(By.linkText("Logout")).click();

//        driver.findElement(RelativeLocator.with(By.tagName("")).).click();
    }
}
