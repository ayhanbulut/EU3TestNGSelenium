package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class classNameTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/sign_up");

        driver.manage().window().maximize();
        WebElement homelink= driver.findElement(By.className("nav-link"));

        homelink.click();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");


        Thread.sleep(3000);

        System.out.println(driver.findElement(By.className("h3")).getText());


    }
}
