class Jlab42

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 	Modify the program produced at (1) so that it writes out the first name 
 *(everything up to the first space) instead of the surname.
*/

{
    public static void main(String[] args) 
    
    {
    
   	    String name = "" ;
    	String firstName ="";
    	String surname ="" ;
    	int space ;
    	
    	
    	System.out.print ("Please enter your full name.");
    	name = EasyIn.getString ();
    	
    	space= name.indexOf(" ");
        firstName= name.substring(0,space);
    	
		   
   	
   	    System.out.println ("Firstname  is " + firstName );
   
   		
    }
  }  