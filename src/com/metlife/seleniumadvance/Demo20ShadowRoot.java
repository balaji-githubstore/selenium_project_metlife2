package com.metlife.seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.awt.*;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Demo20ShadowRoot {

    public static void main(String[] args) throws AWTException {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");


        Map<String, Object> map = new HashMap<String, Object>();
        map.put("deviceName", "Nexus 5");


        WebDriver driver = new EdgeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));

        driver.get("https://selectorshub.com/xpath-practice-page/");  //wait for page load to complete

//        document.querySelector("body > downloads-manager").shadowRoot.querySelector("#frb1").shadowRoot.querySelector("#show")

        SearchContext sc1= driver.findElement(By.xpath("//downloads-manager")).getShadowRoot();
        SearchContext sc2=sc1.findElement(By.xpath("//*[@id='frb1']")).getShadowRoot();
        sc2.findElement(By.xpath("//*[@id='show']")).click();


       // driver.findElement(By.xpath("//downloads-manager")).getShadowRoot().findElement(By.xpath("//*[@id='frb1']")).getShadowRoot().findElement(By.xpath("//*[@id='show']")).click();
    }
}
