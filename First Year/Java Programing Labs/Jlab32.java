class Jlab32

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 		2	Write a program that will find the sum of a collection of data values.
 *                       Your program should terminate when a zero value is read.
*/

{
    public static void main(String[] args) 
    
    {
    	int num ;    	
    	int sum=0;
    	
        System.out.println ("Please enter the number.");
	    num = EasyIn.getInt();
	    	
    	while (num!=0)
	        {
	        	sum= sum + num ;
		        System.out.println ("Please enter the number.");
		        num = EasyIn.getInt();
		        
		        
	        
	        }
 
 		System.out.println ("\nResults is " + sum) ;
		     
   
    }
  }  