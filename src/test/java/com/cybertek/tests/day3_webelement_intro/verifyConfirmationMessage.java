package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyConfirmationMessage {

    public static void main(String[] args){

        /*Verify confirmation message
        open browser
        go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        enter any email
        verify that email is displayed in the input box
        click on Retrieve password
        verify that confirmation message says ‘Your e-mail’s been sent!’*/
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        String expectedEmail="ay@gmail.com";
        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInPut= driver.findElement(By.name("email"));

        emailInPut.sendKeys(expectedEmail);

        String actualEmail= emailInPut.getAttribute("value");
        if (expectedEmail.equals(actualEmail)){

                     System.out.println("Pass");

        }else{

                System.out.println("Fail");
}
        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));

         retrievePasswordButton.click();

         WebElement actualConfirmationmesage=driver.findElement(By.name("confirmation_message"));
         String expectedMessage="Your e-mail's been sent!";

         System.out.println(actualConfirmationmesage.getText());

        String actualMessage=actualConfirmationmesage.getText();
        if(expectedMessage.equals(actualMessage)){

            System.out.println("Pass");

        }else{

            System.out.println("Fail");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualConfirmationmesage = " + actualMessage);

        }

        driver.quit();


    }
}
