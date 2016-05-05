class Jlab35

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 		5)	Modify the above program so that it shows the current highest, 
 *                      current lowest and current average after each successive number is entered.
*/

{
    public static void main(String[] args) 
    
    {
    	
		 int number ;
		 int largest=0;
		 int smallest =0;
		 int index ;
		 int sum = 0;
		 int numNumbers ;
		 double  average = 0;
		 
		 System.out.println ("Please enter how many number:");
		 numNumbers=EasyIn.getInt();
	
		 for (index=1;index<numNumbers;index++)
			 {
			 	System.out.println("Please enter the  number :");
			    number = EasyIn.getInt ();
			  
			    if (index==1)
			      {
			      	smallest = number ;
			      	largest = number;
			      }
			 	else if (smallest >number)
			 	{
		
			 		smallest= number ;
			 	}
			 	else if (number>largest)
			 	{
			 		largest = number ;
			 	}
			    sum=sum + number;	
			    average = (double)sum / numNumbers	;
			 	
			 
			 	System.out.println ("Numbers was entered " + numNumbers );
				System.out.println ("Largest number was entered " + largest);
				System.out.println ("Smallest number was entered " + smallest);
				System.out.println ("Numbers average is  " + average);
		 
   		
   	 		}
   		
    }
  }  