package w3resource.seventh;

public class Exercise67 {

	// Read a string and if one or both of the first two characters is 'x', return
	// without those 'x',
	// otherwise return the string unchanged

	public String exceptTwoO(String stng) {
		String temp = "";
		for (int i = 0; i < stng.length(); i++) {
			if (i == 0 && stng.charAt(i) != 'x')
				temp += stng.charAt(i);
			else if (i == 1 && stng.charAt(i) != 'x')
				temp += stng.charAt(i);
			else if (i > 1)
				temp += stng.charAt(i);
		}
		return temp;
	}

	public static void main(String[] args) {
		Exercise67 m = new Exercise67();
		String str1 = "xxcyte";
		System.out.println("The given strings is: " + str1);
		System.out.println("The new string is: " + m.exceptTwoO(str1));
	}
}
