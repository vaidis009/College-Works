package Lab12;

import java.util.*;
public class Ex2ArrayList 
{
	public static void main(String args[])
	{
		// create an array list
		ArrayList<String> Alist = new ArrayList<String>();
		System.out.println("Initial size of the ArrayList is: " + Alist.size());
		// add elements to the array list
		Alist.add("Apples");
		Alist.add("Oranges");
		Alist.add("Pears");
		Alist.add("Bananas");
		Alist.add("Kiwis");
		Alist.add("Pineapples");
		//Add nectarines to position 1
		Alist.add(1, "Nectarines");
		System.out.println("Size of the ArrayList after adding items: " +Alist.size());
		// display the array list
		System.out.println("Contents of al: " +Alist);
		// Remove elements from the array list
		Alist.remove("Kiwis");
		//Remove 3rd item in list
		Alist.remove(2);
		System.out.println("Size of the ArrayList after deletions: " + Alist.size());
		System.out.println("Contents of al: " + Alist);
	}
}
