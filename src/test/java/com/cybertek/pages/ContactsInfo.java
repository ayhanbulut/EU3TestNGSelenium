package com.cybertek.pages;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContactsInfo extends BasePage {


    public void findEmail() {
        String email = ConfigurationReader.get("email");

        waitUntilLoaderScreenDisappear();

        List<WebElement> rowelements = Driver.get().findElements(By.xpath("//*[@class='grid-body']/tr"));

        int rowsize = rowelements.size();

        System.out.println(rowsize);

        waitUntilLoaderScreenDisappear();

        List<WebElement> columelements = Driver.get().findElements(By.xpath("//*[@class='grid-body']/tr[1]/td"));

        int columsize = columelements.size();

        System.out.println(columsize);

        for (int i = 1; i <= rowsize; i++) {

            for (int j = 1; j <= columsize; j++) {

                WebElement actual = Driver.get().findElement(By.xpath("//*[@class='grid-body']/tr["+i+"]/td["+j+"]"));

                if (actual.getText().contentEquals(email)) {

                    waitUntilLoaderScreenDisappear();

                    System.out.println("actual.getText() = " + actual.getText());
                    System.out.println("email = " + email);
                    actual.click();
                    BrowserUtils.waitFor(10);
                    break;



                }

            }


        }

    }


    public void fullname() {

        String expectedName = ConfigurationReader.get("fullname");
        WebElement namelocator = Driver.get().findElement(By.className("user-name"));
        String ActualName = namelocator.getText();
        Assert.assertEquals(ActualName, expectedName, "Fullname is matched");

    }

    public void email() {
        String expectedName = ConfigurationReader.get("email");
        WebElement namelocator = Driver.get().findElement(By.className("email"));
        String ActualName = namelocator.getText();



    }

    public void phone() {
        String expectedName = ConfigurationReader.get("phone");
        WebElement namelocator = Driver.get().findElement(By.className("phone"));
        String ActualName = namelocator.getText();


    }
    public void findemail1(){
      //  String email = ConfigurationReader.get("email");

        waitUntilLoaderScreenDisappear();

        Driver.get().findElement(By.xpath("//*[@class='grid-body']/tr[5]/td[4]")).click();


    }
}



