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

public class Demo19ShadowRoot {

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

        //js.executeScript("document.querySelector('#userName').shadowRoot.querySelector('#kils').value='hello'");
      //  js.executeScript("document.querySelector('#userName').shadowRoot.querySelector('#pact1').contentDocument.querySelector('#jex').value='hello122'");

//        document.querySelector("body > downloads-manager").shadowRoot.querySelector("#frb1").shadowRoot.querySelector("#show")

        SearchContext sc= driver.findElement(By.id("userName")).getShadowRoot();
        sc.findElement(By.cssSelector("#kils")).sendKeys("hello");

        sc= driver.switchTo().frame(sc.findElement(By.cssSelector("#pact1")));

//        sc.findElement(By.cssSelector("#jex")).sendKeys("hello123");
        sc.findElement(By.xpath("//*[@id='jex']")).sendKeys("hello123");


    }
}
