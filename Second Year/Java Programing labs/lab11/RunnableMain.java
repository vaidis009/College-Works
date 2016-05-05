// vaidas siupienius
/*5. Creating a Thread using the Runnable Interface
Rename your ThreadedMain class and save it as RunnableMain (don't forget to rename your constructors).

Alter statement 3 (from Task 4 above) to the following:
Thread t = new Thread(new RunnableMain);

(if it were not called from a static method the argument to new Thread could be this instead of creating a new class).

Compile RunnableMain.
Why will it not compile? Refer to the API documentation for Runnable.
Remove the offending method calls and compile and run RunnableMain.   Observe and note the output.

Add the statement t.yield() after the t.start() after the t.start() statement and note the difference in output.
*/
package lab11;

class RunnableMain extends Thread
{
    static int num;
    public RunnableMain (String name)
    {
        super (name);
        System.out.println(getName() + " is alive ");
    }
    public RunnableMain( ) {
        this("Default "+ ++num);
    }
    public void run ()
    {

    }
}