/**
 * Q15. Create a class BankCustomer. Each BankCustomer has a name, address and can have up to three 
 * SavingsAccounts. The BankCustomer constructor method should only accept the name and address of the customer.
 *  Provide a method called addAccount that accepts one SavingsAccount parameter – the BankCustomer object should 
 *  keep track of how many valid SavingsAccounts have been added so far. Provide a method called balance that 
 *  computes and returns the BankCustomers total savings. Provide a method summary that prints each account
 *   number and corresponding balance.

Create a driver program that fully tests all of the above methods.

 */
package lab3aeclipse;

/**
 * @author c00197220
 *
 */
public class BankCustomer {
	private String name ;
	private String address;
	private int currentAccount ; 
	private SavingsAccount[] account= new SavingsAccount[3];
	private double totalAmount ;
	
	public BankCustomer(String name, String address) {
		this.name = name;
		this.address = address;	
			
	}
	
		
	 
	 public void addAccount(SavingsAccount accounts ) {
		 if (currentAccount<3){
			account[currentAccount]= accounts; 
			currentAccount++;	
			balance();
		 }
		 else {
			 System.out.println("You already have 3 accounts!!!");
		 }		
	}
	 public double balance(){
		
		 totalAmount= totalAmount+ account[currentAccount-1].getTotalMoney();
		 return totalAmount;
	 }	
	@Override
	public String toString() {		
		return "Name " + name + "\n"+
				"address " + address+"\n"+
				"Total Account " +currentAccount+"\n"+
				account[currentAccount-1].toString() + "\n"+				
				account[currentAccount-1].toString() + "\n"+
				//account3 + "\n"+
				"Total Amount in all Accounts" + totalAmount;					
	}	 
}
