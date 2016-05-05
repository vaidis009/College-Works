package lab5;

/*Next create a class that uses the Employee class by creating an array of ten objects. 
In your driver class, access the attributes of the objects via the getter and setter methods. 
 Demonstrate that all methods of the Employee class work as expected (in particular the taxPayable() method). 
  Demonstrate the use of the this pointer in the Employee class*/



public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Car carsObject1= new Car("Audi","A4",2.0, "Diesel", "10d4576");
		Car carsObject2= new Car("Audi","A4",2.0, "Diesel","15d6876");
		
		Employee[] employeeObject = new Employee[4];
	
		
		
		employeeObject[0]= new Employee(123,"Vaidas","Portlaoise");
		employeeObject[1]= new Employee(12345,"Vaidas","Portlaoise", "Customer Service Department", 30000.0, "14d6441");
		employeeObject[2]= new Employee(12,"Vaidas","Portlaoise", "Customer Service Department", 50000.0, carsObject1);
		employeeObject[3]= new Employee(345,"Vaidas","Portlaoise", "Customer Service Department", 20000.0, carsObject1, carsObject2  );
		
		System.out.println(employeeObject[0].toString());
		System.out.println("**************************no cars just printing numbers from second question***************************************************");
		System.out.println(employeeObject[1].toString());		
		System.out.println("**************************1 car***************************************************");		
		System.out.println(employeeObject[2].getNumber() + "\n"+ employeeObject[2].getName()+  "\n"+ employeeObject[2].getAddress()+ "\n"+ employeeObject[2].getDepartament() + "\n"+ employeeObject[2].getSalary() + "\n"+  employeeObject[2].taxPayable()  );
		System.out.println("***********************2cars******************************************************");
		System.out.println(employeeObject[3].toString());	
		System.out.println(" *******************************Stats for loop**********************************************");
		for (Employee temp: employeeObject){
			
			System.out.println(temp);
		}
			
	
	}

}
