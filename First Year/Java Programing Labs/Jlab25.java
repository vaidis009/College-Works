class Jlab25

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 			Modify this program so that it takes 3 numbers and then outputs whether :

               			1. The first number is exactly divisible by both numbers
               			2. The first number is exactly divisible by one of the 2 numbers. If so, output 	   
						 which one it is. Also output if it is not exactly divisible by either number.

                       */
{
    public static void main(String[] args)
    {
    
    int numberA ;
    int numberB ;
    int numberC ;
    String results ;
    
    
     
     
     //inputs
     System.out.println ("Please enter number A") ;
     
 	 numberA = EasyIn.getInt () ;
     System.out.println ("Please enter number B") ;
 	 numberB = EasyIn.getInt () ;
     System.out.println ("Please enter number C") ;
 	 numberC = EasyIn.getInt () ;
 	 
 	 // calculation
 	  if (numberA % numberB == 0  && numberA % numberC == 0)
 	  {
 	  	results = ("The number A is divisable from both.") ;
 	  }
 	  else if (numberA % numberB ==0 )
 	  {
 	  	results = ("Number A divisable from number B  but Not divisable from C") ;
 	  }
     	else if (numberA % numberC == 0 )
     	{
     	results = ("Number A divisable from number C but Not divisable from B") ;
     	}
     	else  
     	{
     	results = (" NOT divisable") ;
     	}
     	
     	//outprint 
     	 
     	 System.out.println( results) ;
     	
     	
     }
}