package com.metlife.seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Demo10DynamicPage {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://phptravels.net/");  //wait for page load to complete

        driver.findElement(By.id("select2-hotels_city-container")).click();
        driver.findElement(By.xpath("//input[@aria-controls='select2-hotels_city-results']")).sendKeys("chennai");
        driver.findElement(By.xpath("//li[text()='Chennai,India']")).click();

        //enter checkin date 31-08-2022
//        driver.findElement(By.id("checkin")).sendKeys("31-08-2022");
        //way 2
//        driver.executeScript("document.querySelector('#checkin').value='20-08-2022';document.querySelector('#checkout').value='04-09-2022'");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement ele1= driver.findElement(By.xpath("//input[@id='checkin']"));
        WebElement ele2= driver.findElement(By.xpath("//input[@id='checkout']"));

        js.executeScript("arguments[0].value='24-08-2022';arguments[1].value='05-09-2022'",ele1,ele2);

    }
}
