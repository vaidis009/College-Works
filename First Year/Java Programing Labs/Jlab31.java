class Jlab31

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 		1.	Rewrite the following program using a loop structure of your choice. 
 *                      The program keeps presenting the user with options until the user enters the value 7 to exit
							
							1.	Fahrenheit to celcius
							2.	Celcius to Fahrenheit
							3.	Inches to centimetres
							4.	Centimetres to inches
							5.	Pounds to Kilograms
							6.	Kilograms to Pounds
							7.	Exit Program
*/

{
    public static void main(String[] args) 
    
    {
        
 	int choise;
    int num=0 ;
    String menu ;
    
   	double results_fahrenheit ; 
    double result_Celcius ;
    double result_inches ;
    double results_centemetres ;
    double results_pounds ;
    double results_kilograms ;
    
    
    menu = "\n1.	Fahrenheit to celcius";
    menu = menu +"\n2.	Celcius to Fahrenheit";
    menu =menu +"\n3.	Inches to centimetres";
    menu = menu +"\n4.	Centimetres to inches";
    menu =menu+ "\n5.	Pounds to Kilograms";
    menu = menu +"\n6.	Kilograms to Pounds";
    menu =menu +"\n7.	Exit Program";
    
    System.out.println (menu);
    System.out.println ("Please select option.");
    choise = EasyIn.getInt();
       
    
    while (choise != 7 )
    	{    	
		 switch (choise)
		   {
		   
		   
		  case 1:   
		     		System.out.println ("Please enter number") ;
					num = EasyIn.getInt () ;
				    result_Celcius = (num-32)/1.8 ;
				  	System.out.println (num +" Fahrenheit is " + result_Celcius +"Celcius") ;
		  		break;
		  case 2:
		  	
		  			System.out.println ("Please enter number") ;
					num = EasyIn.getInt () ;
				  	results_fahrenheit = (num * 1.8)+ 32 ;
				    System.out.println(num +" Celcius is " + results_fahrenheit + " Fahrenheit " ) ;
		    	break;
		  case 3:
		    		System.out.println ("Please enter number") ;
					num = EasyIn.getInt () ;
				    result_inches = num * 0.39370 ;
				    System.out.println ("In " + num + " centemetres is " + result_inches + " inches." ) ;
		   		break;
		  case 4:
				    System.out.println ("Please enter number") ;
	  				num = EasyIn.getInt () ;
				    results_centemetres = num / 0.39370 ;
				    System.out.println ("In " + num + " inches is " + results_centemetres + " centemetres." ) ;
		    	break;
		  case 5:
		  			System.out.println ("Please enter number") ;
					num = EasyIn.getInt () ;
		    		results_kilograms = num / 2.2046;
				    System.out.println (num + " pounds is " + results_kilograms + " kilograms") ;
				  
		    	break;
		  case 6:
		  			System.out.println ("Please enter number") ;
     				num = EasyIn.getInt () ;
		    		results_pounds = num * 2.2046;
				    System.out.println (num + " Kilograms is " + results_pounds + " pounds") ;
				  	
		    	break;
		    
		  default:
			        System.out.println ("Please enter number") ;
		            num = EasyIn.getInt () ;
			
		   }
		   System.out.println ("Please select option.");
           choise = EasyIn.getInt();
		  
		 } 
		     
   
    }
  }  