
/*
** Author: vaidas Siupienius	Date: October 2015
*
Q11. Add the following functionality to class Thermometer:

Write a method getFahrenheit() which returns, as a double value, the currently stored temperature in Fahrenheit. 

		fahrenheit = ((celsius * 9) / 5 + 32 )

Write a method setFahrenheit() which accepts a double value in Fahrenheit, and then converts and
 stores this double value in Celsius. (Hint: Remember, the only data value stored by objects of class 
 Thermometer is a double value representing Celsius).

** pseudocode:
*

*/



public class ThermTest
{ // begin class ThermTest
  public static void main(String args[]) 
  { // being main
    double tempB;
    double tempC;				
    Thermometer thermA = new Thermometer();
    Thermometer thermB = new Thermometer(10.0);
    Thermometer thermC = new Thermometer(50.0);	

   // System.out.println("Temp. of Thermometer A is " + 
    //  thermA.getCelsius());
    //thermA.setCelsius(20.0);
   // System.out.println("Temp. of Thermometer A is " +     
    //   thermA.getCelsius());
    // assign return value of getCelsius to a variable
    tempB = thermB.getCelsius();
    System.out.println("Temp. of Thermometer B is " + tempB);
    tempC= thermC.getFahrenheit();	
    System.out.println("Temp. of Thermometer c is " + tempC);			
  } // end main
} // end class ThermTest

