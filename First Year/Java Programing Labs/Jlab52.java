class Jlab52

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
/* Purpose : Modify the program at (2) so that it outputs the words input
 * by the user in reverse order ("This word is 3 chars"   becomes "chars 3 is word This")
 */

{
    public static void main(String[] args) 
    
    {
      	
		String text ;
		String word ;
		int space ;
		int index =0 ;
		String reverseWord ;
		
		reverseWord = "";
		word = " ";
			
		//input
		System.out.println ("Please enter text:");
		text = EasyIn.getString ();
		
		text=text.trim()+ " "; //removes spaces all in beggining and end spaces and adding 1 space to see last word 
		space= text.indexOf(" ");
		text= text.replaceAll("\\s+", " ");// remove space from  string
		
		while (space !=-1)
		{
	       	word= text.substring(0,space);
        	text=text.substring(space+1);
        	space= text.indexOf(" ");	
        	index = 0;
        	reverseWord= word +" " + reverseWord;
		}
		System.out.println ("Total correct word " +reverseWord);
		
	}
  }  