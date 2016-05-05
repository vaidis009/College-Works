/**
 *Q14. Create a class SavingsAccount. Each SavingsAccount should have a unique number that
 * is automatically assigned by the constructor method, i.e. the number is not to be passed as a
 *  parameter to the constructor. The account numbers should start at 1 and count upwards in increments of 1.
Use a static class variable to store the annualInterestRate for each of the savers.
 Each object of the class contains a private instance variable savingsBalance indicating the amount the saver 
 currently has on deposit. Provide method calculateMonthlyInterest() to calculate the monthly interest by
  multiplying  the balance by annualInterestRate divided by 12; this interest should be added to savingsBalance.
   Provide a static method modifyInterestRate() that sets the annualInterestRate to a new value. 

Driver program

Write a driver program to test class SavingsAccount. Instantiate two different savingsAccount objects, 
saver1 and saver2, with balances of €2000.00 and €3000.00, respectively. Set annualInterestRate to 4%,
 then calculate the monthly interest and print the new balances for each of the savers.
  Then set the annualInterestRate to 5% and calculate the next month's interest and print the new balances for 
  each of the savers.
 
 */
package lab3aeclipse;

/**
 * @author c00197220
 *
 */
public class SavingsAccountTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		SavingsAccount.modifyInterestRate (0.04);
		SavingsAccount saver1 = new SavingsAccount(2000.0);
		SavingsAccount saver2 = new SavingsAccount(3000.0);
		SavingsAccount saver3 = new SavingsAccount(5000.0);
		
		
		System.out.println(saver1.toString());
		System.out.println(saver2.toString());
		System.out.println(saver3.toString());
		
		
	}

}
