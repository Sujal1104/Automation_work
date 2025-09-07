
package com.example;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertexe {
    public static void main(String[] args) {
        
         WebDriver driver= new ChromeDriver();
         driver.get("https://demo.automationtesting.in/Alerts.html");
 
          
          driver.findElement(By.cssSelector(".analystic[href=\"#OKTab\"]")).click(); 

        //   driver.findElement(By.xpath("//div[@id=\"OKTab\"]/button")).click();
  
        driver.findElement(By.xpath("//button[contains(text(),'click the button to display an')]")).click();
         
             Alert myalert = driver.switchTo().alert();
              System.out.println(myalert.getText());
              myalert.accept();
           
               
                 
               
              driver.findElement(By.xpath("//a[normalize-space()=\"Alert with OK & Cancel\"]")).click();

              driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();

              myalert.accept();

               driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();

               System.out.println(myalert.getText());
               myalert.dismiss();
            

               WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(5));
                
               mywait.until(ExpectedConditions.alertIsPresent());
           
            

              
           


    } 


}
