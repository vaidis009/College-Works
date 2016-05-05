class Jlab68

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				12/01/15
//Purpose :Rewrite the previous program that incorporates a method called myLastSpace() that this time takes 2 arguments, 
// the first is a string and the second is an integer representing the position to start looking from backwards		

{
	public static int myLastSpace(String Asentence, int sentenceLength)
		{
			int AlastSpace = 0;
			int index = 0;
		
			for (index= sentenceLength-1; index>=0;index-- )
				{
					if (Asentence.charAt(index)== ' '&& AlastSpace<=0   )
						{
							AlastSpace=index;
							System.out.println ("....." + AlastSpace);
						}
				}			
			return AlastSpace ;
		}	
	public static void main(String[] args) 
	    {
	    	
		    String sentence ;
		    int lastSpace;
		    int sentenceLength =0 ;
		    
		    System.out.println ("Please enter the sentence: ");
		    sentence = EasyIn.getString();
		    
		    sentenceLength= sentence.length();
		    lastSpace=myLastSpace(sentence, sentenceLength);
		   
		    
		    if (lastSpace >0)
			    {
			   		System.out.println ("Possition of the last space are: " + lastSpace);
		    	}
		   	else
		    	{
		    		System.out.println ("There is no spaces " );
		    	}
	    }
}  