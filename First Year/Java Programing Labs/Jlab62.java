class Jlab62

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose :)      Write a method called isAlpha() that takes a character as its argument 
 *and returns true if the character is alphabetic i.e. in the range A-Z, a-z, otherwise it returns false.
*/
{

	public static boolean isAlpha(char cC) 
	
	{
		boolean characterCorrect;
		
		if (cC>='A'&& cC <='Z'|| cC>='a'&& cC <='z')
			{
				characterCorrect= true;
			}
		else 
			{
				characterCorrect= false;
			}
		
		return characterCorrect;	
	}
	
    public static void main(String[] args) 
    {
    
  
	   char character; 
	   boolean correct ;
	   
	   
	   System.out.println ("Please enter character.");
	   character= EasyIn.getChar();
	   
	   correct= isAlpha(character);
	   
	   if (correct==true)
		   {
		   	System.out.println ("Chareacter is alphabetic.");
		   }
	   else
		   {
		   	System.out.println ("This is not alphabetic character.");
   		   }
   
	}


}  