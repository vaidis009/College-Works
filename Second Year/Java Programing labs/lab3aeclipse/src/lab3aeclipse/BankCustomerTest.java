/**
 * 
 */
package lab3aeclipse;

/**
 * @author c00197220
 *
 */
public class BankCustomerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount.modifyInterestRate (0.04);
		BankCustomer customer1 =new BankCustomer("Vaidas", "Portlaoise");
		
		SavingsAccount[] accounts = new SavingsAccount[3];
		
		 SavingsAccount account1 = new SavingsAccount(2000.0);
		 SavingsAccount account2 = new SavingsAccount(5000.0);
		 SavingsAccount account3 = new SavingsAccount(10000.0);
		 
		 accounts[0]= new SavingsAccount(2000.0);
		 accounts[1]= new SavingsAccount(5000.0);
		accounts[2]=new SavingsAccount(10000.0);
		
		 customer1.addAccount(account1);
		 customer1.addAccount(account2);
		 customer1.addAccount(account3);
		 
		
		 
		 BankCustomer customer2 =new BankCustomer("Vaidas", "Portlaoise");
		
		 customer2.addAccount(account1);
		 customer2.addAccount(account2);
		 customer2.addAccount(account3);
		 
		 
		 System.out.println(customer1.accounts[0]. toString());
		
		System.out.println(customer1. toString());
		System.out.println(customer2. toString());
	}

}
