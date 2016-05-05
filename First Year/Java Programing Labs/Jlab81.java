class Jlab81

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				04/03/15
/*Purpose :1)	Write a method findHighest that takes an array of integers
 * as its argument and returns as its result the index position of the highest number in the array
 */
 
 
{	
	public static int highestInArray(int AnumArray[])
   	 {
   	 	int highestNumPos= 0  ;
   	 	int highestNum = 0 ; 
   	 	int index = 0 ;
   	 	
   	 	for (index= 0 ; index<AnumArray.length;index++ )
   	 		{
   	 			if (highestNum<AnumArray[index])
	   	 			{
	   	 				highestNumPos= index; 	
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
		 
		 System.out.println("Please select how many numbers");
		 numInArray = EasyIn.getInt();	 
		 
		 numArray = new int [numInArray]; 
		 
		 for(i=0;i<numInArray;i++)
			 {
			 	 System.out.println("Please enter numbers");
			 	 numArray[i] = EasyIn.getInt();		 	
			 }
			 		 
		 higestNumIndex= highestInArray(numArray);
		 
		 System.out.println("highest number is in position "+ higestNumIndex);
	 }				
}  