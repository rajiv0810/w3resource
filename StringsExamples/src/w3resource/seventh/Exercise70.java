package w3resource.seventh;

public class Exercise70 {

	// Check whether a string is pq-balanced or not
	public boolean pqBalanceString(String stng) {
		Boolean p = false;
		Boolean q = false;
		int len = stng.length();
		for (int i = 0; i < len; i++) {
			if (stng.charAt(i) == 'p' && q == true) {
				p = true;
				q = false;
			} else if (stng.charAt(i) == 'p') {
				p = true;
			}
			if (stng.charAt(i) == 'q' && p == true)
				q = true;
		}
		if (p == false)
			q = true;
		return q;
	}

	public static void main(String[] args) {
		Exercise70 m = new Exercise70();
		String str1 = "gfpmpnppqab";
		System.out.println("The given strings is: " + str1);
		System.out.println("The string is pq-balanced? " + m.pqBalanceString(str1));
	}
}
