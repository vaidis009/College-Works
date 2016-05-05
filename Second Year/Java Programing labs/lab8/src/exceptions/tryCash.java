package exceptions;

public class tryCash {

	public static void main(String[] args) {
	
		
		divideByZero(2);		
		

	}
	public static void divideByZero(int num){
		
		try {
			System.out.println(num/0);
		} catch (Exception e) {
	
			e.printStackTrace();
			System.out.println("Catch Block is Called");
		}
	}

}
