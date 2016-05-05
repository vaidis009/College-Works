class Jlab68

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				12/01/15
//Purpose :Write a method secondLastSpace() that takes a string as its argument and returns as 
 //its result the index position of the second last space in the string	

{
	public static int secondLastSpace(String Asentence)
		{
			int AsecondLastSpace = 0;
			int countSpace= 0 ;
			int index = 0;
		
			for (index= Asentence.length()-1; index>=0;index-- )
				{ 
					if (Asentence.charAt(index)== ' '&& countSpace<=1   )
						{
							AsecondLastSpace=index;
							countSpace ++;
							System.out.println ("....." + AsecondLastSpace);
						}
				
				}			
			return AsecondLastSpace ;
		}	
	public static void main(String[] args) 
	    {
	    	
		    String sentence ;
		    int lastSpace;
		    int sentenceLength =0 ;
		    
		    System.out.println ("Please enter the sentence: ");
		    sentence = EasyIn.getString();
		    
		    sentenceLength= sentence.length();
		    lastSpace=secondLastSpace(sentence);
		   
		    if (lastSpace >1)
			    {
			   		System.out.println ("Possition of the second last space are: " + lastSpace);
		    	}
		   	else
		    	{
		    		System.out.println ("There is no second spaces " );
		    	}
	    }
}  