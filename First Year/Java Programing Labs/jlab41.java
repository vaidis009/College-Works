class Jlab41

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 			Write and test a program which will prompt the user to enter their name, read in the name, 
 *and write to the screen just the surname. (Where surname is interpreted as everything after the first space).
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
        surname= name.substring(space+1);
    	
		   
   	
   	    System.out.println ("Second name is " + surname );
   	
   
   		
    }
  }  