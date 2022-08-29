package com.metlife.seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.awt.*;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Demo17EmulationOptions {

    public static void main(String[] args) throws AWTException {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");


        Map<String, Object> map = new HashMap<String, Object>();
        map.put("deviceName", "Nexus 5");

        EdgeOptions options=new EdgeOptions();
        options.setExperimentalOption("mobileEmulation",map);

        WebDriver driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.selenium.dev/downloads");  //wait for page load to complete

        driver.findElement(By.partialLinkText("32 bit Windows")).click();

//        driver.quit();

//
    }
}
