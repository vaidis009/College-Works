package lab5q5;

public class ShiftWorker extends Employee {
	private double numOfHour;
	private double salaryRate;
	private int startingTime;
	
	
	
	public ShiftWorker(String fName, String lName, double numOfHour, double salaryRate, int startingTime) {
		super(fName, lName);
		this.numOfHour = numOfHour;
		this.salaryRate = salaryRate;		
		this.startingTime = startingTime;
	}	
	

	// Determine the PieceWorker's earnings
	public double earnings(){
		if (startingTime>=7 && startingTime<=12){
			return numOfHour * salaryRate;
		}
		else if(startingTime>12 && startingTime<=18){
			return numOfHour * (salaryRate*1.5);
		}
		else{
		return numOfHour * salaryRate*2;
		}
	}
	

}
