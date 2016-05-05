/*
*Q14. Create a class SavingsAccount. Each SavingsAccount should have a unique number that
 * is automatically assigned by the constructor method, i.e. the number is not to be passed as a
 *  parameter to the constructor. The account numbers should start at 1 and count upwards in increments of 1.
Use a static class variable to store the annualInterestRate for each of the savers.
 Each object of the class contains a private instance variable savingsBalance indicating the amount the saver 
 currently has on deposit. Provide method calculateMonthlyInterest() to calculate the monthly interest by
  multiplying  the balance by annualInterestRate divided by 12; this interest should be added to savingsBalance.
   Provide a static method modifyInterestRate() that sets the annualInterestRate to a new value. *
 * 
 */
package lab3aeclipse;

/**
 * @author c00197220
 *
 */
public class SavingsAccount {
	private int accountNum  ;
	static private int totalAccounts ;
	static private double annualInterestRate ;
	private double totalMoney;
	private double monthlyInterest ;
	
	/**
	 * @param interest
	 */
	public SavingsAccount(double money) {
		this.totalMoney=money;
		//setTotalMoney(money,monthlyInterest);
		setMonthlyInterest();
		setTotalMoney();
		accountNum=totalAccounts+1;
		totalAccounts++;		
	}		
	static public void modifyInterestRate(double rate) {
		annualInterestRate=rate;
	}

	public void setMonthlyInterest() {
		monthlyInterest = totalMoney*annualInterestRate/12;
	
	}
	public double getMonthlyInterest() {
		return monthlyInterest;
	}
	public void setTotalMoney() {
		totalMoney = totalMoney+monthlyInterest;
		}
	public double getTotalMoney() {
		return totalMoney;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SavingsAccount " + accountNum + "\n"
				+ "Mountly interest " + monthlyInterest + "\n"
				+ "Total money in account "  + totalMoney ;
	}
}
