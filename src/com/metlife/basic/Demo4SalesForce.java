package com.metlife.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Demo4SalesForce {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");

        driver.findElement(By.name("UserFirstName")).sendKeys("Balaji");
        driver.findElement(By.name("UserLastName")).sendKeys("Dinakaran");
        driver.findElement(By.name("UserEmail")).sendKeys("demo@cccs.com");
        driver.findElement(By.name("CompanyName")).sendKeys("CCCS");

        Select selectJobTitle=new Select(driver.findElement(By.name("UserTitle")));
        selectJobTitle.selectByVisibleText("IT Manager");

        Select selectEmployees=new Select(driver.findElement(By.name("CompanyEmployees")));
        selectEmployees.selectByValue("250");

        Select selectCountry=new Select(driver.findElement(By.xpath("//select[contains(@id,'Country')]")));
        selectCountry.selectByVisibleText("United Kingdom");

        driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();

        driver.findElement(By.name("start my free trial")).click();

//        driver.findElement(By.xpath("//button[contains(text(),'start my free trial')]")).click();

        String actualError=driver.findElement(By.xpath("//span[contains(@id,'UserPhon')]")).getText();
        System.out.println(actualError);
    }
}
