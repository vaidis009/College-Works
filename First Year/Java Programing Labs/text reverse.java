class text reverse

// reversing text 
{	

	public static void main(String[] args) 
	 {	 	
	 
	 String text = " ";
	 String reverseText = "";
	 int index= 0 ;
	 
	 
	 System.out.println("Please enter text");
	 text= EasyIn.getString() ;
	 
	 for(index=text.length()-1;index>= 0 ;index--)
	 {
	 
	 reverseText= reverseText +text.charAt(index);
	 }
	 
	 
	 System.out.println (reverseText);
	   
	 }   
}  