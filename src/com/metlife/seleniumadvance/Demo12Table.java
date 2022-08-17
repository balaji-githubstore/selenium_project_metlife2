package com.metlife.seleniumadvance;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Demo12Table {

    public static void main(String[] args) {



        System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");

        EdgeDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");

        for(int i=1;i<=10;i++)
        {
            String name=driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[2]")).getText();
            System.out.println(name);
            if(name.equals("Brenden Wagner"))
            {
                driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[1]")).click();
            }
        }


    }
}
