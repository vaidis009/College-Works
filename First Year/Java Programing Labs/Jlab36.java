class Jlab36

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 	6)	Modify the above program so that it tells the user if the highest 
 *or lowest number has been entered more than once, and if so how many times.
*/

{
    public static void main(String[] args) 
    
    {
    
		   
		   
		    int number; 
		    int largest ;
		    int smallest ;
		    double average ;
		    int sum ;
		    int index ;
		    int timesLargest;
		    int timesSmallest ;
		    
		    System.out.println("Please enter the number or 0 to exit.") ;
		    number =EasyIn.getInt();
		    largest =0; 
		    smallest = number;
		    average = 0 ;
		    sum= 0; 
		    index =0;
		    timesLargest = 0;
		    timesSmallest = 0 ;
		    
		    while (number !=0) 
   				{
   					index++ ;
   					
   					if (number >largest)
   						{
   							largest = number ;
   							timesLargest = 0;		   								
   						}
						   				
   					if ( number <smallest)
   						{
   							smallest =number ;
   							timesSmallest = 0 ;
   							
   						}
	   			
	   			    if ( number==largest)
			   			{			
			   		 		timesLargest= timesLargest+1;	
			   			}
			   		else if (number==smallest )		
						{
							timesSmallest= timesSmallest+1;
						} 
						sum = sum + number ;
   						average =(double)sum/index ;
						
   				System.out.println("Please enter the number.") ;
		        number =EasyIn.getInt ();
   				}
   	   				
   				System.out.println ("Largest number is " + largest);
   				System.out.println ("smallest number is " + smallest);
   				System.out.println ("average number is " + average);
   				System.out.println ("Total numbers was entered: " + index);
   				System.out.println ("Total largest numbers was entered: " + timesLargest);
   				System.out.println ("Total smallest numbers was entered: " + timesSmallest);
   
   		
    }
  }  