class Jlab23

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 			Write a program which ask the user for 2 numbers, it then indicates 
                        whether the first number is exactly divisible by the second number.

                       */
{
    public static void main(String[] args)
    {
    	int numberA ;
    	int numberB ;
    	String results ;
    	
    	
    	
    	//inputs
    	System. out.print("Please enter first number. ") ;
    	numberA = EasyIn.getInt() ;
    	System. out.print("Please enter second number. ") ;
    	numberB = EasyIn.getInt() ;
    	
    	
    
    //calculation
    if (numberA % numberB ==0 )
    {
    	results = (numberA + "is divisble from" + numberB) ;
    }
    else 
        {
        
        results = (numberA + "is not divisble from" + numberB) ;
    
    }
    
    System. out.println (results) ;
    
    
    
    }	
}