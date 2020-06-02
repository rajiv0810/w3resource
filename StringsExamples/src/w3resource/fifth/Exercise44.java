package w3resource.fifth;

public class Exercise44 {

	// Reverse a string using recursion

	void reverseString(String str1) {
		
		if ((str1 == null) || (str1.length() <= 1))
			System.out.println(str1);
		else {
			System.out.print(str1.charAt(str1.length() - 1));
			reverseString(str1.substring(0, str1.length() - 1));
		}
	}

	public static void main(String[] args) {
		String str1 = "The quick brown fox jumps";
		System.out.println("The given string is: " + str1);
		System.out.println("The string in reverse order is:");
		Exercise44 obj = new Exercise44();
		obj.reverseString(str1);
	}
}
