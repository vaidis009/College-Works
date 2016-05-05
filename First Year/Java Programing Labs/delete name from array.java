class delete_name_from_array


 
{
	
		

	static final int MAX = 15;// size of the array 
				
	public static void main(String[] args) 
	 {	 	
	
		String nameArray[] ;
		int namesInArray ;
		int i = 0 ;
		String searchName ;
		int step ;
		int whichOne ;
		
        nameArray = new String [MAX ];  // the its should be left extra space in the array if you want to add some data 

		System.out.println("Please enter how many names:");
		namesInArray= EasyIn. getInt();
		 
			
		for (i=0;i<namesInArray;i++)
			{
				System.out.println("Please enter the name:");
				nameArray[i]= EasyIn.getString();										
			}	
	
	
		// printing array
		   	for (i=0;i<namesInArray;i++)
			{
				System.out.println("The name are :" +nameArray[i]);
													
			}	
//****************************************************************	
// search name in the array
//****************************************************************	

	System.out.println("Enter name to be deleted " ) ;
	searchName = EasyIn.getString();
	step = 0;
	while((step < namesInArray) && (nameArray[step].equals(searchName) == false ))
		{
		  step ++;
		}
	if (step < namesInArray)
		{
		  whichOne = step;
		}
	else
		{
		  whichOne = -1; 
		}

//*****************************************************************	
// deleting the name 
//*****************************************************************		
		
	for (step = whichOne; step < namesInArray - 1; step ++)
	{
		nameArray[step] = nameArray[step + 1];
	}
nameArray[namesInArray - 1] = ""; // make it empty again
namesInArray --;

/*  *******************************************************************************
 *how looks adding name just need littbit changes to do 
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
************************************************************************************
*/


// diplay new array
		for (i=0;i<namesInArray;i++)
			{
				System.out.println("The name are :" +nameArray[i]);
													
			}
	
	 }				
}  