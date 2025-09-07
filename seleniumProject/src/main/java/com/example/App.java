package com.example;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.degrees;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // driver.get("https://testautomationpractice.blogspot.com/");
        // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); 
        //     //    WebElement Username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        //     //    Username.sendKeys("Admin");
        //     //    WebElement Password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        //     //    Password.sendKeys("admin123");  
        //     driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("sujal");
        //     driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("sujal@gmail.com");
        //     driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("sujal");  

        //     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']"))).click();        
             
      //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
        //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

          
        //  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //  driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
        //  driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
        //  WebElement cca=driver.findElement(By.xpath("//button[normalize-space()='Login']")); 
        //  cca.click();
        //  driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("sujal");  
        // driver.close();
          

         
                
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 
              
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
         

        
        WebElement Id= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        Id.sendKeys("Admin");
        WebElement pw= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
        pw.sendKeys("admin123");
    
         
        driver.findElement(By.xpath("//button[@type='submit']")).click();
         
            
                
 
      
    



         
          





             


          

         
    }
}
