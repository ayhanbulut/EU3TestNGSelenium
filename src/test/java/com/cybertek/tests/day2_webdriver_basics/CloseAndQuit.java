package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertek.com");

        Thread.sleep(3000);

        driver.close();

        driver=new ChromeDriver();

        Thread.sleep(6000);
        driver.get("http://practice.cybertek.com/open_new_tab");
        driver.quit();


    }

}
