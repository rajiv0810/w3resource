package Collections.com;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String[] args) {

		ArrayList<String> alist = new ArrayList<String>();

		alist.add("bus");
		alist.add("car");
		alist.add("bus");
		alist.add("truck");
		alist.add("cycle");
		alist.add("maruti");
		alist.add("bike");
		alist.add("bus");

		 for (String string : alist) {
			System.out.println(string);
		}

//		for (Iterator iterator = alist.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//			System.out.println(string);
//		}

	}

}
