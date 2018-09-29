package myFile;

public class Checkcode {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String takedate="",takemonth="",takeyear="";
		String datafor="14-Jan-2018";
		String[]datavalue=datafor.split("-");
		for(int i=0;i<datavalue.length;i++) 
		{
			if(i==0)
			{
				takedate=datavalue[i];
			}
			if(i==1)
			{
				takemonth=datavalue[i];
			}
			if(i==2)
			{
				takeyear=datavalue[i];
			}
		}
		System.out.println("Date"+takedate);
		
		System.out.println("Month"+takemonth);
		  
		System.out.println("Year"+takeyear);
		//return datavalue;

	}

}
