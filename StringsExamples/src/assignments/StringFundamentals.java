package assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class StringFundamentals {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("el");

		if (str1 == str2) {
			System.out.println("Equal 1");
		} else {
			System.out.println("Not Equal 1");
		}
		

		if (str1 == str3) {
			System.out.println("Equal 2");
		} else {
			System.out.println("I am constructed using constructor, hence not interned");
		}
		
		boolean eq =str1.equals(str2);
		System.out.println("print boolean for equal method :"+ eq);

		if (str1.equals(str2)) {
			System.out.println("Equal 3");
		} else {
			System.out.println("Not Equal 3");
		}
		
		System.out.println("print hash code :"+str1.hashCode());
		System.out.println("print hash code :"+str2.hashCode());
		System.out.println("print hash code :"+str3.hashCode());
		
		 System.out.println("******************");

		
		/*
		 * String strOrig = "Hello World String Array Example"; char[] stringArray;
		 * 
		 * stringArray = strOrig.toCharArray();
		 * 
		 * for (int index = 0; index < stringArray.length; index++)
		 * System.out.println(stringArray[index] );
		 */
		
		 System.out.println("******************");
		
		String strTrim = "   String Trim Example   ";
		 String strTrimmed = strTrim.trim();
		 
//		 System.out.println("Original String is: " + strTrim);
//		 System.out.println("Removed Leading and trailing space");
		 System.out.println("New String is: " + strTrimmed);
		
		 System.out.println("******************");
		
		 System.out.println("Print index of :"+ str1.indexOf(str3));
		
		System.out.println("******************");
		 
		 String str4 = "Hello World";
		  String anotherString = "hello world";
		  String objStr = str4;
		  String objnew = new String(str4);
		  
		  /* compare two strings, case sensitive */
		  System.out.println( str4.compareTo(anotherString) );
		  /* compare two strings, ignores character case  */
		  System.out.println( str4.compareToIgnoreCase(anotherString) );
		  /* compare string with object */
		  System.out.println( str4.compareTo(objnew) );
		 
		  System.out.println("******************");	  
		  
		  
		  
		    String strOrigl = "Hello World hello world";
		    
		   
		    if(strOrigl.endsWith("w")){
		      System.out.println("String ends with World");
		    }else{
		      System.out.println("String does not end with World");
		    }
		  
		    System.out.println("******************");	
		
		    
		    String strlength = "Hello World";
		    
		    //length() method of String returns the length of a String.
		    int length = strlength.length();
		    System.out.println("Length of a String is : " + length);
		  
		    
		    System.out.println("******************");
		    
		    
		    String strReplace="Replace Region";
		    System.out.println( strReplace.replace( 'R','A' ) );
		    System.out.println( strReplace.replaceFirst("Re", "Ra") );
		    System.out.println( strReplace.replaceAll("Re", "Reverse order ") );
		    
		    System.out.println("******************");
		    
		    String name="HelloWorld Program";
		    System.out.println(name.substring(6));
		    System.out.println(name.substring(0,6));
		    
		    System.out.println("******************");
		    
		    String strOriginal = "LIRil";
		    strOriginal = new StringBuffer(strOriginal).reverse().toString();
		    System.out.println("Reversed String : " + strOriginal);
		    
		    System.out.println("******************");
		    
		    String strint ="12";
		    String strfloat="12";
		    String strlong="120000000000";
		    String strdouble="1222.000322";
		    String strboolean="true";
		    
		    
		    int j=10;
		    float f = 10.0f;
		    long l = 10;
		    double d=10.0d;
		    char c='a';
		    boolean b = true;
		    Object o = new String("Hello World");
		    
		    /* convert int to String */
		    System.out.println( String.valueOf(j) );
		    
		    System.out.println( Integer.parseInt(strint) );
		    
		    /* convert float to String */
		    System.out.println( String.valueOf(f) );
		    
		    System.out.println( Float.parseFloat(strfloat) );
		    
		    /* convert long to String */
		    System.out.println( String.valueOf(l) );
		    System.out.println( Long.parseLong(strlong) );
		    
		    /* convert double to String */
		    System.out.println( String.valueOf(d) );
		    System.out.println( Double.parseDouble(strdouble) );
		    
		    /* convert char to String */
		    System.out.println( String.valueOf(c) );
		    
		    
		    /* convert boolean to String */
		    System.out.println( String.valueOf(b) );
		    System.out.println(Boolean.parseBoolean(strboolean) );
		    
		    /* convert Object to String */
		    System.out.println( String.valueOf(o) );
		    
		    System.out.println("******************");
		    
		    String strOrigls = "hello World";
		    if(strOrigls.startsWith("Hello")){
		        System.out.println("String starts with Hello");
		      }else{
		        System.out.println("String does not start with Hello");
		      }
		    
		    System.out.println("******************");
		    
		    String strcase = "STRING TO LOWERCASE EXAMPLE";
		    
		    System.out.println("upper case to lower case print : "+ strcase.toLowerCase());
		    
		    String struppercase = "Hello to uppercase example";
		    
		    System.out.println("lower case to upper case print : "+ struppercase.toUpperCase());
		    
		    System.out.println("******************");
		    
		    String strconcat = "Two thousand";
		    String StrConcatinated = " and three hundred";
		    String strConcat = strconcat.concat(StrConcatinated);
		    System.out.println("Concatination of two string :"+ strConcat);
		    
		    System.out.println("******************");
		    
		  String  strcontainVar = "Hello World";
		  String  strcontainInput="Hello ";  
		    
		    System.out.println("Print contain method : " + strcontainVar.contains(strcontainInput));   //case sensitive
		    
		    System.out.println("******************");
		    
		    String strIsEmpty= "";
		    String strIsNull = null;
		    String strValue = "Hello World";
		    
		    System.out.println("Is String 1 empty? :" + strIsEmpty.isEmpty());
//		    System.out.println("Is String 3 empty? :" + strIsNull.isEmpty());
		    System.out.println("Is String 3 empty? :" + strValue.isEmpty());
		    
		    System.out.println("******************");
		    
		    String strNumbers = "12345";
		    String[] strValues = strNumbers.split("|");    //we are separating the string with delimiter.
		    ArrayList<String> aListNumbers = new ArrayList<String>(Arrays.asList(strValues));
		    System.out.println("Java String converted to ArrayList: " + aListNumbers);
	 
		    System.out.println("******************");
		    
		    String strByteConvert = "Hello World";
//		    byte[] bytes = strByteConvert.getBytes();
		    System.out.println("String to byte convert : "+ strByteConvert.getBytes());
		    
		    System.out.println("******************");
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    

		String[] str = new String[] { "10.20", "123456", "12.invalid" };

		for (int i = 0; i < str.length; i++) {

			if (str[i].indexOf(".") > 0) {

				try {
					
					Double.parseDouble(str[i]);
					System.out.println(str[i] + " is a valid decimal number");
				} catch (NumberFormatException nme) {
					System.out.println(str[i] + " is not a valid decimal number");
				}

			} else {
				try {

					Integer.parseInt(str[i]);
					System.out.println(str[i] + " is valid integer number");
				} catch (NumberFormatException nme) {
					System.out.println(str[i] + " is not a valid integer number");
				}
			}
		}

	}
}
