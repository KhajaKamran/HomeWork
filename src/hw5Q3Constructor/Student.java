package hw5Q3Constructor;

/*Create a package name "hw5Q3Constructor" in your Home Work project. 
Inside the package, a) Create a class "Student".
Declare some variable -- stName, stID, sex, isProgrammer(as boolean), grade (as float).
Declare default constructor and
only one parameterized constructor (use select variables--right click--source to create it). 
Use only one System.out.println() in parameterized constructor to declare the above variables. 
--------------------------------
 * */
public class Student {
	public String stName; // Variable Declare
	public int stID; // Variable Declare
	public char sex; // Variable Declare
	public boolean isProgrammer;
	public float grade;

	public Student() {  // Default Constructor Declare
		System.out.println("\nThis is from default Constructor of Student class");

	}

	public Student(String stName, int stID, char sex,float grade, boolean isProgrammer) {//parameterized constructor
		
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.grade = grade; 
		this.isProgrammer = isProgrammer;
	 
		System.out.println("\nStudent Name: "+stName+"Student ID: "+stID+", Student Sex: "+sex+", Grade: "+grade+", Is Programmer: "+isProgrammer);
	}


}
