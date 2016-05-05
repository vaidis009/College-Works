/*
** Author: vaidas Siupienius	Date: October 2015
*Write a Java application to input a number between 1 and 10 and then print the factorial of that number, e.g. 5! = 5.4.3.2.1. 
** pseudocode:
*
*read integer between 1 and 10 
*print/count interger down
*
*/
public class lab4
{

	public static void main(String args[])
	{
		
		int num;
		int i ;
		
		System.out.println("Please enter the number between 1 and 10 ");
		num=Keyboard.readInt();
		
		if (num >10 || num <1)
		{
		System.out.println("Number have to be between 1 and 10. Please enter the number again ");
		num=Keyboard.readInt();			
		}
			System.out.print(num +"!= ");
		while (num>=0)
		{		
			for (i=0;i<num;i++)
				{			
					System.out.print(num +", ");
					num=num-1;			
				}			
		}
	}
}
