class Jlab2b5

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* 5.	Write a program that takes as input the number of a month and outputs the name of that month. 
 *		(Write this with and if statement and a switch statement) 
*/

{
    public static void main(String[] args) 
    
    {
    	
    	int month ;
    	
    	
    	
    	System.out.println ("Please enter number of month (1-12).");
    	month = EasyIn.getInt(); 
    	
    	switch (month)
    	
    		{
    		case 1:
    			System.out.println("You have enter January.") ;
    			break ;
    		case 2 :
    			System.out.println("You have entered February") ;
    			break ;
    		case 3 :
    			System.out.println ("You have entered March") ;
    			break ;
    		case 4 :
    			System.out.println ("You have entered April") ;
    			break ;
    		case 5 :
    			System.out.println ("You have entered May") ;
    			break ;
    		case 6 :
    			System.out.println ("You have entered June ") ;
    			break ;
    		case 7 :
    			System.out.println ("You have entered July") ;
    			break ;
    		case 8 :
    			System.out.println("you have entered August") ;
    			break ;
    		case 9 :
    			System.out.println ("You have entered September ");
    			break ;
    		case 10 :
    			System.out.println ("You have entered October ") ;
    			break ;
    		case 11 :
    			System.out.println ("You have entered November") ;
    			break ;
    		case 12 :
    			System.out.println ("You have entered December") ;
    			break ;
    			56
    			
    	 		default:
    	 		System.out.println("wrong input") ;
    		}
    	
    	
    	
       
    }
  }  