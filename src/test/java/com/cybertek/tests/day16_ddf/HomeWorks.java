package com.cybertek.tests.day16_ddf;

import com.cybertek.pages.*;

import com.cybertek.tests.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.apache.commons.math3.util.IterationListener;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import javax.swing.text.Utilities;
import java.util.List;


public class HomeWorks extends TestBase {



    @Test
    public void test1(){

        AllCalenderEvents A=new AllCalenderEvents();
        A.firststep();

        String ExpectedWebelemnet="Options";

        String Actualwebelement=Driver.get().findElement(By.xpath("//div[contains(text(),'Options')]")).getText();

        Assert.assertEquals(Actualwebelement,ExpectedWebelemnet,"Verified that options is appeared");


    }
    @Test
     public void test2(){

           AllCalenderEvents A=new AllCalenderEvents();

           A.firststep();

        WebElement number=Driver.get().findElement(By.cssSelector("input[value='1']"));
        System.out.println("number.getAttribute(\"value\") = " + number.getAttribute("value"));

        //  String ExpectedWebelemnet="1";

         // Driver.get().findElement(By.cssSelector("input[value='"+ExpectedWebelemnet+"']"));




    }

    @Test
    public void test3(){
        AllCalenderEvents A=new AllCalenderEvents();
        A.firststep();
        BrowserUtils.waitFor(5);



      WebElement button= Driver.get().findElement(By.xpath("//*[@class=\"btn-group\"]/button"));

     button.click();

        List <WebElement> buttons= Driver.get().findElements(By.xpath("//*[@class=\"dropdown-item\"]"));

        buttons.get(3).click();



       // List<WebElement> rowelements = Driver.get().findElements(By.xpath("//*[@class='grid-body']/tr"));

      //  int Actualrow = rowelements.size();

        //Assert.assertEquals(Actualrow,25, "Accepted");


    }

  @Test

  public void test4(){

      AllCalenderEvents A=new AllCalenderEvents();
      A.firststep();
      BrowserUtils.waitFor(5);

// 1.web element for table numbers

      WebElement TableNumber=Driver.get().findElement(By.xpath("//*[@class=\"dib\"][2]"));

      BrowserUtils.verifyElementDisplayed(TableNumber);

      String Expected=TableNumber.getText().replaceAll("[^0-9]","");

      int TableInt=Integer.parseInt(Expected);



      //2.web element for rows number

      WebElement Expectedbutton=Driver.get().findElement(By.xpath("//*[@class=\"dib\"][3]"));

      String ExpectedStr=Expectedbutton.getText().replaceAll("[^0-9]","");

      int ExpectedRsl=Integer.parseInt(ExpectedStr);

      int TotalRow=0;



      for (int i = 1; i <=TableInt+1; i++) {

          A.waitUntilLoaderScreenDisappear();

          List<WebElement> rowelements = Driver.get().findElements(By.xpath("//*[@class='grid-body']/tr"));

          BrowserUtils.waitFor(3);

          int Actualrow = rowelements.size();

          TotalRow=TotalRow+Actualrow;



          System.out.print("sayi = " + i +" ");

          System.out.println("TotalRow = " + TotalRow);

          Driver.get().findElement(By.xpath("//i[contains(text(),'Next')]")).click();

         // WebElement Next=Driver.get().findElement(By.xpath("//i[contains(text(),'Next')]"));




          //Next.click();




      }
      TotalRow=TotalRow-25;

      Assert.assertEquals(TotalRow,ExpectedRsl,"Verified");
      }








  @Test
  public void test5(){

      AllCalenderEvents A=new AllCalenderEvents();
      A.firststep();
      BrowserUtils.waitFor(5);

      WebElement all=Driver.get().findElement(By.xpath("//*[@class=\"btn btn-default btn-small dropdown-toggle\"]/input"));

      System.out.println("all.isSelected() = " + all.isSelected());

        BrowserUtils.clickWithJS(all);
         //all.click();

      System.out.println("all.isSelected() = " + all.isSelected());


  }
@Test

    public void test6(){

    AllCalenderEvents A=new AllCalenderEvents();
    A.firststep();
    BrowserUtils.waitFor(5);
    String title="Testers meeting";
    A.title(title).click();

    List<WebElement> lists=Driver.get().findElements(By.xpath("//*[@id=\"container\"]//div[1]/label"));

//*[@id="container"]//div[1]/label
    //*[@class="control-label"]

   // Driver.get().findElement(By.xpath("//td[contains(text(),'Testers meeting')]")).click();





}




    }


