package assignments;

public class StringsExercises {
	
	public static void main(String args[]) {
	      char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
	      String helloString = new String(helloArray);  
	      System.out.println( helloString );
	      
	      
	      String str1 = " Hello World,this,is,one,example ";
	      
	       
	     
	      
	      String str2 = new String("hello");
	      String str3 = new String("World");
	      
	      int result = str1.compareTo( str2 );
	      System.out.println(result);
	      
	      result = str2.compareTo( str3 );
	      System.out.println(result);
	      
	      
	      int compareToIgnoreCaseResults = str1.compareToIgnoreCase( str2 );
	      System.out.println("Print compareToIgnoreCase :"+ compareToIgnoreCaseResults);
	      
	      int compareToResults = str1.compareTo(str2);
	      System.out.println("Print compareToResults :"+ compareToResults);
	      
	      System.out.println("Print index of :"+ str1.indexOf(str3));
	      
	     System.out.println("split :"+ str1.split(" ").toString());
	     
	     System.out.println("Print str1 lenght : " + str1.length());
	     
	     String stringsplit =" String Trim Example ";
	     String splitStr[]= str1.split(",");
	     System.out.println("print with trim method : "+stringsplit.trim());
	     
	     for (int i = 0; i < splitStr.length; i++) {
	    	  System.out.println("split string : "+ splitStr[i] + " : " + i);
	    	}
	      
	      System.out.println("print substring : "+str1.substring(2, 20));
	      
	      boolean equalsIgnoreCaseResult = str1.equalsIgnoreCase(str2);
	      System.out.println("Pirnt equals Ignore case : "+equalsIgnoreCaseResult);
//	      result = str2.compareToIgnoreCase( str3 );
//	      System.out.println(results);

//	      result = str3.compareToIgnoreCase( str1 );
//	      System.out.println(results);
	      
	      
		/*
		 * String s = " java functions  "; System.out.println(s.trim());
		 * 
		 * 
		 * String Str = new String("Welcome"); System.out.print("substring : ");
		 * System.out.println(Str.substring(3));
		 */
	      
	      
	   }

}
