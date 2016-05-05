class Jlab22

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 			Write a program where the user enters 3 exam marks. Programming, Maths and Hardware. 
                        The program will then calculate their average mark and indicate whether the average mark is a :

	                 	Distinction	70 - 100
						Merit1		63 - 69
						Merit2		55 - 62
						Pass		40 - 54
						Fail		Less Than 40

                       */
{
    public static void main(String[] args)
    {
    	
    	int programming ;
     	int maths ;
     	int hardware ;
     	double markaverage ;
     	String results ;
     	
     	System.out.print("Please enter programming exam marks.") ;
     	programming = EasyIn.getInt() ;
     		System.out.print("Please enter maths exam marks.") ;
     	maths = EasyIn.getInt() ;
     		System.out.print("Please enter hardware exam marks.") ;
     	hardware = EasyIn.getInt() ;
     	
     	
     	//calculation
     	
   markaverage = (programming + maths + hardware) / 3 ;
    
    if (markaverage >70)
    {
   results = "Distinction" ;	
    }
    else if (markaverage > 63 && markaverage < 69 )
    {
    	results = "merit1" ;
    }
     else if (markaverage > 55 && markaverage < 62 )
    {
    	results = "merit1" ;
    	}
     else if (markaverage > 40 && markaverage < 54 )
    {
    	results = "merit1" ;
    }
    	
    	else 
    	{
    		results= "Fail" ;
    	}
    System.out.print( markaverage ) ;
    System.out.print("\n\n exams result is " + results ) ;
    
    
    
    
    
    
    
    
    
    }	
}