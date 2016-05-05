public class Thermometer
{ // begin Thermometer
	private double celsius;	// more about private later
	private double fahrenheit;
	// celsius is accessible to all methods in this class
	
	public Thermometer()		// constructor method #1
	{
		setFahrenheit(0);		
	}
		
	public Thermometer(double fah)	// constructor method #2
	{
		setFahrenheit(fah);
	}

	public void setFahrenheit(double fah)
	{
		fahrenheit  = ((fah - 32)*5)/9;		
	}

	public double getFahrenheit()
	{
		return fahrenheit;
	}
} // end class Thermometer

