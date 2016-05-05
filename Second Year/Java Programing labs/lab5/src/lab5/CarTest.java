package lab5;


/*Provide getter and setter methods as appropriate for the attributes of the Car class.  Provide a print method for 
the Car class so that object details can be printed.  Create a class that uses the Car class by creating an array
 of ten objects.  In your driver, access the attributes of the objects via the getter and setter methods.  
 Demonstrate that all methods of the Car class work as expected.  Demonstrate the use of the this pointer in the Car class. 
  Modify the Employee class created for question 1 by removing the Company Car Registration Number property
   and replacing it with a Company Car property that is of the class Car as just created.
   
   
     An Employee may at most have two company cars, handle this situation using static variables or 
     functions as necessary and prove that it works by modifying your driver class as appropriate.*/
public class CarTest {
	
	public static void main(String[] args){		
		
		Car[] carsObject = new Car[10];
		
		carsObject[0]= new Car("Audi","A4",2.0, "Diesel");
		carsObject[1]= new Car("Audi","A4",2.0, "Diesel","15d6876");
		
		System.out.println(carsObject[0].getMake() + "\n"+ carsObject[0].getModel() + "\n"+ carsObject[0].getEngineSize() + "\n"+ carsObject[0].getEngineType() );
		System.out.println(carsObject[1].toString());
	}

}
