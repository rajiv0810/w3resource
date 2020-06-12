package assignments;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringFundementalsDates {
	public static void main(String[] args) {

		String strDate = "08/30/2011";
		try {

//			 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

//			 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

			Date date = sdf.parse(strDate);

			System.out.println("Date is: " + date);

		} catch (ParseException e) {
			System.out.println("Java String could not be converted to Date: " + e);
		}

		System.out.println("******************");

		Date currentDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//		    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
//		    SimpleDateFormat formatter = new SimpleDateFormat("MM-DD-YYYY hh:mm:ss"); 

		System.out.println("******************");

//		    DateFormat currentDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
//		    System.out.println("Current Date with time : " + currentDateFormat);  

		NumberFormat strDateFormat = formatter.getNumberFormat();
		System.out.println("Number format : " + strDateFormat.getMaximumIntegerDigits());

		System.out.println("******************");
		Date date = new Date();

		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");

		String strDateFormats = dateFormat.format(date);

		System.out.println("Date converted to String: " + strDateFormats);

		System.out.println("******************");

		 currentDate = new Date();
		System.out.println("Current date is: " + currentDate);

		System.out.println("******************");

		String dateShort = DateFormat.getDateInstance(DateFormat.SHORT).format(currentDate);
		System.out.println("Formatting the Date using DateFormat.SHORT: " + dateShort);

		System.out.println("******************");

		String dateMedium = DateFormat.getDateInstance(DateFormat.MEDIUM).format(currentDate);
		System.out.println("Formatting the Date using DateFormat.MEDIUM: " + dateMedium);

		System.out.println("******************");

		String dateLong = DateFormat.getDateInstance(DateFormat.LONG).format(currentDate);
		System.out.println("Formatting the Date using DateFormat.LONG: " + dateLong);

		System.out.println("******************");

		String timeShort = DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);
		System.out.println("Formatting the Time using DateFormat.SHORT: " + timeShort);

		System.out.println("******************");

		String timeMedium = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);
		System.out.println("Formatting the Time using DateFormat.MEDIUM: " + timeMedium);

		System.out.println("******************");

		String timeLong = DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);
		System.out.println("Formatting the Time using DateFormat.LONG: " + timeLong);

		System.out.println("******************");

		/*
		 * String Date = "2011-12-31 00:00:00";
		 * 
		 * 
		 * To convert String to java.sql.Date, use Date (long date) constructor.
		 * 
		 * It creates java.sql.Date object from the milliseconds provided.
		 * 
		 * 
		 * //first convert string to java.util.Date object using SimpleDateFormat
		 * SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); try {
		 * java.util.Date dates = sdf.parse(Date); } catch (ParseException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * java.sql.Date sqlDate = (java.sql.Date) new Date(date.getTime());
		 * 
		 * System.out.println("String converted to java.sql.Date :" + sqlDate);
		 */

	}
}
