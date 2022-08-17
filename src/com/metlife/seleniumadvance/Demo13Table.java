package com.metlife.seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Demo13Table {

    public static void main(String[] args) {


        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");


        int rowCount=driver.findElements(By.xpath("//table[@id='example']/tbody/tr")).size();

        for (int i = 1; i <= rowCount; i++) {
            String name = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[2]")).getText();
            System.out.println(name);

        }


    }
}
