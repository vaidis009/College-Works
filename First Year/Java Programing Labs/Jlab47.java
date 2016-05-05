class Jlab47

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 		) Modify the program produced in (1) so that it writes out 
 *the number of occurrences of the letter a in the user's input. (Treat A and a as the same character).
 */

{
    public static void main(String[] args) 
    
    {
       String name = "" ;
       int letterA =0;
       int index ;
      
    
    	
    	
    	System.out.print ("Please enter your full name.");
    	name = EasyIn.getString ();
    	
    
  
  	for (index=0;index<name.length();index++)
       		{
       			if (name.charAt(index)=='A' ||name.charAt(index) =='a' )
       			{
       			letterA++;
       			}
       			
      	
       		}	
       		
		
   		System.out.println (letterA);
   	    
     
   
    }
  }  