package w3resource.seventh;

public class Exercise64 {

	// Read a string and if a substring of length two appears at both its beginning
	// and end, return a
	// string without the substring at the beginning otherwise, return the original
	// string unchanged

	public String withoutMacth(String str) {
		int len = str.length();
		if (len == 2)
			return "";
		if (len < 2)
			return str;
		else {
			if (str.substring(0, 2).equals(str.substring(len - 2, len)))
				return str.substring(2, len);
			else
				return str;
		}
	}

	public static void main(String[] args) {
		Exercise64 m = new Exercise64();
		String str1 = "educated";

		System.out.println("The given strings is: " + str1);
		System.out.println("The new string is: " + m.withoutMacth(str1));
	}
}
