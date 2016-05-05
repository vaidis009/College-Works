package Lab12;
import java.util.*;

public class Ex2LinkedList
{
	public static void main (String args[])
	{
		LinkedList<String> theList = new LinkedList<String>();
		theList.add("apples");
		theList.add("oranges");
		theList.add("pears");
		theList.add("bananas");
		theList.add("kiwis");
		theList.add(1, "Nectarines");
		System.out.println("Size of the LinkedList after adding items: " +theList.size());
		System.out.println("Contents of the LinkedList: " +theList);
		theList.remove("Kiwis");
		//Remove 3rd item in list
		theList.remove(2);
		System.out.println("Size of the ArrayList after deletions: " + theList.size());
		System.out.println("Contents of al: " + theList);
	}
}
