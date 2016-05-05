package lab5;




/**
 * @author c00197220
 *
 */
/*Q1. Create a class Employee, which has the following private attributes:
	Number
	Name
	Address
	Department
	Salary
	Company Car Registration Number

Provide three appropriate constructors for the Employee class including the following two:
1) One constructor should initialise the first three properties to the parameter values taken 
in when the constructor is called and set the other properties to default or null values
2) Another constructor will take in parameter values for all attributes and set the attributes 
to these parameter values. 
Provide getter and setter methods as appropriate for the attributes of the Employee class.  
Provide a print method for the Employee class so that object details can be printed. 
 Provide a taxPayable() method that calculates the amount of tax that an Employee must pay. 
  The tax rate is 20% on amounts up to €20,000 and 40% on all salary above this amount.  
  Next create a class that uses the Employee class by creating an array of ten objects. 
   In your driver class, access the attributes of the objects via the getter and setter methods. 
    Demonstrate that all methods of the Employee class work as expected (in particular the taxPayable() method). 
     Demonstrate the use of the this pointer in the Employee class

*/


public class Employee {
	private final int lowerSalary = 20000;
	private final double lowerTaxRate = 0.2 ;   // rates 20%
	private final double higherTaxRate = 0.4 ; // 40% rates 
	
	private int number ;
	private String name ;
	private String address ;
	private String departament;
	private double salary ;
	private String carRegNum;
	private Car car1;
	private Car car2;
	private double taxAmount; 	
	
	public Employee(int number, String name, String address) {
	
		this.number = number;
		this.name = name;
		this.address = address;
		this.departament = null;
		this.salary = 0.0;
		this.carRegNum = null;		
		this.taxAmount = 0.0;
	}
	
	public Employee(int number, String name, String address,
			String departament, double salary, String carRegNum) {
		super();
		this.number = number;
		this.name = name;
		this.address = address;
		this.departament = departament;
		this.salary = salary;
		this.carRegNum = carRegNum;
		this.car1 = null;
		this.car2 = null;
	}

	public Employee(int number, String name, String address,
			String departament, double salary, Car car1) {
		super();
		this.number = number;
		this.name = name;
		this.address = address;
		this.departament = departament;
		this.salary = salary;
		this.car1 = car1;
		this.car2 = null;
	}	
	public Employee(int number, String name, String address, String departament,
			double salary, Car car1, Car car2) {
		super();
		this.number = number;
		this.name = name;
		this.address = address;
		this.departament = departament;
		this.salary = salary;
		this.car1 = car1;
		this.car2 = car2;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartament() {
		return departament;
	}
	public void setDepartament(String departament) {
		this.departament = departament;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCarRegNum() {
		return carRegNum;
	}
	public void setCarRegNum(String carRegNum) {
		this.carRegNum = carRegNum;
	}
	public double taxPayable(){
		if(this.salary<=lowerSalary){
			taxAmount= this.salary*lowerTaxRate ;
		}
		else{
			taxAmount= this.salary*higherTaxRate ;
		}			
		return taxAmount;
	}	
	@Override
	public String toString() {
		
		if (salary==0.0)
		{
			return "Employee number......" + number + "\n name......" + name + "\n address.........."+ address;
		}		
		else if ( car1==null) {
			
		return "Employee number....." + number + "\n name....." + name + "\n address....."
				+ address + "\n departament....." + departament + "\n salary...."
				+ salary   +"\n Amount of tax......." + taxPayable()+ "\n carRegNumber ...." +  carRegNum ;
		}
		else if ( car2==null) {
			
			return "Employee number....." + number + "\n name....." + name + "\n address....."
					+ address + "\n departament....." + departament + "\n salary...."
					+ salary   +"\n Amount of tax......." + taxPayable()+ "\n car number 1 ...." +  car1 ;
			}
		
		else {
			return "\n Employee number....." + number + "\n name....." + name + "\n address....."
					+ address + "\n departament....." + departament + "\n salary...."
					+ salary + "\n Amount of tax......." + taxPayable() + "\n car number 1 ...." +  car1 + "\n car number 2 ...." +  car2 ;
			
		}
	}
	
	
	
	
	
	
}
