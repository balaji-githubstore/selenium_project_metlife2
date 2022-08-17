package com.metlife.iemode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.ie.driver","driver/IEDriverServer.exe");

        InternetExplorerOptions options=new InternetExplorerOptions();
        options.ignoreZoomSettings();
        options.attachToEdgeChrome();
        options.withInitialBrowserUrl("https://opensource-demo.orangehrmlive.com/");
        options.withEdgeExecutablePath("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
        options.requireWindowFocus();

        WebDriver driver=new InternetExplorerDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();

        driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();

        Select selectJT=new Select(driver.findElement(By.id("candidateSearch_jobTitle")));
        selectJT.selectByVisibleText("Automation Tester");



    }
}
