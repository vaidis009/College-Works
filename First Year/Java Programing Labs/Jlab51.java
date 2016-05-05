class Jlab51

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 	Write a program which will input a string from the keyboard, and output the number of separate words, 
 *where a word is one or more characters separated by spaces.
 * Your program should only count as words groups of characters in the ranges A..Z and a..z
 */

{
    public static void main(String[] args) 
    
    {
      	
		String text ;
		String word ;
		int wordCount ;
		int space ;
		int index =0 ;
		boolean characterCorrect ;
		int character ;
		
		word = " ";
		wordCount   = 0 ;
		characterCorrect= true ;
		character = 0;
		//input
		System.out.println ("Please enter text:");
		text = EasyIn.getString ();
		
	

		text=text.trim()+ " "; //removes spaces all in beggining and end spaces and adding 1 space to see last word 
		space= text.indexOf(" ");
		text= text.replaceAll("\\s+", " ");// remove space from  string
		
		System.out.println ("Total correct word " +text);
		
	
		while (space !=-1)

		{
	       	word= text.substring(0,space);
        	text=text.substring(space+1);
        	space= text.indexOf(" ");	
        	index = 0;
        	character =0 ;
             characterCorrect= true;  			
        	// checking is the characters is valid
			while (index < word.length() && characterCorrect== true)
				{
					
					if(word.charAt(index)>= 'A'&& word.charAt(index)<='Z')
						{
							character++;
						}	
					else if (word.charAt(index)>= 'a'&& word.charAt(index)<='z')
						{
										
							character++;
						}
					else 
					
						{
							characterCorrect= false;
						}
					index ++;
					
				}
			
				
				// if characters and word length is same incrementing word counter
				if (character == word.length())
						{
							wordCount++;
						}
						
				System.out.println ("word " +word);
		}
		
		
		System.out.println ("Total correct word " +wordCount);
	
	
    }
  }  