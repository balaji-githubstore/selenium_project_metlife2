package com.metlife.basic;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1BrowserLaunch {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.co.in/");

        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);

        String actualUrl= driver.getCurrentUrl();
        System.out.println(actualUrl);

        String pageSource= driver.getPageSource();
        System.out.println(pageSource);



    }
}
