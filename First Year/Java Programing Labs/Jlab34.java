class Jlab34

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 		4)	Write a program to find the largest, smallest and average value in a collection of N numbers.
 *                     (Run the program numbers.exe on the Common Disk to see how it should work)
*/

{
    public static void main(String[] args) 
    
    {
    
		 int number =0;
		 int largest =0;
		 int smallest =0;
		 int index= 0 ;
		 int sum = 0;
		 int numNumbers ;
		 double  average = 0;
		 
		 System.out.println ("Please enter how many number:");
		 numNumbers=EasyIn.getInt();
		
		 for (index=0;index<numNumbers;index++)
			 {
			 	System.out.println("Please enter the  number :");
			    number = EasyIn.getInt ();
			    
			    if (index==0)
			    {
			    	 smallest=number;
			    	 largest = number;
			    }  
			 	if (number <smallest)
			 	{
			 		smallest= number ;
			 	}
			 	if (number > largest)
			 	{
			 		largest = number ;
			 	}
			    sum=sum + number;	
			    average = (double)sum / numNumbers	;
			 	
			 	
			 }
			 
		 
	 	 System.out.println ("Numbers was entered " + numNumbers );
		 System.out.println ("Largest number was entered " + largest);
		 System.out.println ("Smallest number was entered " + smallest);
		 System.out.println ("Numbers average is  " + average);
		 

    }
  }  