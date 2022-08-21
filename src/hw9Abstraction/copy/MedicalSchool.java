package hw9Abstraction.copy;
/* Create an Abstract Class MedicalSchool, 
 * create 2 methods inside the Abstract Class 
 * - one is abstract and another one is non abstract name -- anatomyLab and biochemistryLab. 
 * Print something inside the non abstract or implemented method. 
 * 
 * Create another Abstract Class EngineeringSchool,
 * create 2 methods inside the Abstract Class 
 * - one is abstract and another one is non abstract name -- mechanicalLab and computerLab. 
 * Print something inside the non abstract or implemented method . 
 * 
 * Create another Abstract Class NursingSchool, 
 * create 2 methods inside the Abstract Class - one is abstract and another one is the non-abstract name 
 * -- hygiene and caring. 
 * Print something inside the non-abstract or implemented method.
 *  
 * Can you create a Constructor inside MedicalSchool Abstract Class? 
 * If yes, create default Constructor on one of the Abstract Class. If no, comment out the created constructor and answer why not?*/

public abstract class MedicalSchool extends NursingSchool {     //abstract class created
	public abstract void anatomyLab();   // abstract method declared

	public void biochemistryLab() {  //non abstract or implemented method 
		System.out.println(" This is biochemistryLab non abstrct void tipe method implemented ");

	}
	public MedicalSchool() {    // Default Constructor inside abstract class declare
		
	}
	/*ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and NursingSchool. 
	 * how many keywords are used for the inheritance in Java for Abstract Class?  
	 * Can an Abstract Class inherit other Abstract Class or a regular class or interface by extends keyword? How many inheritances is possible by an Abstract Class? (use java comments for the above question) Use one of above Abstract Class (MedicalSchool extends NursingSchool)  and use the keywords to answer my questions.*/

	// Ans:  1 keyword used for extends 
		// abstract class can inherit only one abstract or regular class by Extends keywords
		// an abstract class can't inherit Interface by used Extends keywords
}
