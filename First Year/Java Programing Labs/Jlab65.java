
class Jlab65


// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose :) ) Rewrite the following program using a loop structure of your choice.
 * But this time you implement a method called menu for the menu option, and a method for
 * each conversion e.g. fahrToCel(), celToFahr(), inchToCent() etc. 
 *The program keeps presenting the user with options until the user enters the value 7 to exit

1.	Fahrenheit to celcius
2.	Celcius to Fahrenheit
3.	Inches to centimetres
4.	Centimetres to inches
5.	Pounds to Kilograms
6.	Kilograms to Pounds
7.	Exit Program


 **/
{
	public static double fahrToCel(double Afahrenheit) // fahrenheit to celcius
		{
		double results;
		results = (Afahrenheit-32)/1.8 ;
		return results;	
		}

	public static double celToFahr(double Acelcius) // celcius to fahrenheit
		{
		double results;
		results = (Acelcius* 1.8)+ 32 ;
		return results;	
		}
	public static double inchToCent(double Ainches) //inches to centemetres 
		{
		double results;
		results = Ainches * 0.39370 ;
		return results;	
		}
	public static double centToInch(double Acentemetres) // centemetres to inches
		{
		double results;
		results = Acentemetres / 0.39370 ;
		return results;	
		}
	public static double poundsToKil(double Apounds) // pounds to kilograms 
		{
		double results;
		results = Apounds / 2.2046;
		return results;	
		}
		
	public static double kilToPounds(double Akilograms) // Kilograms to pounds
		{
		double results;
		results = Akilograms * 2.2046;
		return results;	
		}
	
    public static void main(String[] args) 
    {
    double fahrenheit ;
    double celcius;
    double inches;
    double centemetres;
    double pounds;
    double kilograms;
    double convertedResults ;
    int optionChoose ;
    String menu ;
    
    optionChoose =0 ;
    
    menu = "\n1.	Fahrenheit to celcius";
    menu = menu +"\n2.	Celcius to Fahrenheit";
    menu =menu +"\n3.	Inches to centimetres";
    menu = menu +"\n4.	Centimetres to inches";
    menu =menu+ "\n5.	Pounds to Kilograms";
    menu = menu +"\n6.	Kilograms to Pounds";
    menu =menu +"\n7.	Exit Program";
    
    System.out.println (menu);
    while(optionChoose!=7)
    {
    
	    System.out.println ("Please select option.");
	    optionChoose = EasyIn.getInt();
	    
	    if (optionChoose ==1)
		    {
		    	System.out.println ("Please enter fahrenheit.");
		    	fahrenheit = EasyIn.getDouble();
		    	convertedResults =fahrToCel(fahrenheit);  // calling method
		    	System.out.println (fahrenheit + " Fahrenheit is: " + convertedResults +" Celcius");
		    }
	    else if   (optionChoose ==2)
		    {
		    	System.out.println ("Please enter celcius.");
		    	celcius = EasyIn.getDouble();
		    	convertedResults =celToFahr(celcius);
		    	System.out.println (celcius + " Celcius is: " + convertedResults +" fahrenheit");
		    }
	    else if   (optionChoose ==3)
		    {
		    	System.out.println ("Please enter inches.");
		    	inches = EasyIn.getDouble();
		    	convertedResults =inchToCent(inches);
		    	System.out.println (inches + " inches is: " + convertedResults +" Centemetres");
		    }
		    else if   (optionChoose ==4)
		    {
		    	System.out.println ("Please enter centemetres.");
		    	centemetres = EasyIn.getDouble();
		    	convertedResults =centToInch(centemetres);
		    	System.out.println (centemetres + " centemetres is: " + convertedResults +" Inches");
		    }
		 else if   (optionChoose ==5)
		    {
		    	System.out.println ("Please enter pounds.");
		    	pounds = EasyIn.getDouble();
		    	convertedResults =poundsToKil(pounds);
		    	System.out.println (pounds + " pounds is: " + convertedResults +" kilograms");
		    }
	    
	     else if   (optionChoose ==6)
		    {
		    	System.out.println ("Please enter kilograms.");
		    	kilograms = EasyIn.getDouble();
		    	convertedResults =kilToPounds(kilograms);
		    	System.out.println (kilograms + " kilograms is: " + convertedResults +" pounds");
		    }
    
		  
		
   }
	   
    
	}
}  