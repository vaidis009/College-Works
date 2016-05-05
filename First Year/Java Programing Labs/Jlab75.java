class Jlab75

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				12/01/15
/*Purpose :5)	Write a program that reads in an array of alphabetic characters and tells 
 *you if this array of characters is a palindrome or not. 
 *What is the main difference in terms of implementation between this program and your last project?
 */
{	
	
	public static void main(String[] args) 
	 {
	    
	    char characters[] ;
	    int i = 0 ;
	    int numChar =0 ;
	    boolean palidromValue = true ; 
	    char frontChar = ' ';
	    char backChar =' '; 	    
	    
	    System.out.println("Please enter how many characters.");
	    numChar = EasyIn.getInt();
	    
	    characters = new char [numChar];
	    
	    for (i=0 ;i<numChar;i++)
		    {	    	
			    System.out.println("Please enter character:");
			    characters[i] = EasyIn.getChar();	    	
		    }
	    
	    i=0;
	    while (palidromValue==true  && i< numChar /2 )
	    {
	    	
	    	frontChar = characters[i];	    	
	    	backChar= characters[numChar-1];	    
	    	 System.out.println(frontChar +"   "+backChar);	
	    	if (frontChar !=backChar)
		    	{
		    		palidromValue=false;
		    		
		    	}
	    		i++;
	    		backChar--;
	    	     
	    }	
	    
	    if (palidromValue==true)
	    {
	    System.out.println("This is palendrom! ");	
	    }
	    else
		    	{
		    		
		    		System.out.println("This is NOT palendrom! ");	
		    	}
	    
	    
	    
	 }
}  