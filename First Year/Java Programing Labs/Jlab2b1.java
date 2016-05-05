class Jlab2b1

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 			Modify this program so that it takes 3 numbers and then outputs whether :

               		1.	Write a program which calculates the insurance premium for the coming year. 
               		The program asks the user for the value of last year's premium and the number of claims you made in the year. 
               		The basic premium for the following year  will be a 5% increase on last years premium.
               		 If the person made no claims they get a 40% discount on this increase.
               		 If they made a claim the get an extra charge of 20% for every claim that they made.

                       */
{
    public static void main(String[] args)
    {
    	
    final double PREMIUMINCREASE = 0.05 ;
    final double DISCOUNT= 0.4;
    final double CLAIMCHARGE =0.2 ;
    
    
  	int lastYearPremium ;
   	int NumberofClaims ;
   	
   	
    double  discountAmount ;
   	double  premiumIncrease ;
   	double currentPremium ;
   	double  claimcharge ;
   	
   	
   	//Input
   	System.out.print ("Please enter last year premium.") ;
   	lastYearPremium =EasyIn.getInt ();
   	System.out.print("Please enter numbers of claims.") ;
   	NumberofClaims =EasyIn.getInt ();
   	
   	
   	//Calculation
   	premiumIncrease = lastYearPremium * PREMIUMINCREASE ;
   	discountAmount = premiumIncrease * DISCOUNT ;
   	
   	
   	if (NumberofClaims ==0)
   	{
   		currentPremium=  lastYearPremium + premiumIncrease - discountAmount ;
   		System.out.print ("Your  curent premium is " + currentPremium ) ;
   		System.out.println ("\n\n Your disount is " + discountAmount ) ;
   	}
   	else
   	{
   		claimcharge = premiumIncrease * CLAIMCHARGE * NumberofClaims ;
   		currentPremium = lastYearPremium + premiumIncrease + claimcharge ;
   		System.out.println ("Your  curent premium is " + currentPremium ) ;
   		
   	}
   	
  
   
 
   	
   
       	
     	
     }
}