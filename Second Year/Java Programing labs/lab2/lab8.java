/*
** Author: vaidas Siupienius	Date: October 2015
*
*
*Write a program that inputs a positive integer (must be >1) from the 
*user and then prints out all the prime numbers up to that integer.
Recall that a number is a prime number if it is not divisible by any number except 1 and itself.
(You will need to use stepwise refinement in your pseudocode)



** pseudocode:
*
*read user input
*check is it >1
*check for prime numbers
*print prime numbers up to that number 
*/
public class lab8
{

	public static void main(String args[])
	{
		
		int userInput =0;
		int primeNum = 1 ; 
		int i =1;
		int count =0;	
		
		
		System.out.println("Please enter the number (must be >1)");
		userInput=Keyboard.readInt();	
		
		if (userInput<1)
		{
			System.out.println("Wrong!!!  Please enter the number (must be >1)");
			userInput=Keyboard.readInt();	
		}
		while (i<=userInput)
		{		
			if (userInput%i==0 )
			{
				count++;			
			}
			i++;
		}
		if (count==2)
			{
				System.out.println("Prime number");
						count =0;
						i =1;
						while (primeNum<=userInput)
							{	
								while (i<=primeNum)
								{
								if (primeNum%i==0 )
									{
										count++;													
									}
								
								i++;
							}
							primeNum++;		
							if (count==2)
								{
									System.out.println("prime"+primeNum);
								}
							}	
							
			}
		else {
				System.out.println("NOT prime number");	
			}
			
			
		/*
		 *	i=1;
				count =0;	
				while (primeNum<userInput)
				{
					if (primeNum%i==0 )
					{			
						count++;				
					}
				
				primeNum++;	
				
				if (count==2)
					{
						System.out.println(i);
					}
				}
				i++;	
			}
			*/	
			
		
	}
}
