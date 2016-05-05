package lab5;

public class CourseTest {

	public static void main(String[] args) {

		String[] subjects = new String[6];
		
		subjects[0]= "Programing";
		subjects[1]= "Maths";
		subjects[2]= "Project";
		subjects[3]= "Web";
		subjects[4]= "Architecture";
		subjects[5]= "Accounting";
		
		
		
		
		Course courseObject = new Course("Software Development", subjects, 4, 500);
		
		
		System.out.println(courseObject);
		
		
		
		
		
		
		
		
		

	}

}
