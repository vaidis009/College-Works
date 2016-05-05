class Jlab2b3

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 		3.	Write a program which asks the user to enter 3 different numbers. 
 *                   The program then tells the user which number was the lowest number entered. 
*/

{
    public static void main(String[] args) 
    
    {
        int numberA ;
        int numberB ;
        int numberC ;
        
        System.out.println("Please enter number A") ;
        numberA = EasyIn.getInt () ;
        System.out.println ("Please enter number B") ;
        numberB = EasyIn.getInt ();
        System.out.println ("please enter number C") ;
        numberC =EasyIn.getInt () ;
        
        if (numberA < numberB && numberA < numberC)
         {
         	System.out.println ("Loweat number is " + numberA) ;
         }
         else if (numberB <numberA && numberB < numberC)
    	{
    		System.out.println ("Lowesst number is " + numberB) ;
    	}
    	else 
    	System.out.println ("\n\nLowest number is " + numberC) ;
    	
    	}
  }  