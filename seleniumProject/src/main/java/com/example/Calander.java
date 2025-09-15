package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calander {         




        public static void selectfuturedate(WebDriver driver,String year,String month,String date){
         
         while(true)
              { 
 
              String select_year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
              String select_Month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

                        
              if(select_year.equals(year) && select_Month.equals(month))
              {
                System.out.println("Ho gya");
                    break;  
              }
                
                 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
               
                }
            
           
              List<WebElement> alldates= driver.findElements(By.xpath("//tbody//tr//td//a"));
        for(WebElement dt : alldates)
        {

            if( dt.getText().equals(date))
            {
                dt.click();
                break;
            }
        }
    }    
               
     




     public static void main(String[] args){

  
          
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
      
          
        // String date= "25";
        // String month= "June";
        // String year="2030"; 

    String year="2026";
    String month="May";
    String date="30";


         selectfuturedate(driver,year,month,date);
         
     } 



 

     
    }
