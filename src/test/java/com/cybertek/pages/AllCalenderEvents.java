package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AllCalenderEvents extends BasePage  {



    public void firststep(){

        LoginPage loginPage=new LoginPage();

        loginPage.loginAsStoreManager();

        DashboardPage dashboardPage=new DashboardPage();

        dashboardPage.waitUntilLoaderScreenDisappear();

        dashboardPage.navigateToModule("Activities","Calendar Events");

    }

        public WebElement title(String title){
            String xpath ="//td[contains(text(),'"+title+"')]";
            return Driver.get().findElement(By.xpath(xpath));
        }


    }

