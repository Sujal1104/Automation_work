package com.example;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox{
    public static void main(String[] args) {
        
      WebDriver driver = new ChromeDriver(); 
      driver.get("https://testautomationpractice.blogspot.com/");
  
        
       List<WebElement> checkboxs=driver.findElements(By.xpath("//input[@class =\"form-check-input\" and @type=\"checkbox\"]"));

        

        // for(int i=0;i<checkboxs.size();i++)
        // {
        //   checkboxs.get(i).click();
        // }
          
        // for(WebElement CheckBox : checkboxs)
        // { 
        //   // Thread.sleep(5);
        //   CheckBox.click();
        // }
 
         

        for(int i=checkboxs.size()-4;i<checkboxs.size();i++)
        {  
           checkboxs.get(i).click();
        }

     
         
  
   



    }
 


}