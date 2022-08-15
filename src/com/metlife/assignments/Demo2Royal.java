package com.metlife.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Demo2Royal {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.royalcaribbean.com/");

        driver.findElement(By.xpath("//*[name()='svg' and @class='email-capture__close']")).click();

        driver.findElement(By.linkText("SIGN IN")).click();  //text font should be as shown in UI
        driver.findElement(By.linkText("Create an account")).click();

        driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("Balaji");

        driver.findElement(By.xpath("//span[text()='Month']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'May')]")).click();

    }
}
