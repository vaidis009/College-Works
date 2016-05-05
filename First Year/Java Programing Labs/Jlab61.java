class Jlab61

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose :)       Write a method called isEven() that takes an integer as its argument
                and returns true if the argument is an even number otherwise it returns false. 
*/
{
	public static boolean isEven(int number) 
	{

    boolean numberEven ;
	
	if (number % 2 ==0)
	{
		numberEven=true; 
	}
	else
	{
	numberEven=false; 
	}
	
	return numberEven;
	
		}
	
    public static void main(String[] args) 
    {
    
   int num ;
   boolean numEven;
	
   System.out.println ("Please enter the number");
   num= EasyIn.getInt();
   isEven(num);
   numEven=isEven(num);
   if (numEven==true)
   {
   	 System.out.println ("Even");
   
   }
   else
   {
   	System.out.println ("Odd");
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	}


}  