package w3resource.eight;

public class Exercise73 {
//Return true if the given string contains an appearance of 'abc' but not directly a period(.)

	public Boolean abcBeforePeriod(String stng) {
		int len = stng.length();
		String abc = "abc";
		Boolean match = false;
		if (len < 3)
			return false;
		for (int i = 0; i < len - 2; i++) {
			String temp = stng.substring(i, i + 3);
			if (temp.compareTo(abc) == 0 && i == 0)
				match = true;
			else if (temp.compareTo(abc) == 0 && stng.charAt(i - 1) != 46)
				match = true;
		}
		return match;
	}

	public static void main(String[] args) {
		Exercise73 m = new Exercise73();
		String str1 = "testabc.test";
		System.out.println("The given string is: " + str1);
		System.out.println("Is 'abc' appear before period? " + m.abcBeforePeriod(str1));
	}
}
