/**
 * Q13. The definition for class Time (as described in this handout) is in Time.java on the common drive.
 *   There is a driver program called TimeTest.java in the same directory. Copy both these files to your account.
 *    Run the driver program. Can you follow what is happening? If not, ask for help.


Provide another driver program Clock.java that will create a Time object - you should pass to the Time 
constructor method the current time in hours and minutes. Next, write a loop that calls method tick() 
every second and then prints the stored time.  The loop (and program) should terminate when the stored 
time advances to the next minute. 
Hint: to find out when a second has passed you will need to use System.currentTimeMillis() which returns
 the number of milliseconds elapsed since January 1, 1970.  There are 1000 milliseconds in 1 second.

 */
package lab3aeclipse;

/**
 * @author c00197220
 *
 */
public class Clock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = (int) (System.currentTimeMillis()/1000%60);
		int m = (int) (System.currentTimeMillis()/1000/60%60);
		int h = (int) (System.currentTimeMillis()/1000/60/60%60%24);
				
		Time timeobject = new Time (h,m,s );
		
		for (;;)
		{
			int currentTime = (int)  (System.currentTimeMillis()/1000%60);
			
			if (timeobject.getSecond()==0)
				break;
			if (timeobject.getSecond()==currentTime)
			{
				timeobject.tick();
				System.out.println(timeobject.toString());	
			}			
		}	
	}
}
