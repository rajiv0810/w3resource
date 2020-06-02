package w3resource.seventh;

public class Exercise66 {

	// Read a string and return the string without the first two characters
	public String exceptFirstTwo(String stng) {
		int len = stng.length();
		String temp = "";
		for (int i = 0; i < len; i++) {
			if (i == 0 && stng.charAt(i) == 'g')
				temp += 'g';
			else if (i == 1 && stng.charAt(i) == 'h')
				temp += 'h';
			else if (i > 1)
				temp += stng.charAt(i);
		}
		return temp;
	}

	public static void main(String[] args) {
		Exercise66 m = new Exercise66();
		String str1 = "ghost";
		System.out.println("The given strings is: " + str1);
		System.out.println("The new string is: " + m.exceptFirstTwo(str1));
	}
}
