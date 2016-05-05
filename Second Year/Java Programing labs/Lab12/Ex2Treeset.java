package Lab12;

import java.util.TreeSet;



public class Ex2Treeset
{
	public static void main (String args[])
	{
		TreeSet<String> theTree = new TreeSet<String>();
		//Adding to the Hashset
		theTree.add("apples");
		theTree.add("oranges");
		theTree.add("pears");
		theTree.add("bananas");
		theTree.add("kiwis");
		theTree.add( "Nectarines");
		System.out.println("Size of the Tree Set after adding items: " + theTree.size());
		System.out.println("Contents of the  Tree Set: " + theTree);
		theTree.remove("kiwis");
		//Remove 3rd item in list
		
		System.out.println("Size of the  Tree Set after deletions: " +  theTree.size());
		System.out.println("Contents of Tree Set: " +  theTree);
		System.out.println("Does the list contain apples ? " +theTree.contains("apples"));
		System.out.println("The first item in the list is : " +theTree.first());
		System.out.println("The last item in the list is : " +theTree.last());
	}
}