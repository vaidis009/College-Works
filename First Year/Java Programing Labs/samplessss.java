class Prj11415sample

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				18/12/14
// Purpose : 		



{
 public static void main(String[] args)
	  {
	  	boolean valid ;
	  	int index ;
	    int character ;
	  	String correctWords ;
	  	int space ;
	  	String words ;
	  	String Asentence ;
	  
	   	character = 0 ;
	  	index= 0 ;
	  	valid = true;
	  	correctWords="";
	  	words="" ;
	  	
	  	System.out.println("Please enter the sentence.");
    	Asentence = "This i$ an aardvaAr yeEeeAs onDO qwerty XYZ9";
    	
    	
	  	space= Asentence.indexOf(" ");
	  	Asentence= Asentence.trim()+" ";
		while (space !=-1)
		  	{
			  	
			  	words= Asentence.substring(0,space);
			  	Asentence= Asentence.substring(space+1);
			  	
			  	space= Asentence.indexOf(" ");
			    character = 0 ;
	  	index =0;
	  	valid = true;
	  	 
	  	while (index < words.length() && valid == true)
	  	{
	  	  	if (words.charAt(index)>='A'&& words.charAt(index)<='Z'||words.charAt(index)>='a'&& words.charAt(index)<='z')
			  	{
			  	   valid = true;
			  	   character++;
			  	   
			  	   
			  	}
		  	else
			  	{
			  	  valid = false ;
			  	}
			  	index++;
			  	
		  	 	}
	  	
		  	if (words.length()==character)
		  	{
		  	correctWords= correctWords + words;
		  	}
		  
		  	
	  
	  	System.out.println("dsfgsdg" + correctWords);
	  	
	  	}
	  	
	  	
	  	
	  }
	  }
	  