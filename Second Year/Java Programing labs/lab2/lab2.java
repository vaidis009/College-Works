/*
** Author: vaidas Siupienius	Date: October 2015
* As Q1 except….repeatedly input an integer value until the user enters a sentinel value (such as -1), e.g.

No. of stars ? (-1 to quit) 4
****
No. of stars ? (-1 to quit) 2
**
No. of stars ? (-1 to quit) -1
Goodbye…

** pseudocode:
*read integer value 
*if value is not less like0 output *
*read value 
*if value is not less like0 output *
*/
public class lab2
{

	public static void main(String args[])
	{
		int num;
		int i;
		
		
		System.out.println("Please enter number");
		num = Keyboard.readInt();
while (num>=0)	
{	
		for (i=0;i<num;i++)
		{		
			System.out.print("*");
		}
			System.out.println("\nPlease enter number");
			num = Keyboard.readInt();

		}	
	
	}
}
