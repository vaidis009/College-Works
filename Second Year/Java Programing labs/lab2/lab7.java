/*
** Author: vaidas Siupienius	Date: October 2015
*
*Write a Java application that will teach the user basic multiplication 
*(up as far as 12 times tables). Use Math.random() to produce two positive one-digit integers.
* It should then display a question as follows:

How much is 6 times 7 (-1 to quit) ? 43
No, please try again.
How much is 6 times 7 (-1 to quit) ? 42
Very good!
How much is 12 times 12 (-1 to quit) ? 145
No, please try again.
How much is 12 times 12 (-1 to quit) ? -1
Goodbye…

** pseudocode:
*
*store minimum and maximum value 
*ask the multiplication  answer
*calculate the answer 
*check are they are equal
*give the answer
*ask new quation until entered -1 as answer
*/
public class lab7
{

	public static void main(String args[])
	{
		
		final int min= 1;
		final int max=12;
		int num1 ;
		int num2 =0;
		int correctAswer=0;
		int userAnswer=0;
		
		
		num1=(int)(Math.random() * max) + min; // calculate random number between 1and 12
		num2=(int)(Math.random() * max) + min;
		System.out.println("How much is "+ num1 +" times "+ num2 +" ?  (-1 to quit)");
		System.out.println("Your answer");
		userAnswer= Keyboard.readInt();
		
		while(userAnswer!=-1)		
		{	
			correctAswer=num1*num2;
			if (userAnswer==correctAswer)
				{
					System.out.println("Very good!");
					num1=(int)(Math.random() * max) + min; // calculate random number between 1and 12
					num2=(int)(Math.random() * max) + min;
					System.out.println("How much is "+ num1 +" times "+ num2 +" ?  (-1 to quit)");
					System.out.println("Your answer");
					userAnswer= Keyboard.readInt();			
				}
		 	if(userAnswer!=correctAswer && userAnswer!=-1)
		 		{
		 			System.out.println("No, please try again.");
		 			System.out.println("How much is "+ num1 +" times "+ num2 +" ?  (-1 to quit)");
					System.out.println("Your answer");
					userAnswer= Keyboard.readInt();
				}		
		}
		System.out.println("Goodbye");
	
	}
}
