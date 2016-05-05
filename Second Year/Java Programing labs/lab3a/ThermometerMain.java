/*
 *Q11. Add the following functionality to class Thermometer:

Write a method getFahrenheit() which returns, as a double value, the currently stored temperature in Fahrenheit. 

		fahrenheit = ((celsius * 9) / 5 + 32 )

Write a method setFahrenheit() which accepts a double value in Fahrenheit, and then converts and stores this double value in Celsius. 
(Hint: Remember, the only data value stored by objects of class Thermometer is a double value representing Celsius).


 */
public class ThermometerMain
{ // begin class ThermTest
  public static void main(String args[]) 
  { // being main
    double tempB;
    double tempC;				
  
     Thermometer thermC = new Thermometer(50.0);

    tempC = thermC.getFahrenheit();
    System.out.println("Temp. of Thermometer in fahrenheit is " + tempC);				
  } // end main
} // end class ThermTest
