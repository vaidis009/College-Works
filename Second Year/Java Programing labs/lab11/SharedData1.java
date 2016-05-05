// vaidas siupienius c00197220
/*6. Sharing data
Given the SharedData class below, write a program that creates an object(s) of the class SharedData and then shares this data between two or more threads.

//Simple class to act as a shared data structure between Threads	
public class SharedData 
{
	int sharedInt;

	public SharedData(){this(0);}
	public SharedData(int inValue){sharedInt = inValue;}

	public void  setSharedInt(int inInt){sharedInt = inInt;}
	public int getSharedInt(){return sharedInt;}

	public String toString(){return ""+sharedInt;}
}
*/
package lab11;
public class SharedData1 
{
	int sharedInt;

	public SharedData1(){this(0);}
	public SharedData1(int inValue){sharedInt = inValue;}

	public void  setSharedInt(int inInt){sharedInt = inInt;}
	public int getSharedInt(){return sharedInt;}

	public String toString(){return ""+sharedInt;}
}
class SharedDataThread2 extends Thread
{
	static int num;
    public SharedDataThread2 (String name)
    {
        super (name);
    }

    public SharedDataThread2( ) {
        this("Default "+ ++num);
    }
    public void run ()
    {
        System.out.println(getName() + " is alive ");
    }
}
