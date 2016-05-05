class add_name_to_array


 
{
	
		

	static final int MAX = 15;// size of the array 
				
	public static void main(String[] args) 
	 {	 	
	
		String nameArray[] ;
		int namesInArray ;
		int i = 0 ;
		String newName ;
		int step ;
		int place ;
		
        nameArray = new String [MAX ];  // the its should be left extra space in the array if you want to add some data 

		System.out.println("Please enter how many names:");
		namesInArray= EasyIn. getInt();	
		
		for (i=0;i<namesInArray;i++)
			{
				System.out.println("Please enter the name:");
				nameArray[i]= EasyIn.getString();										
			}	
		
		   	for (i=0;i<namesInArray;i++)
			{
				System.out.println("The name are :" +nameArray[i]);
													
			}	
//****************************************************************	
// find a correct place in the array
//****************************************************************	

		System.out.print("Enter a new name "); 
		newName = EasyIn.getString();
		step = 0; 		
		while ((newName.compareTo(nameArray[step]) > 0) && (step < namesInArray))
			{
					step ++;
			}
		place = step ;   // Finds the correct location of place
		
		System.out.println("Place is in position :" + place); // display the place 
//*****************************************************************	
// adding the name 
//************************************************************		
		
		if (namesInArray == 0)
			{
				nameArray[0] = newName;
				namesInArray ++;	   // no of elements used up in array
			}
		else
			{
				for (step = namesInArray - 1 ; step >= place; step --)
					{
						nameArray[step + 1] = nameArray[step] ; 
					}
				nameArray[place] = newName;			
				namesInArray ++;
			}
// diplay new array
		for (i=0;i<namesInArray;i++)
			{
				System.out.println("The name are :" +nameArray[i]);
													
			}
	
	 }				
}  