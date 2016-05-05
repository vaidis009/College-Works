class Jlab71

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				12/01/15
/*Purpose :3)	Modify 2) above so that it tells you how many times the highest and lowest number appeared
*/
{
	public static void main(String[] args) 
	 {
	    
	    
	    int numArray[];
	    int i= 0;
	    int numbersAmount;
	    int highest = 0 ;
	    int highestTime = 0 ;
	    int lowest = 0 ;
	    int lowestTime= 0 ;
	    	    
	    System.out.println("Please enter how many numbers:");
	    numbersAmount= EasyIn.getInt();
	    
	    numArray = new int [numbersAmount];
	    
	    for (i= 0;i<numbersAmount; i++)
		    {
		    	System.out.println("Please enter the number.");
		    	numArray[i] = EasyIn.getInt();
		    	
		    }
		for(i=0;i<numbersAmount;i++)
		    {	
		    	if (i==0)
			    	{
			      		highest = numArray[i];
			    		lowest= numArray[i];
			    	}
			   if(highest==numArray[i])
			    	{
			    		highestTime++;	
			    	}			    	
		    	if(highest<numArray[i])
			    	{
			    		highest=numArray[i];
			    	}
			    	if(lowest==numArray[i])
			    	{
			    		lowestTime++;	
			    	}  	
		    	if(lowest>numArray[i])
			    	{
			    		lowest=numArray[i];
			      	}  		
		    }	    
	    System.out.println("The highest number are: " + highest);
	    System.out.println("The highest number was enter: " + highestTime + " times");
	    System.out.println("The lowest number are: " + lowest);
	    System.out.println("The lowest number was enter: " + lowestTime + " times");
	    
	 }
}  