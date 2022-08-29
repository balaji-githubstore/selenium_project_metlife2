package com.metlife.tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class Demo3MutlipleTabs {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.db4free.net/");

        //click on phpMyAdmin
        driver.findElement(By.partialLinkText("phpMyAdmin")).click();

        ArrayList<String> windows=new ArrayList<>(driver.getWindowHandles());

        for(String window : windows)
        {
            driver.switchTo().window(window);
            if(driver.getTitle().equals("phpMyAdmin"))
            {
                break;
            }
        }
        driver.findElement(By.id("input_username")).sendKeys("Admin");
        driver.findElement(By.id("input_password")).sendKeys("admin123");
        driver.findElement(By.id("input_go")).click();
    }
}
