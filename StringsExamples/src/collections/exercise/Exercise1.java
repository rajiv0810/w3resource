package collections.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Exercise1 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);

		for (String vehicles : cars) {
			System.out.println("Print names: " + vehicles);
		}

		List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println("Print numbers :" + numbers);

		for (int num : numbers) {
			System.out.println("Print names: " + num);
		}

		List<String> names = new ArrayList<>();
		names.add("lokesh");
		names.add("alex");
		names.set(1, "brian");

		names.remove(1);
		System.out.println("Print names: " + names);

		for (String string : names) {
			System.out.println("Print names: " + string);
		}

		ArrayList<Integer> digits = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

		Iterator<Integer> iterator = digits.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
		arrlist.add(12);
		arrlist.add(20);
		arrlist.add(45);
		System.out.println("Printing list1:");
		for (Integer number : arrlist) {
			System.out.println("Number = " + number);
		}

		ArrayList<Integer> arrlist2 = new ArrayList<Integer>(5);
		arrlist2.add(25);
		arrlist2.add(30);
		arrlist2.add(31);
		arrlist2.add(35);

		System.out.println("Printing list2:");
		for (Integer number : arrlist2) {
			System.out.println("Number = " + number);
		}

		arrlist.addAll(arrlist2);

		System.out.println("Printing all the elements");
		for (Integer number : arrlist) {
			System.out.println("Number = " + number);
		}

	}
//sysnc
	//array  arraylist
	//own class for int and string
	// arraylist add
	// hashset in java
	//diff between 
	//hashmap
	//google worksheet
	//in local
	//eclipse
	//vscode
	//git  -- 
	//inteliji
	//another project
	//java practice
	//options
	//write from scratch
	//node to java
	//vdi delta
	//non delta
	//
	
}
