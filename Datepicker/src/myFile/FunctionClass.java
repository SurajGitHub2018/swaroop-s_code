package myFile;

import java.util.List;

import org.openqa.selenium.WebElement;

public class FunctionClass {
	
	
	String takedate1="",takemonth1="",takeyear1="";
	
	public FunctionClass(String givendate)
	{
		// TODO Auto-generated method stub
				String takedate="",takemonth="",takeyear="";
				String datafor=givendate;
				String[]datavalue=datafor.split("-");
				for(int i=0;i<datavalue.length;i++) 
				{
					if(i==0)
					{
						this.takedate1=datavalue[i];
					}
					if(i==1)
					{
						this.takemonth1=datavalue[i];
					}
					if(i==2)
					{
						this.takeyear1=datavalue[i];
					}
				}
				System.out.println("Date"+takedate);
				
				System.out.println("Month"+takemonth);
				  
				System.out.println("Year"+takeyear);
		
	}
	
	public String takedate()
	{
		return this.takedate1;
	}
	public String takemonth()
	{
		return this.takemonth1;
	}
	public String takeyear()
	{
		return this.takeyear1;
	}

}
