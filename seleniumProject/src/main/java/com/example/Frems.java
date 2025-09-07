package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frems {
     
    public static void main(String[] args) {
      
       WebDriver driver =new ChromeDriver();

 
       driver.navigate().to("https://ui.vision/demo/webtest/frames/");
       
     WebElement frams1=driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));

     
          driver.switchTo().frame(frams1);
          driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("satara");
 
           driver.switchTo().defaultContent();
           WebElement frame2= driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
         driver.switchTo().frame(frame2);

          driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("sujal"); 
           

           driver.switchTo().defaultContent();

           WebElement fram3=driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
           driver.switchTo().frame(fram3);
            

           driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("aba daba jaba");
           driver.switchTo().frame(0);
           driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']")).click();

    } 

}
