class Jlab66

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				12/01/15
//Purpose : Write a method that myLastSpace() that takes a string as an argument and 
            //returns the index position of the last space in the string		

{
	public static int myLastSpace(String Asentence)
		{
			int AlastSpace = 0;
			int index = 0;
		
			for (index=Asentence.length()-1; index>=0;index-- )
				{
					if (Asentence.charAt(index)== ' '&& AlastSpace<=0   )
						{
							AlastSpace=index;	
						}
				}			
			return AlastSpace ;
		}	
	public static void main(String[] args) 
	    {
	    	
		    String sentence ;
		    int lastSpace;
		    
		    System.out.println ("Please enter the sentence: ");
		    sentence = EasyIn.getString();
		    
		    lastSpace=myLastSpace(sentence);
		    
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