package w3resource.sixth;

public class Exercise57 {

	// Return a new string where the last two characters of a given string, if
	// present, are swapped
	public String lastTwo(String str) {
		if (str.length() < 2)
			return str;
		return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
	}

	public static void main(String[] args) {
		Exercise57 m = new Exercise57();
		String str1 = "string";
		System.out.println("The given strings is: " + str1);
		System.out.println("The string after swap last two characters are: " + m.lastTwo(str1));
	}
}
