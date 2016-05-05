
class Prj11415sample

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				18/12/14
// Purpose : 		Project 

{		// checking is word is valid
	  public static boolean CheckValidWord(String checkWord )
	  {
	  	boolean valid ;
	  	int index ;
	    int character ;
	  
	   	character = 0 ;
	  	index= 0 ;
	  	valid = true;
	  	 
	  	while (index < checkWord.length() && valid == true)
	  	{
	  	  	if (checkWord.charAt(index)>='A'&& checkWord.charAt(index)<='Z'||checkWord.charAt(index)>='a'&& checkWord.charAt(index)<='z')
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
	  	return valid ;	  	
	  }	
	  // counting vovels  
	  public static int vowelsMethod(String AwordVowels )
	  {	  	  
	  	int vowelsCount ;	  	
	  	int index ;	  	
	   	  	
	  	vowelsCount = 0 ;	  	
	  	index= 0 ;
	  		  	
	  	AwordVowels = AwordVowels.toUpperCase(); // converting all letters to uppur case
	  	for (index=0;index<AwordVowels.length();index++)
		  	{
			  	if(AwordVowels.charAt(index)=='A' || AwordVowels.charAt(index)=='E' ||AwordVowels.charAt(index)== 'I' || AwordVowels.charAt(index)=='O' ||AwordVowels.charAt(index)== 'U' )
			  	{
			  		vowelsCount++;
			  	}		  
		  	}
	  	return vowelsCount;	  	 
	  }		
	   // main method
	 public static void main(String[] args)
	    {    	
	    	String sentence ;
	    	String words ;
	    	String goodWords ;
	    	String largetsVowelsWord;
	    	String largestConsonantWord;
	    	String shortestWordVowCon ;  // shortest word with to same amount vowels and consonants 
	    	String currentShortestWordVowCon ;
	       	int vovelsCount ;
	    	int consonansCount ;
	    	int wordsCount ;
	    	int index ;
	    	int space ;
	    	int maxVowels ;
	    	int maxConsonant;
	    	boolean validWords ;	    
	    
	       	shortestWordVowCon= ""; 
	    	largetsVowelsWord="";
	    	largestConsonantWord="";
	    	currentShortestWordVowCon="";
	       	goodWords="";
	    	consonansCount=0;
	    	maxVowels = 0 ;
	    	vovelsCount = 0;
	    	index = 0 ;
	    	validWords= true ;
	    	wordsCount = 0 ;
	    	words="";
	    	maxConsonant=0;
	    	
	    	System.out.println("Please enter the sentence.");
	    	sentence= EasyIn.getString(); 	//sentence = "This i$ an aardvaAr yeEeeAs onDO qwerty XYZ9";
	    	    	
	      	space= sentence.indexOf(" ");
		  	sentence= sentence.trim()+" ";
		  	
			while (space !=-1)
			  	{
			  		//slice the sentence to words
				  	index++;
				  	words= sentence.substring(0,space);
				  	sentence= sentence.substring(space+1);
				  	index =0;
				  	validWords=CheckValidWord(words); // sending to word cheking method to check is the word is valid
				  	
			    	if (validWords == true)
				    	{			    	   	
				    	  	wordsCount++;					// counting good words
				    	  	goodWords=goodWords+" " +words; // sore good words with space between them
				    	   	vovelsCount =vowelsMethod(words); 	// sending to vowels method to check how many vowels 
				    	  	consonansCount=words.length()-vovelsCount;	// finding consonants 		    	     	
				    	// updates cuccent vowels  word if founds words with more vowels 
				    	if (maxVowels<vovelsCount)  
						    {
						    	maxVowels = vovelsCount;
						    	largetsVowelsWord= words;
						    }
						  // updates cuccent consonants word if founds words with more consonants  				    
					 	if (maxConsonant <consonansCount)
						    {
						    	 maxConsonant = consonansCount;
						    	largestConsonantWord= words;
						    } 
						    // if word have same amount consonants and vowels setting it to shortest word with same amount both letters					    
						    if (vovelsCount==consonansCount)
						    {
							    if (shortestWordVowCon=="" )
								    {
								       shortestWordVowCon=words;
								    }
						    // if will found smaller word with same amount vowels and consonants updating to that word
					    	if (words.length() <=shortestWordVowCon.length())
						    	 {
						    	 	shortestWordVowCon= words;
						    	 }				    
						    }  //if vowels to same amount like consonants				    
					     } // if valid word				
		    		space= sentence.indexOf(" ");
		    	} // while loop
		      // output	
	    	System.out.println ("The number of valid words: "+ wordsCount);
	    	System.out.println ("The valid words are : "+goodWords );
	    	System.out.println ("The word with the largest  number of vowels: "+largetsVowelsWord);
	    	System.out.println("The word with the largest number of consonants: "+largestConsonantWord);
	    	System.out.println("The shortest word with an equal no of vowels and consonants : "+shortestWordVowCon);    	   	
	    }
}

