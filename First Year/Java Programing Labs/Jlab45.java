class Jlab45

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 		Modify the program produced in (1) so that it writes out the user's input reversed (Joe Doe is output as eoD eoJ).
 */

{
    public static void main(String[] args) 
    
    {
    	String name = " " ;
      	String reverse = " " ;
      	String firstName =" " ;
      	String lastName =" ";
      	int Space = 0;
      	int length ;
      	int index;    	
    	
    
    	System.out.print ("Please enter your full name.");
   		name= EasyIn.getString ();
   		firstName = name.substring(0,Space);
   		lastName = name.substring(Space, 0);
   		length=name.length();
   		reverse = lastName +firstName;
   		
   		for (index=length-1;index>=0;index--)
		   	{
				reverse= reverse +name.charAt(index);
		   	}
    
   System.out.println ("Entered name reverse is " + reverse);
   		
    }
  }  