class Jlab12

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
// Purpose : 		. Enter the following values : distance travelled in miles, the amount of time spent on the trip in hours and the amount of gallons of petrol used. The program should then display , the average miles per hour and the miles per gallon.



{
    public static void main(String[] args) 
    
    {
          
   
    Double miles ;
    double hours ;
    double petrolused  ;
    double milesperhour  ;
    double milespergallon  ;
    
        //input
    System.out.print("Input a value in miles : ") ;  
	miles = EasyIn.getDouble() ;
	
	System.out.print("Input a value in hours : ") ;  
	hours = EasyIn.getDouble() ;
	
	System.out.print("Input a value in petrol used : ") ;  
	petrolused = EasyIn.getDouble() ;
    	
    	
    //calculation
   
   	 milesperhour = miles / hours ;
   	 
   	 milespergallon = miles / petrolused ;
    
    
        //output
    
    	 
    	    
    System.out.println ( "Miles per hour is" +  milesperhour  );
    
    System.out.println ( "Miles per gallon is" +  milespergallon  );
    		milespergallon = EasyIn.getDouble() ;
    	}
  }  