package assignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

public class DateCal {

	public static void main(String[] args) {

		String[] strDate = { "01-01-2020", "01-01-2015", "01-01-2012", "01-01-2010", "01-01-2018", "01-01-2020",
				"01-01-2019", "01-01-2001", "01-01-2010" };

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {

			int i;
			String x;
//			Date date = null;

			for (i = 0; i < strDate.length; i++) {

//				x = strDate[i];
//				System.out.print("Print Array after loop : " + x);

				Date date = sdf.parse(strDate[i]);

				Calendar now2 = Calendar.getInstance();
				now2.setTime(date);
				
				Calendar now = Calendar.getInstance();
				now.setTime(date);

				System.out.println(" String Array converted to Date : " + date);
				System.out.println(" Date converted to Calender obj  : " + now2);
				
				if (now.after(now2)) {
					System.out.println("After Method : " + now);
				}
				if (now.before(now2)) {
					System.out.println("Before Method : " + now2);
				}
			}
		} catch (ParseException e) {
			System.out.println("Java String could not be converted to Date: " + e);
		}

		/*
		 * min = strDate[0]; for (int i = 0; i < strDate.length; i++) { if (strDate[i] <
		 * min) min = strDate[i]; }
		 * System.out.println("Smallest element present in given array: " + min);
		 */
		

	}
}
