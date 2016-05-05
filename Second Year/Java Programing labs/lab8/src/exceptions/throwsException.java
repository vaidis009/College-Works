// sample for throw exception 
package exceptions;

public class throwsException {
	
	public static void main(String[] args) throws Exception {		
		divideByZero(10);
	}
	public static void divideByZero(int num){		
		try {		
			int sum= num/2;
			System.out.println(sum);
			
			if (sum<=8)
			{
				// throw exception with message
				throw new Exception("Its less like 8");
			}
		} catch (Exception e) {
			System.out.println("Catch Block is Called");
			System.out.println(e);
			
		}
		finally{
			System.out.println("Finally Block is Called");
		}
	}	
}
