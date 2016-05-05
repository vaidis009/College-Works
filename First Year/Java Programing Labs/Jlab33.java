class Jlab33

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 		3)	Write a program to read a list of integer values which will find and
						 * display the index of the first occurrence and the last occurrence of the number 12. 
						 *Your program should print the Index values of 0 (zero) if the number 12 is not found. 
						 *The index is the sequence number of the data item 12. For 
						 *example if the 8th data item is the only 12, the index value 8 should be displayed for 
						 *the first and last occurrence.
*/

{
    public static void main(String[] args) 
    
    {
    
    	int number;
    	int first12;
    	int last12;
    	int index ;
    	
    	System.out.println ("Please enter the number to exit please enter 0.");
    	number = EasyIn.getInt();
    	index=0 ;
    	first12 =0 ;
    	last12 = 0 ;
    	while (number !=0 ) 
	    	{
	    		
	    		index++ ;
	    		
	    		if (first12 ==0 && number ==12 )
		    		{
		    			first12 = index ;
		    		} 
	    		if (number ==12)
		    		{
		    		
		    		last12 = index ;
		    		}
		    		
	    		System.out.println ("Please enter the number. ");
    			number = EasyIn.getInt();	
	    	}
    	
    	
		     System.out.println ("First 12 number index is " + first12) ;
   			 System.out.println ("Last 12 number index is " + last12) ;
    }
  }  