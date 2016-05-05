class Jlab82

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				04/03/15
/*Purpose :3)	Write a program using methods as described in your notes that maintains an array 
 *of strings in alphabetical order. 
 *The program should present the user with a menu option as follows: 
1.	Add Name
2.	Delete Name
3.	Search for a Name
4.	List All Names
5.	Exit

 */
 
 
 /*	if (namesInArray==0 )
			{
				nameArray[0]= newName ;
				namesInArray++;
			}
			else 
			{
				i=0;
				for(i=namesInArray -1; i>=place; i++)
					{
						nameArray[i+1]=nameArray[i];	
					} 
				nameArray[i]= newName;
				namesInArray++;
			}
				*/
 
 
{
	static final int MAXNUMS = 50;
	public static void searchNameInArray(String AnameArray[],String AsearchName, int AnamesInArray)
	{
		int step = 0 ;
	
	
		while (AsearchName.compareTo(AnameArray[step])>0  &&  step <AnamesInArray)
			{
				step++;
			}
			if (AsearchName==AnameArray[step])
			{
				System.out.println("name is in possition: "+ AnameArray[step] );	
			}
			else 
			{
					System.out.println("There is no name like:"+ AsearchName );
			}		
	}
	
	

	public static int addName(String AnameArray[],String AnewName, int AnamesInArray)
	{
		int index=0;
		int place  ;
		
		place= findPlace(AnameArray,AnewName,AnamesInArray);
	
		
		for (index=AnamesInArray-1; index>=place;index--)
		{
			AnameArray[index+1]=AnameArray[index];
			
		}
		AnameArray[place]=AnewName; 
		AnamesInArray++;
		
	
		return AnamesInArray +1;
	}
	/*
	public static int deleteName(String AnameArray[],String AnewName, int AnamesInArray)
	{
		int index=0;
		int place = 0 ;	
		place= findPlace(AnameArray,AnewName,AnamesInArray);
		
		for (index=place; index>AnamesInArray ;index++)
			{
				AnameArray[index]=AnameArray[index+1];
				
			}	
		
		return AnamesInArray ;
	}

	*/	
	
		
	public static int findPlace(String AAnameArray[],String AAnewName, int AAnamesInArray)
	{
		int step = 0 ;
		int Aplace  ;
		step = 0 ;
		while ((AAnewName.compareTo(AAnameArray[step])>0)  &&  (step <AAnamesInArray))
			{
				step++;
			}		
		Aplace= step; // find correct location for space
		return Aplace;
	}
	
	public static void displayAllNames(String AAAnameArray[],int AAAnamesInArray)
		{
			int index= 0 ;		
						
			for (index=0;index<AAAnamesInArray;index++)
				{
				
				System.out.println("Names are: "+ index+"  " + AAAnameArray[index] );// displaying the names
				}			
		}
		
			
	public static void main(String[] args) 
	 {	 	
	
		String nameArray[] ;
		int namesInArray ;
		int i = 0 ;
		String newName = " ";
		int place= 0 ;	
		int select = 0  ;
		String deleteName ;
		String searchName ; 

		 	nameArray = new String [MAXNUMS];
		System.out.println("Please enter how many names:");
		namesInArray= EasyIn. getInt();
		 
	
		
		for (i=0;i<namesInArray;i++)
			{
				System.out.println("Please enter the name:");
				nameArray[i]= EasyIn.getString();										
			}	
	
		while (select!=5)
		{
			System.out.println("Please select what would you like to do next:");
			System.out.println("Press 1 for add new name");
			System.out.println("Press 2 for delete name");
			System.out.println("Press 3 for search for a name");
			System.out.println("Press 4 for list all names");
			System.out.println("Press 5 for exit");
			select= EasyIn. getInt();		
		
			switch (select)
			{
			
				case 1: 
					System.out.println("Please enter the new name:");
					newName= EasyIn.getString();					
				namesInArray= addName(nameArray, newName, namesInArray);
		          break;
				case 2:
					System.out.println("Please enter the name which would like you delete:");
					deleteName= EasyIn.getString();
				//	namesInArray= deleteName(nameArray, newName, namesInArray);
		          break;
		        case 3:
		        	System.out.println("Please enter the name which you looking for :");
					searchName= EasyIn.getString();
					searchNameInArray(nameArray,searchName, namesInArray);
		          break;
		        case 4:
		       		displayAllNames(nameArray, namesInArray);
		          break;
		       
		     }
		
		}
		
		place= findPlace(nameArray,newName,namesInArray);
			
			
		
	
	
	 }				
}  