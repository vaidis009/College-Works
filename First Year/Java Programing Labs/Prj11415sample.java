
class Prj11415sample

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				18/12/14
// Purpose : 		

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
	  		  	
	  	AwordVowels = AwordVowels.toUpperCase();
	  	for (index=0;index<AwordVowels.length();index++)
		  	{
			  	if(AwordVowels.charAt(index)=='A' || AwordVowels.charAt(index)=='E' ||AwordVowels.charAt(index)== 'I' || AwordVowels.charAt(index)=='O' ||AwordVowels.charAt(index)== 'U' )
			  	{
			  		vowelsCount++;
			  	}		  
		  	}
	  	return vowelsCount;	  	 
	  }	 
	  //counting consonants 
	  public static int consonantsMethod(String Awords )
	  {
	  	int consonantsCount ;
	  	int index ;
	  		  	
	  	consonantsCount= 0;
	   	index= 0 ;
	  	
	  	Awords = Awords.toUpperCase();
	  	for (index=0;index<Awords.length();index++)
	  	{
		  	if(Awords.charAt(index)!='A' && Awords.charAt(index)!='E' &&Awords.charAt(index)!= 'I' && Awords.charAt(index)!='O' && Awords.charAt(index)!= 'U' )
		  	{
		  		consonantsCount++;
		  	}		  
	  	}	  	
	  		return consonantsCount;
	   }
	   // main method
	 public static void main(String[] args)
	    {    	
	    	String sentence ;
	    	String words ;
	       	int vowelWord ;
	    	int consonantWords ;
	    	int wordsCount ;
	    	boolean validWords ;
	    	String goodWords ;
	    	int index ;
	    	int space ;
	    	int currentVowel ;
	    	int currentconsonant;
	    	String largetsVowelsWord;
	    	String largestConsonantWord;
	    	String shortestWordVowCon ;  // shortest word with to same amount vowels and consonants 
	    	String currentShortestWordVowCon ; 
	    
	       	shortestWordVowCon= ""; 
	    	largetsVowelsWord="";
	    	largestConsonantWord="";
	    	currentShortestWordVowCon="";
	       	goodWords="";
	    	consonantWords=0;
	    	currentVowel = 0 ;
	    	vowelWord = 0;
	    	index = 0 ;
	    	validWords= true ;
	    	wordsCount = 0 ;
	    	words="";
	    	currentconsonant=0;
	    	
	    	System.out.println("Please enter the sentence.");
	    	sentence = "This i$ an aardvaAr yeEeeAs onDO qwerty XYZ9";
	    	
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
				    	   	vowelWord =vowelsMethod(words); 	// sending to vowels method to check how many vowels 
				    	  	consonantWords=consonantsMethod(words);	// sending to consonants metohod to check how many consonants		    	     	
				    	// updates cuccent vowels  word if founds words with more vowels 
				    	if (currentVowel<vowelsMethod(words))  
						    {
						    	currentVowel = vowelsMethod(words);
						    	largetsVowelsWord= words;
						    }
						  // updates cuccent consonants word if founds words with more consonants  				    
					 	if (currentconsonant <consonantsMethod(words))
						    {
						    	 currentconsonant = consonantsMethod(words);
						    	largestConsonantWord= words;
						    } 
						    // if word have same amount consonants and vowels setting it to shortest word with same amount both letters					    
						    if (vowelWord==consonantWords)
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
						    } // if too same amount vowels and consonants				    
					     } // if word valid				
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

