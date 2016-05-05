/*
** Author: vaidas Siupienius	Date: October 2015
*
*
*. A mail order firm sells five different products whose retail prices are 

product 1	2.98
product 2	4.50
product 3	9.98
product 4	4.49	
product 5	6.87

Write a Java application that inputs a product number and quantity sold and calculates the retail 
value of goods sold. Use a switch structure to determine the retail price for the product.
The program should keep requesting the product number and quantity sold under the user enters 
an appropriate sentinel value for the product number. 

** pseudocode:
*
*create switch
*read product number 
*read quantity sold 
*output retail value for all product which he bought 
*read next rpoduct number and quantity sold  
*do until entered correct value
*
*/
public class lab5
{

	public static void main(String args[])
	{
		final int numOfProduct =5;
		int productNum=0;
		int quantity =0;
		double retailPrice=0; 
		boolean correctProduct=false;	
		
		System.out.println ("product 1	2.98 \nproduct 2	4.50 \nproduct 3	9.98 \nproduct 4	4.49 \nproduct 5	6.87");
			
		System.out.println ("Please enter product number");
		productNum=Keyboard.readInt();
		while (correctProduct==false)
		{
		
		if (productNum>numOfProduct)
		{
		System.out.println ("Please enter correct product number");
		productNum=Keyboard.readInt();
		}
		else{
			
	
		System.out.println ("Please enter quantity");
		quantity=Keyboard.readInt();
		correctProduct=true;
		
		}
		}
		switch (productNum)
		{
			case 1:
			
			retailPrice=quantity*2.98;
			break;
				case 2:
			
			retailPrice=quantity*4.50;
			break;
				case 3:
			
			retailPrice=quantity*9.98;
			break;
				case 4:
			
			retailPrice=quantity*4.49;
			break;
				case 5:
			
			retailPrice=quantity*6.87;
			break;			
		}
		
		
	
		
		System.out.println (retailPrice);
		
		
		
	
	
	}
}
