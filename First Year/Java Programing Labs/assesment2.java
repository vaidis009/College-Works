
class assesment2

// Student Name : 		Vaidas Siupienius
// Student Id Number : 	C00197220
// Date :				15/09/14
// Purpose : 			A Sample skeleton program


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK

{
    public static void main(String[] args)
    {
    	
    	String name ;
    	String oldestPerson ;
    	int age;
    	int oldestPersonAge;
    	int numPeoples ;
    	int index ;
    	
    	index=0;
    	oldestPerson= "";
    	oldestPersonAge= 0;
    	
    	System.out.println ("Please enter how many peoples.");
    	numPeoples = EasyIn.getInt();
    	
    	
    	
    	while (index != numPeoples)
    	
    	{
    		index++;
    		System.out.println ("Please enter your name ");
    		name= EasyIn.getString ();
    		System.out.println ("Please enter you age");
    		age= EasyIn.getInt();
    		
    		if (index==1)
    		{
	    		oldestPerson= name;
	    		oldestPersonAge=age;	
    		}
    		
    		else if (oldestPersonAge<age)
    		{
    			
    			oldestPerson= name;
	    		oldestPersonAge=age;
    			
    		}
    		
    	
    		
    	 }
    	
    	
    	System.out.println ("The oldest person is "+ oldestPerson + ", he is "+ oldestPersonAge + " years old.");
    		
    	
    
    }
}

