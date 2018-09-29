package myFile;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepickers {
	
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	    	FunctionClass FClass;
	    	String datevalue="",Monthvalue="",yearvalue="";
		   /* Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		 
	        //Get Current Day as a number
	        int todayInt = calendar.get(Calendar.DAY_OF_MONTH);
	        System.out.println("Today Int: " + todayInt +"\n");
	 
	        //Integer to String Conversion
	        String todayStr = Integer.toString(todayInt);
	        System.out.println("Today Str: " + todayStr + "\n");*/
		
		
		   /* FirefoxDriver driver= new FirefoxDriver();

			driver.get("https://www.reliancegeneral.co.in/Insurance/Travel-Insurance/Overseas-Travel-Insurance.aspx");
		    //driver.navigate().to("https://www.reliancegeneral.co.in/Insurance/Travel-Insurance/Overseas-Travel-Insurance.aspx");
	        driver.manage().window().maximize();*/
		
		
		//This code id for spiliting the date eg=14-sep-2018
		 
		
		 
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open facebook
		driver.get("https://www.reliancegeneral.co.in/Insurance/Travel-Insurance/Overseas-Travel-Insurance.aspx");
		// Maximize browser 
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"ctl00_ctl45_g_d156e5bd_3bbe_45b1_b7dd_a87f6529507a_ctl00_txtTravelDateofBirth\"]")).click();
		
		//Taking Date which we have to select
		 FClass=new FunctionClass("24-Apr-1995");
		 datevalue=FClass.takedate();
		 Monthvalue=FClass.takemonth();
		 yearvalue=FClass.takeyear();
		 System.out.println("datevalue"+datevalue+"       "+Monthvalue+"      "+yearvalue+"        ");
		
		
		//Arrow Button Left Side 
		//*[@id="ui-datepicker-div"]/div/a[1]
		WebElement LeftTriangle=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]"));
		
		
		//Arrow Button Right Side 
		
		//*[@id="ui-datepicker-div"]/div/a[2]
		WebElement rightTriangle=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]"));
		
		
		//select Option value 
		//Select for Year
		WebElement selectElementYearMonth = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
		System.out.println("Select Value Are"+selectElementYearMonth);
		Select YearMonthSelect = new Select(selectElementYearMonth);
		List<WebElement> allYearMonthsOptions = YearMonthSelect.getOptions();
		 // Loop to print one by one
		
		for(WebElement yearMonthoption : allYearMonthsOptions)
		{
	        if(yearMonthoption.getText().equalsIgnoreCase(Monthvalue))
	        {
	        	yearMonthoption.click();
	            break;
	        }
	        else
	        {
	        	System.out.println("You have Entered Wrong Month Its Should Be From Given Below"+Monthvalue);
	        	System.out.println(yearMonthoption.getText());
	        }
	    }
		  
	    
    	//select Option value 
  		//Select for Year
  		WebElement selectElementYear = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
  		System.out.println("Select Value Are"+selectElementYear);
  		Select selectyear = new Select(selectElementYear);
  		List<WebElement> allYearOptions = selectyear.getOptions();
  		
  		// Loop to print one by one
  	    /*for (int j = 0; j < allYearOptions.size(); j++)
  	    {
  	        System.out.println(allYearOptions.get(j).getText());
  	    }
  	    */
  	    
  		for(WebElement yearoption : allYearOptions)
		{
  		  	System.out.println(yearoption.getText());
	        if(yearoption.getText().equals(yearvalue))
	        {
	        	yearoption.click();
	            break;
	        }
	    }
	    
	    
	    //This code For Fetching Data from table
  		
  		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:allDates)
		{
			
			String date=ele.getText();
			
			if(date.equalsIgnoreCase(datevalue))
			{
				ele.click();
				break;
			}
			
		}
		
		Thread.sleep(5000);
		driver.close();
}
}
