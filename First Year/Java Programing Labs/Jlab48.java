class Jlab48

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 	Modify the program produced in (1) so that it writes out the user's input with any middle name removed 
 *(Joe Handsome Doe becomes Joe Doe)
 */

{
    public static void main(String[] args) 
    
    {
      
     String fullname = " ";
     String firstName =" " ;
     String lastName =" " ;
     int space1 ;
     int space2 ;
     
     
     //inputs 
     System.out.println ("Please enter your full name included middle name:") ;
     fullname= EasyIn.getString ();
     
     space1 = fullname.indexOf(" ");
     space2= fullname.indexOf(" ",space1+1);
     firstName= fullname.substring(0,space1); 
     lastName= fullname.substring(space2+1);
     
     
     
     
     
     
     
     
     //outputs
     System.out.println (firstName );	
     System.out.println (lastName);	
     System.out.println ("Your name with removed middle name is " +firstName  + " " +lastName);	
    	
       		
		
   
   	    
     
   
    }
  }  