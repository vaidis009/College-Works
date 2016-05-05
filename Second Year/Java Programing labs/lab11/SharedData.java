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
class SharedDataDriver
{
    public static void main(String[] args)
    {
        Thread thread1 = new ThreadMaker1();
        thread1.start();
    }
}
