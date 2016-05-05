class Jlab21

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 			Write a program in which the user enters an integer value. 
                      Depending on the input the program will output whether the number was greater 
                      than zero, less than zero or equal to zero.

                       */
{
    public static void main(String[] args)
    {
    	
    	int userenter ;
     	String numbervalue ;
     
     	
     	System.out.print("Please enter number") ;
     	userenter = EasyIn.getInt() ;
     	
     	
     	
     	
     	//calculation
     	
     if ( userenter > 0)
     {
     	numbervalue = "the number is positive " ;
     	
     }     
     	else if (userenter < 0)	
     	{
     	numbervalue = "the number is negative" ;
     	
     }
     else 
     { 
     numbervalue = "number equal zero" ;
     }
     	
     	//output
     	System.out.print ("\n\n\t" +  numbervalue )  ;
    
    
    
    
    
    
    }	
}