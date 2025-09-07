package com.example;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_nav {
    public static void main(String[] args) {
         
         
        WebDriver driver=new ChromeDriver();
   
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
         
        // driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        // driver.navigate().to("https://www.automationexercise.com/");
         
         
        //  driver.navigate().back();
        //  System.out.println(driver.getCurrentUrl());
        //  driver.navigate().forward();
        //  driver.navigate().back();
        //  System.out.println(driver.getCurrentUrl());
        //  driver.navigate().forward();
        //  System.out.println(driver.getCurrentUrl());
        //  driver.navigate().back();
        //  System.out.println(driver.getCurrentUrl());
        //  driver.navigate().refresh();
        //  System.out.println(driver.getCurrentUrl()); 
          
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); 
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
 

         Set <String>WindowId=driver.getWindowHandles();
   
          List<String> Windowsl=new ArrayList(WindowId);

         String pID=Windowsl.get(0);
         String cID=Windowsl.get(1);
         driver.switchTo().window(cID);
         System.out.println(driver.getTitle());
         driver.switchTo().window(pID);
         System.out.println(driver.getTitle());



         

         

         
         
         


          
        

          

         
         
         
        
          
          

         
         
         
         
    }
     
     
}
