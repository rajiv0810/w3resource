package w3resource.sixth;

public class Exercise59 {
	// Read a string,if the string begins with "red" or "black" return that color
	// string, otherwise return the empty string
	public String pickColor(String str) {
		if (str.startsWith("red"))
			return "red";
		if (str.startsWith("black"))
			return "black";
		else
			return "";
	}

	public static void main(String[] args) {
		Exercise59 m = new Exercise59();
		String str1 = "blacksea";
		System.out.println("The given strings is: " + str1);
		System.out.println("The string begins with the color: " + m.pickColor(str1));
	}

}
