class Prj11415sample

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				18/12/14
// Purpose : 		

{	public static void main(String[] args)
		{
			String Awords = "" ; 
			String Aword = "" ; 
			String Asentence = "" ;
			int index = 0 ; 
			int space = 0 ;	
			
			space= Asentence.indexOf(" ");
			Asentence= Asentence.trim()+" ";
			
			System.out.println("Please enter the sentence.");
	    	Asentence = "This i$ an aardvaAr yeEeeAs onDO qwerty XYZ9";	
			
			space= Asentence.indexOf(" ");
			Asentence= Asentence.trim()+" ";
			
				while (space !=-1)
			{
				//slice the sentence to words
				index++;
				Aword= Asentence.substring(0,space);
				Asentence= Asentence.substring(space+1);
				index =0;
				space= Asentence.indexOf(" ");
			Awords = Awords + " " + Aword ;
			
					
			}			
	
			
	System.out.println ("The number of valid words: "+ Awords);
		}
}