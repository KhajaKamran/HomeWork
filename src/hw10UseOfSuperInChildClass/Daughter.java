package hw10UseOfSuperInChildClass;

/*b) Create a class name 'Daughter', 
 *declare variable birthMonth, age. Declare default (declare a sysout inside it) and 
 *parameterized constructor (declare a sysout inside it), and 
 *implement a regular method daughter() and declare a sysout. 
 *Create a parameterized method daughterInfo() which contains 2 of its variables as  local variable. declare a sysout (you can copy from parameterized constructor) . 
 *
 *Now, Daughter extends Father (super class). 
 *Use super method, super keyword and show all of their use in child class. 
 *Use 'FamilyName' variable (from parent class) to initialize by super keyword in child class (Use one constructor and one method to implement them). and 
 *
 *initialize in a TestFamily Class.
 * Paste GitHub link below.*/
public class Daughter extends Father {
	String birthMonth;
	int age;

	public Daughter() { // Default Constructor declare
		super();
		super.father();//initialize parent class void type method father in child class
		super.fatherInfo("Clinton", 55, 'M', false); // initialize peremetrize parent class(Father class) method father info in  child class
		
		super.familyName="Bush";
		System.out.println("Family Name: "+familyName);
		System.out.println("This is default Constractor from Daughter class");
	}

	public Daughter(String birthMonth, int age) { // parameterize Constructor implemented
		super("Obama",45,'M',true);
		super.father();
		super.fatherInfo("Trum", 60, 'M', true);
		
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month: "+birthMonth+"Age: "+age);  // *****
	}

	public void daughter() { // implemented regular method daughter
		super.father();
		super.fatherInfo("Biden", 25, 'M', true);
		
		super.familyName="Haris";
		System.out.println("Family Name: "+familyName);
		System.out.println("This is regular void type method from Daughter class");
	}

	public void daughterInfo(String birthMonth, int age) { // parameterize Method implemented
		super.father();
		super.fatherInfo("Devid", 44, 'M', false);

		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("Birth Month: " + birthMonth + "Age :" + age);
	}
	

}
