package w3resource.sixth;

public class Exercise58 {

	// Read a string and return true if it ends in "ng"

	public boolean endsNg(String str) {
		int len = str.length();
		String ng = "ng";
		if (len < 2)
			return false;
		else if (ng.equals(str.substring(len - 2, len)))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Exercise58 m = new Exercise58();
		String str1 = "string";
		System.out.println("The given strings is: " + str1);
		System.out.println("The string containing ng at last: " + m.endsNg(str1));
	}
}
