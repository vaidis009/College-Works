class Jlab2b4

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : 	4.	Modify the program in 3 above so it gives you the numbers in ascending order, i.e. lowest, middle, highest 
*/

{
    public static void main(String[] args) 
    
    {
        int numberA ;
        int numberB ;
        int numberC ;
        
        int lowest ;
        int middle ;
        int highest ;
        
        
        System.out.println ("Please enter number A") ;
        numberA = EasyIn.getInt ();
        System.out.println ("Please enter number B") ;
        numberB = EasyIn.getInt ();
    	System.out.println ("Please enter number C") ;
        numberC = EasyIn.getInt ();
        
        if (numberA < numberB && numberA < numberC)
        {
        	lowest = numberA ;
        }
        else if (numberB < numberA && numberB <numberC)
        {
         lowest = numberB ;	
        }
        else 
        {
        	lowest = numberC ;
        }
        
        if (numberA > numberB && numberA > numberC)
        {
        	highest = numberA ;
        }
        else if (numberB > numberA && numberB > numberC)
        {
         highest = numberB ;	
        }
        else 
        {
        	highest = numberC ;
        }
        
        if (numberA > numberB && numberA < numberC)
        {
        	middle = numberA ;
        }
        else if (numberB < numberA && numberB > numberC )
        {
         middle = numberB ;	
        }
        else if(numberB > numberA && numberB < numberC )
        {
        	middle = numberB ;
        }
        else 
         {
         	middle =numberC ;
         }
      
       
               
        
        
        System.out.println (lowest) ;
        System.out.println (middle) ;
        System.out.println (highest) ;
        
    	}
  }  