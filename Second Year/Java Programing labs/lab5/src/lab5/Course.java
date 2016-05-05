package lab5;

import java.util.Arrays;

/*
Q4. Complete all of the exercise in question 2 for a class Course that you will now create 
(attributes would include an array for the course subjects, course duration etc.).

Q2
Provide getter and setter methods as appropriate for the attributes of the Car class. 
 Provide a print method for the Car class so that object details can be printed. 
  Create a class that uses the Car class by creating an array of ten objects. 
   In your driver, access the attributes of the objects via the getter and setter methods. 
    Demonstrate that all methods of the Car class work as expected.  Demonstrate the use of the this pointer in the Car class. 
    
     Modify the Employee class created for question 1 by removing the Company Car Registration Number
      property and replacing it with a Company Car property that is of the class Car as just created. 
       An Employee may at most have two company cars,
 handle this situation using static variables or functions as necessary and prove that it works by 
*/

public class Course {
	private String[] courseSubjects ;
	private int courseDuration; 
	private int courseFees;
	private String courseName;
	
	
	public Course(String courseName, String[] courseSubjects, int courseDuration, int courseFees) {
		super();
		this.courseSubjects = courseSubjects;
		this.courseDuration = courseDuration;
		this.courseFees = courseFees;
		this.courseName = courseName;
		
	}
	public Course(String courseName, String[] courseSubjects, int courseDuration) {
		super();
		this.courseSubjects = courseSubjects;
		this.courseDuration = courseDuration;
		this.courseName = courseName;
		this.courseFees = 0;
	}


	public String[] getCourseSubjects() {
		return courseSubjects;
	}


	public void setCourseSubjects(String[] courseSubjects) {
		this.courseSubjects = courseSubjects;
	}


	public int getCourseDuration() {
		return courseDuration;
	}


	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}


	public int getCourseFees() {
		return courseFees;
	}


	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	@Override
	public String toString() {
		if (courseFees==0){		
		return "  Course  courseName=" + courseName + " \n[courseSubjects=" + Arrays.toString(courseSubjects)
				+ "\n courseDuration=" + courseDuration ;
		}
		else{
			return "  Course  courseName=" + courseName + " \n[courseSubjects=" + Arrays.toString(courseSubjects)
					+ "\n courseDuration=" + courseDuration + "\n courseFees="
							+ courseFees +  "]";	
		}
		}
	}
	


