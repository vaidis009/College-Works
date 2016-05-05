
class Jlab11

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
// Purpose : 		Input a value in inches, convert it to centimetres and display the centimetre equivalent on the screen. (2.54 centimetres per inch)




{
    public static void main(String[] args) 
    
    {
    
    //input
    
    
   
    double CONVORSIONFACTOR = 2.54;
    
    
    double inches ;
    double centimetres ;
    
    System.out.println("Please enter inches.");
    	inches = EasyIn.getDouble() ;
   
       
    //calculation
   
   	 centimetres = CONVORSIONFACTOR * inches ;
    
    
        //output
    
    	 
    	    
    	System.out.println (inches + "inches is" + centimetres);
    	
    	}
  }  	


