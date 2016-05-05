class Jlab71

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				12/01/15
/*Purpose :4)	Write a program that reads in an array of alphabetical 
 characters and tells you how many vowels and consonants were present in the array. 
 Hint - write this in such a way that avoids large compound conditions.
 */
{	
	public static boolean checkVowel(char characters)
	{
		 boolean thisVowel = false ;
		  
		 if (characters == 'a' ||characters == 'u' ||characters == 'i' ||characters == 'e' ||characters == 'o' )
			{
				thisVowel= true;
			}	
		 return thisVowel ;
	}	
	public static void main(String[] args) 
	 {
	    char charactersArray[];
	    int numChar ;
	    int i = 0 ; 
	    int vowels = 0 ;
	    int consonants = 0 ;
	    boolean isVowels = true ; 	    
	    
	    System.out.println("Please enter how many characters");
	    numChar = EasyIn.getInt ();
	    
	    charactersArray = new char [numChar] ;
	    
	    for (i= 0 ;i <numChar; i++)
		    {
		    	System.out.println("Please enter character"); // enter data to array 
		    	charactersArray[i]= EasyIn.getChar();
		    }	
		for (i=0;i<numChar;i++)	  
			{  	
		    	isVowels = checkVowel(charactersArray[i]);	 // sending to method   	
		    	
		    	if (isVowels ==true)
			    	{
			    		vowels++;
			    	}
		    	else 
			    	{
			    		consonants++;
			    	}
			 }  
	    System.out.println("Total vowels are:" + vowels);
	    System.out.println("Total consonants are:" + consonants);
	 }
}  