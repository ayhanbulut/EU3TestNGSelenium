package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocator {


    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        //make browser fullscreen
        driver.manage().window().maximize();
        //or
        // driver.manage().window().fullscreen(); //it only works for windows
        WebElement fullNamaInput = driver.findElement(By.name("full_name"));
        fullNamaInput.sendKeys("Mike Smith");
        //Put some email and sign up button
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("mike.smith@cybertek.com");
        WebElement clickButton = driver.findElement(By.name("wooden_spoon"));
        clickButton.click();
    }
}
