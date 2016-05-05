class Jlab71

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				12/01/15
/*Purpose :1)	Write a program that reads in an array of integers
 and then displays the number of odd and even numbers in the array.
 Use a method you have written already isEven()on each array element. 
*/
{	public static boolean evenNumberMethod( int numbers) 
		{
			boolean AevenNumber = false ;
			int index = 0 ;
			
			if (numbers % 2==0)
				{
					AevenNumber= true;			
				}
			else 
				{
					AevenNumber= false ;	
				}		
		 	return AevenNumber;	
		}	
	public static void main(String[] args) 
	    {
	    	int amountNumbers = 0 ;
	    	int numbers[] ;
	    	boolean checkingNumbers ;
	    	int evenNumber = 0;
	    	int oddNumbers = 0;
	    	int index = 0 ;
	    	
	    	System.out.println("Please enter how many numbers: ");
		   	amountNumbers= EasyIn.getInt();
		   
		    numbers= new int[amountNumbers] ;
		   
		    for (index=0 ; index<amountNumbers; index++)
			    {
			    	System.out.println("Please enter the number: ");
			    	numbers[index] =EasyIn.getInt();
			    	
			     }	
			    	
			 for (index= 0 ;index <amountNumbers;index++)
			 {
			    	checkingNumbers= evenNumberMethod(numbers[index]);
					      	
				   if (checkingNumbers==true)
					   {
					   	evenNumber++;
					   }
				   else
					   {
					   	oddNumbers++;
					   }
		  	  }	
		   System.out.println ("You enter "+ evenNumber + " even numbers." );
		   System.out.println ("You enter "+ oddNumbers + " odd numbers." );
		   
	    }
}  