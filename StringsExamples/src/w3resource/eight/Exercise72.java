package w3resource.eight;

public class Exercise72 {

	// Return true if a given string contain the string 'pop', but the middle 'o'
	// also may other character
	public boolean popInTheString(String stng) {
		int len = stng.length();
		for (int i = 0; i < len - 2; i++) {
			if (stng.charAt(i) == 'p' && stng.charAt(i + 2) == 'p')
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Exercise72 m = new Exercise72();
		String str1 = "dikchapop";
		System.out.println("The given string is: " + str1);
		System.out.println("Is p?p appear in the given string? " + m.popInTheString(str1));
	}
}
