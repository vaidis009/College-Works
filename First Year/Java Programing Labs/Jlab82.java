class Jlab82

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				04/03/15
/*Purpose :2)	Write a method which takes an array of integers as its argument and returns as its result
 * the number of times the highest number appeared. Use it in conjunction with the method written in 1) above
 */
 
 
{

	public static int highestInArray(int AnumArray[], int AnumInArray)
   	 {
   	 	int highestNumPos= 0  ;
   	 	int highestNum = 0 ; 
   	 	int index = 0 ;
   	 
   	    if(index==0)
   	    {
   	    	highestNum=AnumArray[index];
   	    }
   	 	for (index= 0 ; index<AnumInArray;index++ )
   	 		{
   	 			if (highestNum<AnumArray[index])
	   	 			{
	   	 				highestNumPos=index;	   	 		 	
	   	 			} 	   	 				  	 			
   	 		}   	 
   	 	return highestNumPos ;    	 		 	
	 }

	public static void main(String[] args) 
	 {	 	
		 int numInArray = 0 ; 
		 int numArray[] ; 
		 int higestNumIndex = 0 ; 
		 int i = 0 ;
		 int highestTimes =0 ;	 
		 
		 System.out.println("Please select how many numbers");
		 numInArray = EasyIn.getInt();	 
		 
		 numArray = new int [numInArray]; 
		 
		 for(i=0;i<numInArray;i++)
			 {
			 	 System.out.println("Please enter numbers");
			 	 numArray[i] = EasyIn.getInt();		 	
			 }
		higestNumIndex= highestInArray(numArray, numInArray);
		for (i=0;i<numInArray;i++)
		{
			if (numArray[higestNumIndex]== numArray[i])
				{
					highestTimes++;
				}
		
		}	 		 
		
		 
		 System.out.println("Higest number index are  "+ higestNumIndex );
		 System.out.println("highest number was appear  "+ highestTimes + "times");
	 
	 }				
}  