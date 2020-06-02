package w3resource.seventh;

public class Exercise69 {
//	Return the substring that is between the first and last appearance of the substring 'toast' in the given string, 
	// or return the empty string if substirng 'toast' does not exists

	public String pickMiddleOfBread(String stng) {
		int len = stng.length();
		String tmpString = "";
		String resultString = "";
		int st = 0;
		int en = 0;
		boolean found = false;
		if (len <= 10)
			return "";
		for (int i = 0; i < len - 4; i++) {
			tmpString = stng.substring(i, i + 5);
			if (tmpString.equals("toast") && found == true)
				en = i;
			if (tmpString.equals("toast") && found == false) {
				st = i + 5;
				found = true;
			}
		}
		resultString = stng.substring(st, en);
		return resultString;
	}

	public static void main(String[] args) {
		Exercise69 m = new Exercise69();
		String str1 = "sweettoastbuttertoast";
		System.out.println("The given strings is: " + str1);
		System.out.println("The new string is: " + m.pickMiddleOfBread(str1));
	}

}
