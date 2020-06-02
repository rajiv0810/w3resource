package collections.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise2 {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<>();

		// 2. Add elements to HashSet
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("A");
		hashSet.add("D");
		hashSet.add("E");

		System.out.println(hashSet.size());
		System.out.println(hashSet.isEmpty());
//		Set set = Collections.synchronizedSet(hashSet);

		System.out.println(hashSet);

//		for (String string : hashSet) {
//			System.out.println(hashSet);
//		}

		Iterator<String> itr = hashSet.iterator();

		while (itr.hasNext()) {
//			String value = itr.next();
			System.out.println("Value: " +itr.next());
//			System.out.println("Value: " + value);
		}
		// Convert HashSet to Array Example

		String[] values = new String[hashSet.size()];
		hashSet.toArray(values);
		System.out.println(Arrays.toString(values));

		// Convert HashSet to ArrayList Example

		List<String> valuesList = hashSet.stream().collect(Collectors.toList());
		System.out.println(valuesList);

		// HashSet is equal to another object if the other object implements the Set
		// interface,has the same size(), and contains all the same elements.
		
		String elements[] = { "A", "B", "A", "D", "E" };
		Set set = new HashSet(Arrays.asList(elements));

		elements = new String[] { "B", "A", "A", "D", "E" };
		Set set2 = new HashSet(Arrays.asList(elements));

		System.out.println(set.equals(set2));
	}
}