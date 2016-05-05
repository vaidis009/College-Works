/*
** Author: vaidas Siupienius	Date: October 2015
*
*Q3. As Q1 except….print out the following pattern of *'s, e.g.

No. of stars ? 4
****
***
**
*

*
*
*
** pseudocode:
*
*read integer
*print * until index will be same as input integer
*move line
*print one *less
*do while *=0
*/
public class lab3
{

	public static void main(String args[])
	{
		
		int num;
		int i=0 ;		
		
		System.out.println("Please enter the number");
		num=Keyboard.readInt();
		
		while (num>=0)
		{	
			for (i=0;i<num;i++)
				{			
					System.out.print("* ");			
				}
				num=num-1;
				System.out.println("");	
		}	
	
	}
}
