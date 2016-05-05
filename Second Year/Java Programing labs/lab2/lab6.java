/*
** Author: vaidas Siupienius	Date: October 2015
*
*Write an application that produces a multiplication table showing 
*the results of multiplying  the integers 1 through 12 by themselves. (Use a for loop here)
*
** pseudocode:
*
*
*/
public class lab6
{

	public static void main(String args[])
	{
		final int highest=12;
		int num1=1;
		int num2=1 ;
		int i=0;	
		
		for (i=0;i<highest;i++)
		{
			
		System.out.print(num1+" * "+num2+"="+num1*num2);
			System.out.println("");
			num1++;
			num2++;	
		}	
		
		
		
	
	}
}
