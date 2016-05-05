
class MySkeleton

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
    
    	System.out.println("Vaidas Siupienius ") ;  
		name = EasyIn.getString() ;
    	System.out.println("Hello " + name) ;
    	System.out.println("Have a nice day !") ;
    }
}

