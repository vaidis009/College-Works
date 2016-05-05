class Jlab2b6

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* 			6.	Write a simple menu driven program that will present the user with the following conversion menu 
			 *(look up conversion rates on the internet): 
			 
			1.	Fahrenheit to celcius
			2.	Celcius to Fahrenheit
			3.	Inches to centimetres
			4.	Centimetres to inches
			5.	Pounds to Kilograms
			6.	Kilograms to Pounds
*/

{
    public static void main(String[] args) 
    
    {
            	
    int fahrenheit ;
    int celcius ;
    int inches ; 
    int centemetres ;
    int pounds ; 
    int kilograms ;
    
   	double results_fahrenheit ; 
    double result_Celcius ;
    double result_inches ;
    double results_centemetres ;
    double results_pounds ;
    double results_kilograms ;
    
    int choise ;
    
    
    String menu ;
    
    menu = 	" \n\n1.Fahrenheit to celcius" ;
    menu = menu + "\n2.Celcius to Fahrenheit" ;
    menu =menu + "\n3.Inches to centimetres"; 
    menu = menu +"\n4.Centimetres to inches ";
    menu = menu + "	\n5.Pounds to Kilograms";
    menu =  menu +"\n6.Kilograms to Pounds";
    menu =menu +"\nPress 0 to exit";
    System.out.println (menu) ;
    
    System.out.println ("Please select option.");
    choise =EasyIn.getInt();
    
    while (choise !=0)
    	{
    		switch (choise)
    			{
    			
    		case 1:
    			  
	    			System.out.println ("Please enter Fahrenheit.") ;
				    fahrenheit = EasyIn.getInt () ;	
				    result_Celcius = (fahrenheit-32)/1.8 ;
				    System.out.println (fahrenheit + " is " + result_Celcius +"Celcius") ;
    			  
    			break;
    		
    		case 2:
    			  
			    	System.out.println ("Please enter Celcius.") ;
				    celcius = EasyIn.getInt () ;
				    results_fahrenheit = (celcius * 1.8)+ 32 ;
				    System.out.println(celcius +" is " + results_fahrenheit + " Fahrenheit " ) ;
    			  
    			break;
    		case 3:
		    	  
		    	  	 System.out.println ("Please enter Centemetres.") ;
					 centemetres = EasyIn.getInt () ;
					 result_inches = centemetres *0.39370 ;
					 System.out.println ("In" + centemetres + " is " + result_inches +" inches." ) ;
		    	  
		    	break;
		    case 4:
		    	  
		    	  	System.out.println ("Please enter Inches.") ;
				    inches = EasyIn.getInt () ;
				    results_centemetres = inches / 0.39370 ;
				    System.out.println ("In" + inches + " is " + results_centemetres + " centemetres." ) ;
					    	  	
		    	  
		    	 break;
		    case 5:
		    	  
		    	  	System.out.println ("Please enter Pounds.") ;
				    pounds = EasyIn.getInt () ;	
				    results_kilograms =  pounds /  2.2046 ;
				    System.out.println (pounds + " pounds is " + results_kilograms +" Kilograms.") ;	
		    	   
		    	 break;
		    case 6:
		    	  
		    	  	 System.out.println ("Please enter Kilograms.") ;
					 kilograms = EasyIn.getInt () ;
					 results_pounds = kilograms * 2.2046;
					 System.out.println (kilograms + " Kilograms is " + results_pounds + " pounds") ;	
		    	  
		    default:
		    	  
		    	  	  System.out.println ("Please select option.");
   					 choise =EasyIn.getInt();
		    	  	
		    	  break;	    		
		    	 
    			}
            System.out.println ("Please select option.");
   			choise =EasyIn.getInt();
    	}
    
	}
  }  