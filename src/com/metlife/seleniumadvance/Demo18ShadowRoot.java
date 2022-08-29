package com.metlife.seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.awt.*;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class Demo18ShadowRoot {

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


        //driver.findElement(By.id("kils")).sendKeys("hello1");
        String text = "";
        while (!text.equalsIgnoreCase("hello")) {
            try {

                js.executeScript("document.querySelector('#userName').shadowRoot.querySelector('#kils').value='hello'");

                text = (String) js.executeScript("return document.querySelector('#userName').shadowRoot.querySelector('#kils').value");
            } catch (Exception ex) {

            }
        }

        text = "";
        while (!text.equalsIgnoreCase("hello")) {
            try {

                js.executeScript("document.querySelector('#userName').shadowRoot.querySelector('#pact1').contentDocument.querySelector('#jex').value='hello122'");

                text = (String) js.executeScript("return document.querySelector('#userName').shadowRoot.querySelector('#pact1').contentDocument.querySelector('#jex').value");
            } catch (Exception ex) {

            }
        }

//        document.querySelector("[id='userName']").shadowRoot.querySelector("input[title='user name field']").value='jjj'
//        document.querySelector("body > downloads-manager").shadowRoot.querySelector("#frb1").shadowRoot.querySelector("#show")
    }
}
