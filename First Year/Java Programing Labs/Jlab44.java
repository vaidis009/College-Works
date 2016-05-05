class Jlab44

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 	Modify the program produced in (1) so that it writes out the number of uppercase characters in the user's input.
 */

{
    public static void main(String[] args) 
    
    {
    	String name = " " ;
      	char  characters = ' ' ;
      	int uppercase =0 ;
      	int i;    	
    	
    	System.out.print ("Please enter your full name.");
   		name= EasyIn.getString ();
   		for (i=0;i<name.length();i++)
		   	{
				characters =name.charAt(i);
		   		
		   		if (characters >'A' && characters< 'Z')
		   		{
		   			uppercase =uppercase +1;
		   		}
		   	}
    
    	
    	
		   
   	
   	    System.out.println ("You type  " + uppercase + " uppercase." );
   	
   
   		
    }
  }  