package com.metlife.iemode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import java.time.Duration;

public class Demo2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.ie.driver","driver/IEDriverServer.exe");

        InternetExplorerOptions options=new InternetExplorerOptions();
        options.ignoreZoomSettings();
        options.attachToEdgeChrome();
        options.withInitialBrowserUrl("https://phptravels.net/");
        options.withEdgeExecutablePath("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");

        InternetExplorerDriver driver=new InternetExplorerDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        driver.findElement(By.id("select2-hotels_city-container")).click();
        driver.findElement(By.xpath("//input[@aria-controls='select2-hotels_city-results']")).sendKeys("chennai");
        driver.findElement(By.xpath("//li[text()='Chennai,India']")).click();

        String html=driver.getPageSource();

        driver.executeScript("document.querySelector('#checkin').value='28-08-2022'");

        driver.executeScript("document.querySelector('#checkout').value='09-09-2022'");

    }
}
