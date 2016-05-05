// example for finally exception
package exceptions;

public class Finally {
// the finaly block always executes when the try block exists
// this ensures that the finely block is executed even if  an unexpectedted exseption occurs.
	public static void main(String[] args) {		
		divideByZero(2);	
	}
	public static void divideByZero(int num){		
		try {
			System.out.println("Catch Block is Called");
			System.out.println(num/0);
		} 
		catch (Exception e) {	
			e.printStackTrace();			
		}
		finally{
			System.out.println("Finally Block is Called");
		}
	}
}
