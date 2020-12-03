package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.de/ref=nav_logo");
        WebElement src=  driver.findElement(By.id("twotabsearchtextbox"));
        src.click();
        src.sendKeys("selenium");
        driver.findElement(By.xpath("//input[@value='Los']")).click();
        WebElement actualResult=driver.findElement(By.xpath("//span[contains(text(),'Ergebnissen oder Vorschlägen')]"));
        System.out.println("actualResult.getText() = " + actualResult.getText());
        Thread.sleep(3000);
        driver.quit();





    }
}
