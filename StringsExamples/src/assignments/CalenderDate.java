package assignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderDate {
	public static void main(String[] args) {
		
		String dateString = "01-01-2020";
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		
		Date date = null;
		try {
			date = sdf.parse(dateString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Date is: " + date);
		
		 Calendar now = Calendar.getInstance();
		 now.setTime(date);
		 
		 String dateStringJune = "06-06-2020";
		 
		 try {
			date = sdf.parse(dateStringJune);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Calendar now2 = Calendar.getInstance();
		 now2.setTime(date);
		 
		 if (now.after(now2)) {
			System.out.println("After Method : "+ now);
		}
		 if (now.before(now2)) {
			 System.out.println("Before Method : "+ now2);
		}
		 
		 System.out.println("Current date : " + (now.get(Calendar.MONTH) + 1) + "-" + (now.get(Calendar.DATE)) + "-"  + now.get(Calendar.YEAR));
		 
		 System.out.println("*****************************");
		 
		 now.add(Calendar.DATE,1);
		 
		    System.out.println("date after one day : " + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-"  + now.get(Calendar.YEAR));
		  
		    System.out.println("*****************************");
		    
		    
		    now = Calendar.getInstance();
		    now.add(Calendar.DATE, -10);
		 
		    System.out.println("date before 10 days : " + (now.get(Calendar.MONTH) + 1)	+ "-" + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));
		 
		    System.out.println("Current time : " + now.get(Calendar.HOUR_OF_DAY)  + ":" + now.get(Calendar.MINUTE) + ":"  + now.get(Calendar.SECOND));
		    
		    
		  System.out.println("New time after adding 10 hours : "  + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND));
		    
		  System.out.println("New date after adding 10 hours : " + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));  
		    
		  System.out.println("*****************************");  
		  
		   //substract hours from current date using Calendar.add method
		    now.add(Calendar.HOUR, -3);
		 
		    System.out.println("Time before 3 hours : " + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND));
		 
		    System.out.println("*****************************");
		    
		    //add minutes to current date using Calendar.add method
		    now.add(Calendar.MINUTE,20);
		 
		   System.out.println("New time after adding 20 minutes : " + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND));
		   
		   System.out.println("*****************************");
		   
		   now.add(Calendar.MINUTE,-50);
			 
		   System.out.println("New time after adding 50 minutes : " + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND));
		   
		   System.out.println("*****************************");
		   
		   now.add(Calendar.MONTH,10);
		   System.out.println("date before 10 months : " + (now.get(Calendar.MONTH) + 1)	+ "-" + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR));
		   
		   
	}

}
