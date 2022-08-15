package com.metlife.seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.time.Duration;

public class Demo2UploadFile {

    public static void main(String[] args) {

        File file = new File("files/Balaji-Profile_2022.pdf");
        String path = file.getAbsolutePath();
        System.out.println(path);

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.ilovepdf.com/pdf_to_word");

        //span[text()='Got it']
        driver.findElement(By.xpath("//input[@type='file']")).sendKeys(path);

    }
}

