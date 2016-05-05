class Jlab13

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
// Purpose : 		Enter three numbers, and display, their sum, product and the average of the three.	




{
    public static void main(String[] args)
    {
    	
    	int numberone ;
    	int numbertwo ;
    	int numberthree ;
    	
    	int sum ;
    	int product ;
    	double average ;
    	 
    	 
    	 //input 
    	 System.out.println("Please enter fist number.");
    	 numberone = EasyIn.getInt() ; 
    	 System.out.println("Please enter second number.");
    	 numbertwo = EasyIn.getInt() ;
    	 System.out.println("Please enter third number.");
    	 numberthree = EasyIn.getInt() ;
    	
    	//calculation
    	
    	sum= numberone + numbertwo + numberthree ;
    	product = numberone * numbertwo * numberthree ; 
    	average = 	sum / 3 ;
    	
    	// output
    	
    	 System.out.println ("The numbers sum is " + sum ) ;
    	  System.out.println ("The product is " + product ) ;
    	System.out.println ("The numbers average is " + average ) ;
    }
}