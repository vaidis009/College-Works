class Jlab46

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 		Modify the program produced in (1) so that it writes out the user's input with 
 *the names reversed (Joe Doe is output as Doe Joe).
 */

{
    public static void main(String[] args) 
    
    {
    	String name = " " ;
      	String firstName =" " ;
      	String lastName =" ";
      	int index;    	
    	int space = " ";
    
    	System.out.print ("Please enter your full name.");
   		name= EasyIn.getString ();
   		
   		lastName = name.substring(space +1);
   		
		   
    
   System.out.println ("Entered name reverse is " + reverse);
   		
    }
  }  