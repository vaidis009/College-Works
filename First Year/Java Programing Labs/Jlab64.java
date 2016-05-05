
class Jlab64


// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose :)     Write a method award() that takes a mark as its argument and returns 
 *as its result a String containing the values of either "Distinction", "Merit1", "Merit2", 
 *"Pass" or "Fail" where these are calculated as follows
		Distinction	70 - 100
		Merit1		63 - 69
		Merit2		55 - 62
		Pass		40 - 54
		Fail		Less Than 40

 **/
{
	 public static String award(int studentMarks)
	 {
	 	String results; 
	 
	  	results = "";
	 	
	 	if (studentMarks>=70)
		 	{
		 		results="Distinction";
		 	}
	 	else if (studentMarks>=63)
		 	{
		 		results ="Merit1";
		 	}
	 	else if (studentMarks>=55)
		 	{
		 		results= "Merit2";
		 	}
	 	else if (studentMarks>=40)
		 	{
		 		results = "Pass";
		 	}
	 	else
		 	{
		 		results="Fail";
		 	}
	 	
	 	return results;	// returning resuts
	 }

    public static void main(String[] args) 
    {
    	
	    int marks;
	    String yourResults;
	    
	    marks=0;
	    
	   //inputs
	    System.out.println("Please enter your marks.");
	    marks = EasyIn.getInt(); 
	    //sending to method
	    yourResults = award(marks);
	    
	    //outputs
	    System.out.println ("Results are: " + yourResults);
    
	}
}  