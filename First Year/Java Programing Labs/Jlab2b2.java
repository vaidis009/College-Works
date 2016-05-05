class Jlab2b2

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 		. 2.	Write a program to calculate credit card interest. 
                          Interest is charged at 12% for the first €500 and at 18% for any remaining amount over €500. 
*/

{
    public static void main(String[] args) 
    
    {
        final double UNDER_500 = 0.12 ;
        final double OVER_500 =	0.18 ;
        final int less_interest = 500 ;
        
        Double  credit ;
        Double credit_interest ;
        
        System.out.print ("Please enter credit amount.") ;
        credit = EasyIn.getDouble () ;
        
        // calculation
        if (credit <500)
        {
        	credit_interest = credit * UNDER_500 ;
        	System.out.print (credit_interest) ;
        }
        else
        {
        credit_interest = (credit - less_interest)* OVER_500 + (less_interest * UNDER_500);
        System.out.print (credit_interest) ;	
        }
        
    
       
         
   
    	}
  }  