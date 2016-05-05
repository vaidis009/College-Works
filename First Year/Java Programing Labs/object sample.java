class CustomerUse
{

  // Student Name : 		Vaidas Siupienius
  // Student Id Number : 	C00197220
  // Date :				
  // Purpose : 		object sample
	
	final int customersInArray =4;
public static void main(String[] args)
	{
		Customer theCustomers[] ;
		Customer tempCustomer;
		String customerName = "";
		String customerId = "";
		int customerBalance = 0;
		int index = 0 ;
	
		String customerLowestBalance="";
		int LowestBalance= 0;
		
    	
		theCustomers = new Customer[customersInArray] ;
		
		for (index=0;index<customersInArray;index++)
			{				
				System.out.print("Enter Id: ");
				customerId = EasyIn.getString();										
				System.out.print("Enter name: ");
				customerName = EasyIn.getString();				
				System.out.print("Enter balance: ");
				customerBalance = EasyIn.getInt();
			    theCustomers[index]= new Customer(customerName,customerId,customerBalance);
			
			}
			for(index=0;index<customersInArray;index++)
				{
				if (index==0)
					{
						LowestBalance=theCustomers[index].getBalance();
						customerLowestBalance=theCustomers[index].getName();
					}	
				else if (LowestBalance>theCustomers[index].getBalance())
					{
						customerLowestBalance=theCustomers[index].getName();
						
					}		
				}
		System.out.println("Lowest balance custumer are " +customerLowestBalance);
	}

}
