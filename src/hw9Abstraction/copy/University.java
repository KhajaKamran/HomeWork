package hw9Abstraction.copy;

import java.net.InterfaceAddress;
import java.security.PublicKey;

/*Copy your previous package "hw8Abstraction" , paste and rename it to "hw9Abstraction" 
 * inside your HW project and execute the below in hw9Abstraction package. 
 * Read the question very carefully. 
 * 
 * Create one default and one static method gymnasium and library inside interface "University". 
 * 
 * Create one default and one static method morgue and pharmacy inside interface "Hospital". 
 * 
 * Create also one default and one static method dorm and studyRoom inside interface "College".*/

public interface University extends College,Hospital {

	// public University() { } //In interface Constructor Create is not possible

	public void classSize(); // Method declare below

	public void playGround();

	public abstract void teacher();
	
	public default void gymnasium() {  // Default method created
		System.out.println("This is Default method from University interface ");
		}
	public static void library() {
		System.out.println("This is Static method from University interface ");
	}
	/*i) how many keywords are used for the inheritance in Interface, answer by Java comments?  
	 * Can an interface inherit other Interfaces, or a regular class or abstract class by extends key word? 
	 * How many inheritance is possible? Use the Interface -- "University" to answer my questions 
	 * (University extends College, Hospital) (by multiple line comments).*/

// Ans:  1 keyword used for extends 
	// Interface  can inherit more then one interface by Extends keywords
	// Interface can't inherit regular class or abstract class by Extends keywords
}
