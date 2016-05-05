class Jlab54

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
// Purpose :) Write a program that implements each of the String methods you have encountered in your notes 

{
    public static void main(String[] args) 
    
    {
      	
	/*
	 *      upper letter
	 *		compair
	 *		charAt
	 *		length
	 *		index OF
	 *
	 */

	String text ;
	char character ;
	String upperCaseText ; 
	String firstWord ;
	int space ;
	String text2 ;
	int wordLength ;
	int index ;

	character = ' ';

	 
	System.out.println ("Please enter text:");
	text= EasyIn. getString ();
	System.out.println ("Please enter text:");
	text2= EasyIn. getString ();
	

	
	upperCaseText= text.toUpperCase();// retuns all text in upper case 
	space= text.indexOf(" "); // setting what character is space
	firstWord= text.substring(0,space); // returns first word in first text
    wordLength = firstWord.length();// returns number of first word characters
    character= text.charAt(index=0);// Returns first character
	if (text.equals(text2))
	{
		System.out.println ("\n\n\nThey are to same!");
	}
	else 
	{
		System.out.println ("\n\n\nThey are NOT same!");
	}



	System.out.println ("Upper case text:"+ upperCaseText);
	System.out.println ("Characters in your text:"+ character);
	System.out.println ("First word: "+ firstWord );
	System.out.println ("Word length:"+ wordLength);

	}


}  