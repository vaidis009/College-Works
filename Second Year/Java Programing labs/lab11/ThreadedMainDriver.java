
//Vaidas siupienius c00197220


/*4. Using the same class as a Thread
Rename and save ThreadMaker as ThreadedMain.
Have ThreadedMain extend class Thread.
Create a default constructor in ThreadedMain, which acquires and prints out the name of the Thread and append " is alive!" to the output.
In ThreadedMain's main method put the following code (obviously do not include the numbering):
1. System.out.println("Hello World!");
2. Thread t = new ThreadedMain();
3. t.start();
4. System.out.println("Goodbye from main");

Compile and run ThreadedMain and observe and note the output.  Insert a yield() statement between statements 3 and 4.  Compile and run ThreadedMain and observe the difference in the output.

*/
package lab11;
class ThreadedMainDriver
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        Thread t = new ThreadedMain();
        t.start();
        t.yield();
        System.out.println("Goodbye from main");
       

    }
}