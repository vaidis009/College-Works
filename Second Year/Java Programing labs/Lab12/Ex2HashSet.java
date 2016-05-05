package Lab12;

import java.util.HashSet;

public class Ex2HashSet
{
	public static void main (String args[])
	{
		HashSet<String> theHash = new HashSet<String>();
		//Adding to the Hashset
		 theHash.add("apples");
		 theHash.add("oranges");
		 theHash.add("pears");
		 theHash.add("bananas");
		 theHash.add("kiwis");
		 theHash.add( "Nectarines");
		System.out.println("Size of the Hash Set after adding items: " + theHash.size());
		System.out.println("Contents of the  Hash Set: " + theHash);
		 theHash.remove("kiwis");
		//Remove 3rd item in list
		
		System.out.println("Size of the  Hash Sett after deletions: " +  theHash.size());
		System.out.println("Contents of al: " +  theHash);
	}
}
