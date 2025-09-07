package com.example;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
  
     
 public static void main(String[] args) {
    
 
     
     WebDriver driver = new ChromeDriver();
     driver.get("https://testautomationpractice.blogspot.com/");
      
        WebElement InputBox= driver.findElement(By.className("wikipedia-search-input"));          
         InputBox.sendKeys("s"); 
         driver.findElement(By.xpath( "//input[@type='submit']")).click();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 

         List<WebElement> links=driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link' or @id='Wikipedia1_wikipedia-search-more']//a"));
         System.out.println(links.size()); 
           

         for (WebElement link : links)
         {
            link.click();  
            System.out.println( link.getText() + "- >" + link.getAttribute("href")); 
         } 
          
           Set<String> Windowh = driver.getWindowHandles();
           
           System.out.println("Window open :" + Windowh.size());
            
           for(String handle : Windowh)
           {
            // System.out.println("WindowId :"+ handle); 
  
              
            System.out.println("++++ Get the Window Title ++++");
              
          driver.switchTo().window(handle);

          System.out.println("Swich to handle :: ===>" + driver.getTitle());
             
           }
           

 
          
          
          
         

           
   

       






 }



     


  


     
}
