class Jlab77

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				04/03/15
/*Purpose :7)	Modify 6) above so it outputs on the screen how many palindromes were contained in the array

 */
 
 
{	

	public static void main(String[] args) 
	 {	 	
	 	String text[] ;
	    int i = 0 ;
	    int textIndex =0  ; 
	    int numText =0 ;
	    char frontChar= ' ' ;
		char backChar= ' ' ;
		boolean palindromValue= true ; 	 
		int pos = 0 ; 
		int palindromCount = 0 ;  
	    
	    System.out.println("Please enter how many entries");
	    numText = EasyIn.getInt();
	    
	    text = new String [numText];
	    
	    for (i=0 ;i<numText;i++)
		    {	    	
			    System.out.println("Please enter text:");
			    text[i] = EasyIn.getString();	    	
		    }
	   	for (i=0;i<numText;i++) // looking how many entries
		   	{	   	
				for (textIndex= 0;textIndex<= text[i].length();textIndex++) // looking every word
					{	
						pos= 0;
						palindromValue= true;			 
						while (palindromValue==true  && pos<Math.floor(text[i].length() /2 )) // checking every character
							 {
							   	frontChar = text[i].charAt(pos)	 ;   	
							   	backChar=text[i].charAt(text[i].length()-(pos+1));	 
							    
							   	if (frontChar !=backChar)
								   	{
								   		palindromValue=false;						    							    			    		
								   	}					    
							     pos++;		
							  }							 
	 				}   
			 	if (palindromValue== true )
						 {
						 	palindromCount++;
						 	System.out.println(text[i]+ " This is palindrom!");	
						 	System.out.println("Palindroms in the array:   "+ palindromCount );
						 }
				else 
						 {
					    	System.out.println(text[i]+ " This is NOT palindrom!");
		  			     }	   		  			 
			 }				   				   	
	 }				
}  