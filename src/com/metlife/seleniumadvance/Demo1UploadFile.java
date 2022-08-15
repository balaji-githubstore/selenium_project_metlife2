package com.metlife.seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Demo1UploadFile {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.ilovepdf.com/pdf_to_word");

        //span[text()='Got it']
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\Mine\\Balaji-Profile_2022.pdf");

    }
}
