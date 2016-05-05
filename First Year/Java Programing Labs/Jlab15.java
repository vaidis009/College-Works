class Jlab15

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
// Purpose : 		Enter a loan amount, the interest rate per annum and the amount of years the loan is to be taken out for. The program should then calculate and print out the total amount repaid.	




{
    public static void main(String[] args)
    {
    	
    	int loanamount ;
    	double interestrate ;
    	int years ;
    	double totalinterest ;
    	double totalrepaid ;
    	 
    	 
    	 //input 
    	 System.out.println("Please enter loan amount.");
    	 loanamount = EasyIn.getInt() ; 
    	 System.out.println("Please enter interest rate.");
    	 interestrate = EasyIn.getDouble() ; 
         System.out.println("Please enter years for how long loans is taking.");
    	 years  = EasyIn.getInt() ; 
    	 
    	 //calculation
    	 
    	 totalinterest = loanamount * interestrate * years ;
    	 totalrepaid = totalinterest + loanamount ;
    	 
    	 
    	//output
    	 System.out.println ("Total interest amount is "+ totalinterest  ) ;
    	 System.out.println ("Total repaid amount is "+ totalrepaid  ) ; 
    }
}