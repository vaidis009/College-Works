package lab5;
/*
Q3. Complete all of the exercises in question 1 for a class Student that you will now create with six attributes 
(attributes such as name address, course etc.).  For the final part, create a calculate registration fee method instead of the taxPayable()
 method where a student pays a flat registration fee of €500 with a levy of €100 for each year of the course that they have completed, i.e. 
 first years pay €500, second years pay €600 etc.
*/
public class Student {
	private final int levy=100;
	private final int regFeeStart = 500;
	
	private String name;
	private String surname;
	private String course; 
	private int currentYear=1;
	private int fees;	
	private Course courseObject;
	
	public Student(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
		this.course= null;
		this.currentYear=1;
		this.fees= 0;
		this.courseObject=null;
	}
	public Student(String name, String surname, String course, int currentYear) {
		super();
		this.name = name;
		this.surname = surname;
		this.course = course;
		this.currentYear = currentYear;
	
	}
	
	public Student(String name, String surname, Course courseObject) {
		super();
		this.name = name;
		this.surname = surname;
		this.courseObject = courseObject;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getCurrentYear() {
		return currentYear;
	}
	public void setCurrentYear(int currentYear) {
		this.currentYear = currentYear;
	}
	public int calRegFee(){
		int i=0;
		if (currentYear==1){
			fees=500;
		}
		else{
			for (i=1;i<currentYear;i++)
		fees=fees+ levy;
			fees=fees+regFeeStart;
	
		}
		return fees;
	}     //create kad atoprintintu is course clases visus atributes nedabaigta dar
	@Override
	public String toString() {
		if (course==null){
		return "Student name=" + name + ", surname=" + surname ;
		}
		else if (courseObject!=null){
			return "Student [name=" + name + ", surname=" + surname + courseObject+ " fees=" + calRegFee()
					+ "]";
		}
		else{
			return "Student [name=" + name + ", surname=" + surname + ", course="
					+ course + ", currentYear=" + currentYear + ", fees=" + calRegFee()
					+ "]";
		}
	}
	
	

}
