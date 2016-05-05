package lab5;

/*Q2. Making use of the classes you created in question 1 attempt the following:
Create a Car class that has the following private attributes:
	Make
	Model
	Engine size
	Engine Type
	Registration Number
Provide appropriate constructors for the Car class including the following two:
1) One constructor should initialise the first four properties to the parameter values taken in when the constructor
 is called and sets the other property to a default or null value
2) Another constructor will take in parameter values for all attributes and set the attributes to these parameter values.

Provide getter and setter methods as appropriate for the attributes of the Car class.  Provide a print method for 
the Car class so that object details can be printed.  Create a class that uses the Car class by creating an array
 of ten objects.  In your driver, access the attributes of the objects via the getter and setter methods.  
 Demonstrate that all methods of the Car class work as expected.  Demonstrate the use of the this pointer in the Car class. 
  Modify the Employee class created for question 1 by removing the Company Car Registration Number property
   and replacing it with a Company Car property that is of the class Car as just created.
     An Employee may at most have two company cars, handle this situation using static variables or 
     functions as necessary and prove that it works by modifying your driver class as appropriate.
*/
public class Car {
	private String make;
	private String model;
	private double engineSize;
	private String engineType;
	private String regNumber;
	public Car(String make, String model, double engineSize, String engineType) {
		super();
		this.make = make;
		this.model = model;
		this.engineSize = engineSize;
		this.engineType = engineType;
		this.regNumber = null;
	}
	public Car(String make, String model, double engineSize, String engineType,
			String regNumber) {
		super();
		this.make = make;
		this.model = model;
		this.engineSize = engineSize;
		this.engineType = engineType;
		this.regNumber = regNumber;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	@Override
	public String toString() {
		return " make=" + make + ", model=" + model + ", engineSize="
				+ engineSize + ", engineType=" + engineType + ", regNumber="
				+ regNumber + "]";
	}
	
	
	
	

}
