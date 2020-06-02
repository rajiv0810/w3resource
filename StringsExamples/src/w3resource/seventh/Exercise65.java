package w3resource.seventh;

public class Exercise65 {

	// Read a string and if the first or last characters are 't', return the string
	// without those 't'
	// otherwise return the string unchanged

	public String excludeT(String stng) {
		if (stng.length() == 0)
			return stng;
		if (stng.length() == 1) {
			if (stng.charAt(0) == 't')
				return "";
			else
				return stng;
		}
		if (stng.charAt(0) == 't')
			stng = stng.substring(1, stng.length());
		if (stng.charAt(stng.length() - 1) == 't')
			stng = stng.substring(0, stng.length() - 1);
		return stng;
	}

	public static void main(String[] args) {
		Exercise65 m = new Exercise65();
		String str1 = "testcricket";
		System.out.println("The given strings is: " + str1);
		System.out.println("The new string is: " + m.excludeT(str1));
	}
}
