class Jlab13

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
// Purpose : 		Modify this program so that it displays current sum, product and average after each number is added.	




{
    public static void main(String[] args)
    {
    	
    	int numberone ;
    	int numbertwo ;
    	int numberthree ;
    	
    	int sum ;
    	int product ;
    	double average ;
    	 
    	 
    	 //first number 
    	 System.out.println("Please enter fist number.");
    	 numberone = EasyIn.getInt() ; 
    	 
    	 sum  = numberone;
    	 product = numberone ;
    	 average = numberone / 1;
    	 
    	  System.out.println ("The numbers sum is " + sum ) ;
    	  System.out.println ("The product is " + product ) ;
    	System.out.println ("The numbers average is " + average ) ;
    	
    	 //second number
    	    	 
    	 System.out.println("Please enter second number.");
    	 numbertwo = EasyIn.getInt() ;
    	 
    	  sum  = numberone + numbertwo;
    	 product = numberone * numbertwo;
    	 average = sum / 2;
    	 
    	  System.out.println ("The numbers sum is " + sum ) ;
    	  System.out.println ("The product is " + product ) ;
    	System.out.println ("The numbers average is " + average ) ;
    	 
    	 //third number    	 
    	 System.out.println("Please enter third number.");
    	 numberthree = EasyIn.getInt() ;
    	       	
    	sum= numberone + numbertwo + numberthree ;
    	product = numberone * numbertwo * numberthree ; 
    	average = 	sum / 3 ;
    	
    	// output
    	
    	 System.out.println ("The numbers sum is " + sum ) ;
    	  System.out.println ("The product is " + product ) ;
    	System.out.println ("The numbers average is " + average ) ;
    }
}