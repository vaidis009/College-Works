package lab5;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] subjects = new String[6];
		
		subjects[0]= "Programing";
		subjects[1]= "Maths";
		subjects[2]= "Project";
		subjects[3]= "Web";
		subjects[4]= "Architecture";
		subjects[5]= "Accounting";
		
		Course courseObject= new Course("Software Engineering", subjects, 5);
		
		Student studentObject = new Student("Vaidas", "Siupienius");
		Student studentObject2 = new Student("Vaidas", "Siupienius", "Software Engineering", 5);
		Student studentObject3 = new Student("Vaidas", "Siupienius", courseObject);
		
		System.out.println(studentObject.toString());
		System.out.println(studentObject2.toString());
		System.out.println(studentObject3.toString());
		
	}

}
