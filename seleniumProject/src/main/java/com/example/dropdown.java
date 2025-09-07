package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
    public static void main(String[] args) {
         
 
         WebDriver driver =new ChromeDriver();
 

          driver.navigate().to("https://testautomationpractice.blogspot.com/"); 
           

           WebElement select =driver.findElement(By.xpath("//select[@id='country']"));

           Select drpcounty =new Select(select);
            drpcounty.selectByVisibleText("Japan");
            
             
             
           List<WebElement>  options= drpcounty.getOptions();

           System.out.println("Number of options : " + options.size());


            
           for (int i=0;i<options.size();i++)
           {

            System.out.println( options.get(i).getText());
           }

            
               for (WebElement webElement : options) {
                  System.out.println("===============");
                System.out.println(webElement.getText());
               }
        



    } 

}
