package com.metlife.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;

public class Demo1Citibank {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.online.citibank.co.in/");

        driver.findElement(By.xpath("//span[text()='Login']")).click();

        ArrayList<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));

        driver.findElement(By.xpath("//div[contains(text(),'Forgot User ID')]")).click();

        driver.findElement(By.partialLinkText("select your product type")).click();
        driver.findElement(By.partialLinkText("Credit Card")).click();

        driver.findElement(By.id("citiCard1")).sendKeys("5564");
        driver.findElement(By.id("citiCard2")).sendKeys("4555");
        driver.findElement(By.id("citiCard3")).sendKeys("4445");
        driver.findElement(By.id("citiCard4")).sendKeys("7756");

        driver.findElement(By.id("cvvnumber")).sendKeys("999");

        driver.findElement(By.id("bill-date-long")).click();

        Select selMon = new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
        selMon.selectByVisibleText("Aug");

        Select selYear = new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
        selYear.selectByVisibleText("1996");

        driver.findElement(By.xpath("//a[text()='12']")).click();

        driver.findElement(By.xpath("//input[@value='PROCEED']")).click();

        String actualError = driver.findElement(By.xpath("//li[contains(text(),'accept')]")).getText();
        System.out.println(actualError);

        driver.findElement(By.xpath("//button[text()='Close Window']")).click();
    }
}
