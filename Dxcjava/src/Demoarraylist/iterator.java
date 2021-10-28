package Demoarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Pineapple");
		Iterator itr = fruits.iterator();
		  while(itr.hasNext()){//check if iterator has the elements  

		System.out.println(itr.next());

	}
}
}