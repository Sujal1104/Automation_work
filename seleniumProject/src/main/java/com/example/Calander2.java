package com.example;
import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calander2{ 
            
     public static Month convertmonthobject( String month)
     {
          HashMap <String ,Month> monthmap  =new HashMap< String, Month>();     
          monthmap.put("Jan", Month.JANUARY);
          monthmap.put("Fab", Month.FEBRUARY);
          monthmap.put("Mar", Month.MARCH);
          monthmap.put("Apr", Month.APRIL);
          monthmap.put("May", Month.MAY);
          monthmap.put("Jun", Month.JUNE);
          monthmap.put("Jul", Month.JULY);
          monthmap.put("Aug", Month.AUGUST);
          monthmap.put("sup", Month.SEPTEMBER);
          monthmap.put("Oct", Month.OCTOBER);
          monthmap.put("Nov", Month.NOVEMBER);
          monthmap.put("Dec", Month.DECEMBER);
           
      
          Month getmonth =monthmap.get(month);           
          if(getmonth == null){
            System.out.println("Month j nathi");
          } 
          return getmonth;
     } 
      
      


     public static void main(String[] args){
         
        
        WebDriver driver =new ChromeDriver();
        
        driver.navigate().to("https://testautomationpractice.blogspot.com/"); 
        driver.findElement(By.xpath("//input[@id='txtDate']")).click(); 
          
 
         
          String requiredyear= "2015";
          String requiredmonth= "Jan";     
          String requiredate="15";
          
          WebElement yeardropdown=   driver.findElement(By.xpath("//select[@aria-label='Select year']")); 
          // WebElement Monthdropdown= driver.findElement();  
          
          Select newsSelectyear =new Select(yeardropdown);
          newsSelectyear.selectByVisibleText(requiredyear); 
            
           
   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

   WebElement Waitm= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@aria-label='Select month']")));


          Select newsSelectmonth =new Select(Waitm);
          newsSelectmonth.selectByVisibleText(requiredmonth.trim());
     

     while(true)
          {
           String DisplayedMont= driver.findElement(By.xpath("//select[@aria-label='Select month']//option[@selected=\"selected\"]")).getText();      
           Month ExpectedMonth =convertmonthobject(requiredmonth);
           Month ActualMonth=convertmonthobject(DisplayedMont);
           
            int result =ExpectedMonth.compareTo(ActualMonth);

           if(result > 0)      // 
           
           {
 

               driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();


           }
             else if(result < 0)
           {
         driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();

           }
           else
           {
          break;               
            }

}

 

  List<WebElement> datepick =driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
  

   for(WebElement dt:datepick )
   {
 
     if(dt.getText().equals(requiredate)){

          dt.click();
          break;
     }

      
   }
           
           
           

            
 
        
         
            

          
           







         
         
         





     }
     
     
     
}
