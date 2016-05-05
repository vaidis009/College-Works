class Jlab23

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 		Write a program which determines whether a number is odd or even

                       */
{
    public static void main(String[] args)
    {
    	
    	int numA ;
     	String results ;
     	
     	System.out.print("Please enter number A") ;
     	numA = EasyIn.getInt() ;
   
    
    if (numA % 2 ==  0)
    {
    	results = "even" ;
    }
    else
    {
    	results = "odd" ;
    	
    }
    
    System.out.print("the number is " + results) ;
    
    }	
}