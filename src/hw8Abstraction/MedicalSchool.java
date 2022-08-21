package hw8Abstraction;
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

public abstract class MedicalSchool {     //abstract class created
	public abstract void anatomyLab();   // abstract method declared

	public void biochemistryLab() {  //non abstract or implemented method 
		System.out.println(" This is biochemistryLab non abstrct void tipe method implemented ");

	}
	public MedicalSchool() {    // Default Constructor inside abstract class declare
		
	}

}
