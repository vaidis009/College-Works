class Jlab52

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose :Modify the program at (2) so that it outputs the number of words in the user's input,
 * with the average, minimum and maximum number of characters in the words
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
		int minimum;
		int maximum;
		double average ; 
		int sum ;
		
		sum =0 ;
	    minimum = 0 ;
		maximum = 0 ;
		average = 0.0 ;
		word = " ";
		wordCount   = 0 ;
		characterCorrect= true ;
		character = 0;
		//input
		System.out.println ("Please enter text:");
		text=EasyIn.getString ();
		
		text=text.trim()+ " "; //removes spaces all in beggining and end spaces and adding 1 space to see last word 
		space= text.indexOf(" ");
		text =text.replaceAll("\\s+", " "); // remove space from string
		
		while (space !=-1)

		{
	       	word= text.substring(0,space);
        	text=text.substring(space+1);
        	space= text.indexOf(" ");	
        	index = 0;
        	character =0 ;
        	characterCorrect= true ;
        	
        	if (wordCount==0)
					{
						minimum= word.length();
						maximum = word.length ();
					}
			if (word.length()<minimum)
					{
						minimum= word.length();
					}
			if(word.length()>maximum)
					{
						maximum = word.length();
					} 
        
        	// checking is the characters is valid
			while (index < word.length() && characterCorrect == true )
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
						sum=sum +character ;
					}
			
			average = (double)sum/wordCount;		
					
		}
		
	
		System.out.println ("Total correct word " +wordCount);
		System.out.println ("Minimum characters is: " +minimum);
		System.out.println ("Maximum characters is: " +maximum);
		System.out.println ("Characters average is: " +average);  	
    }
  }  