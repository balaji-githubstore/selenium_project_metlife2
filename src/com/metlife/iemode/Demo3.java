package com.metlife.iemode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.ie.driver","driver/IEDriverServer.exe");

        InternetExplorerOptions options=new InternetExplorerOptions();
        options.ignoreZoomSettings();
        options.attachToEdgeChrome();
        options.withInitialBrowserUrl("https://www.goto.com/meeting");
        options.withEdgeExecutablePath("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");

        WebDriver driver=new InternetExplorerDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

      //  driver.findElement(By.id("truste-consent-button")).click();
        driver.findElement(By.linkText("Try Free")).click();
        driver.findElement(By.id("first-name")).sendKeys("john");

        Select selectEmp=new Select(driver.findElement(By.id("CompanySize")));
        selectEmp.selectByVisibleText("");
    }
}
