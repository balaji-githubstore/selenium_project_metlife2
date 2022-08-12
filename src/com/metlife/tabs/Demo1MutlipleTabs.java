package com.metlife.tabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.ArrayList;

public class Demo1MutlipleTabs {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.db4free.net/");

        //click on phpMyAdmin
        driver.findElement(By.partialLinkText("phpMyAdmin")).click();

        ArrayList<String> windows=new ArrayList<>(driver.getWindowHandles());

        System.out.println(windows.get(0));
        System.out.println(windows.get(1));

        //switch to 2nd tab
        driver.switchTo().window(windows.get(1));

        driver.findElement(By.id("input_username")).sendKeys("Admin");
        driver.findElement(By.id("input_password")).sendKeys("admin123");
        driver.findElement(By.id("input_go")).click();

        String actualError= driver.findElement(By.xpath("//div[contains(text(),'Access')]")).getText();
        System.out.println(actualError);

        driver.close();  //close the current tab/session

        //switch to 1st tab
        driver.switchTo().window(windows.get(0));
        System.out.println(driver.getTitle());

        driver.quit();
    }
}
