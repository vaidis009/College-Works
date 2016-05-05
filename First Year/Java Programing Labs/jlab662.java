class Jlab662

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				12/01/15
/* Purpose : 		"Rewrite each of the programs in lab sheet 4 using methods where the method takes
 * a string as its argument and returns the appropriate value. Come up with your own names for your methods
"	Write and test a program which will prompt the user to enter their name, read in the name, and write 
to the screen just the surname. (Where surname is interpreted as everything after the first space).
"	Modify the program produced at (1) so that it writes out the first name (everything up to the first space) instead of the surname.
"	Modify the program produced in (1) so that it writes out the number of characters in the user's input.
"	Modify the program produced in (1) so that it writes out the number of uppercase characters in the user's input
	Modify the program produced in (1) so that it writes out the user's input reversed (Joe Doe is output as eoD eoJ).
"	Modify the program produced in (1) so that it writes out the user's input with the names reversed (Joe Doe is output as Doe Joe).
"	Modify the program produced in (1) so that it writes out the number of occurrences of the letter a
 in the user's input. (Treat A and a as the same character).
"	Modify the program produced in (1) so that it writes out the user's input with any middle name removed 
(Joe Handsome Doe becomes Joe Doe)

*/

{
	public static String returnFirstName(String Aname) 
		{ 
			String AfirstName ="";
	    	String surname ="" ;
	    	int space ;
	    	
			space= Aname.indexOf(" ");
	        AfirstName= Aname.substring(0,space);	
				
				
			return AfirstName;
		}
	 public static void main(String[] args) 
    
	    {
	    
	   	    String name = "" ;
	    	String firstName ;
	    	
	    	System.out.print ("Please enter your full name.");
	    	name = EasyIn.getString ();
	    	
	    
	    	firstName= returnFirstName(name);
			   
	   	
	   	    System.out.println ("Firstname  is " + firstName );
	   
	   		
	    }
	
   
    
}  