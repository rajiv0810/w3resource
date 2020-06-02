package w3resource.seventh;

public class Exercise62 {

	// Read a string and return true if "good" appears starting at index 0 or 1 in
	// the given string

	public boolean hasGood(String str) {
		if (str.length() < 4)
			return false;
		else if ((str.substring(0, 4)).equals("good"))
			return true;
		else if (str.length() > 4) {
			if ((str.substring(1, 5)).equals("good"))
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Exercise62 m = new Exercise62();
		String str1 = "goodboy";

		System.out.println("The given strings is: " + str1);
		System.out.println("The 'good' appear in the string is: " + m.hasGood(str1));
	}
}
