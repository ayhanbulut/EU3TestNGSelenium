package com.cybertek.tests.day14_extent_reports;

import com.cybertek.pages.ContactsInfo;
import com.cybertek.pages.DashboardPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day14_homework extends TestBase {

    /*
     * open the chrome
     * go to qa1.vytrack
     * login as a sales manager
     * navigate to customers ->contacts
     * click on email mbrackstone9@example.com
     * verify that full name is Mariam Brackstone
     * verify that email is mbrackstone9@example.com
     * verify that phone number is +18982323434
     */

    @Test

    public void test1(){

        //open the chrome

        LoginPage loginPage=new LoginPage();

        //login as a sales manager
        loginPage.loginAsSalesManager();

        BrowserUtils.waitFor(5);

        DashboardPage dashboardPage=new DashboardPage();

        // navigate to customers ->contacts
        dashboardPage.navigateToModule("Customers","Contacts");



        ContactsInfo contactsInfo=new ContactsInfo();

        contactsInfo.findemail1();


        contactsInfo.fullname();


        contactsInfo.email();

        contactsInfo.phone();





    }


}
