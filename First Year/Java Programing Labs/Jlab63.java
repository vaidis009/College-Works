class Jlab63

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose :)      Write a method alphaCount() that takes a string as its argument 
 *and returns the number of alphabetic characters in that string
 **/
{
	 public static int alphaCount(String text) 
	{
		int alphabetics;
		boolean correct ;
		int index;
		char character ;
		
		alphabetics=0;
		index= 0;
		
		while (index<text.length())
		{
			if (text.charAt(index)>='A'&& text.charAt(index) <='Z'|| text.charAt(index)>='a'&& text.charAt(index)<='z')
				{
					correct = true;
					alphabetics++;
				}
			else 
				{	
				correct = false;
				}
			index++;
		}		
		return alphabetics;
	
	}

    public static void main(String[] args) 
    {
    
	  String sentence;
	  int numAlphabetics ;
	  
	  System.out.println("Please enter sentence.");
	  sentence= EasyIn.getString();
	  
	  numAlphabetics=alphaCount(sentence);
	  
	  System.out.println ("Alphabetics in this sentence is: " + numAlphabetics);
  
	}


}  