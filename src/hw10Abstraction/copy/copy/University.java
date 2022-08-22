package hw10Abstraction.copy.copy;

import java.net.InterfaceAddress;
import java.security.PublicKey;

/**/

public interface University extends College, Hospital {

	// public University() { } //In interface Constructor Create is not possible

	public void classSize(); // Method declare below

	public void playGround();

	public abstract void teacher();

	public default void gymnasium() { // Default method created
		System.out.println("This is Default method from University interface ");
	}

	public static void library() {
		System.out.println("This is Static method from University interface ");
	}
	/*
	 * i) how many keywords are used for the inheritance in Interface, answer by
	 * Java comments? Can an interface inherit other Interfaces, or a regular class
	 * or abstract class by extends key word? How many inheritance is possible? Use
	 * the Interface -- "University" to answer my questions (University extends
	 * College, Hospital) (by multiple line comments).
	 */

// Ans:  1 keyword used for extends 
	// Interface can inherit more then one interface by Extends keywords
	// Interface can't inherit regular class or abstract class by Extends keywords
	// -------------------------------------------
	/*
	 * i) Total how many keywords are used for the inheritance in Interface,answer
	 * by Java comments? Ans:-Only One extends keywords use in Interface for
	 * inherit.
	 * 
	 * Can an interface inherit other Interfaces, or a regular class or abstract
	 * class by extends or implements keyword? Ans:-Interface can inherit more then
	 * one interface by extends key words. Ans:-Interface can't inherit a regular
	 * class or abstract class by extends. Ans:-Interface can't inherit a regular
	 * class or abstract class by implements keyword.
	 * 
	 * How many inheritance is possible? Use the Interface -- "University" to answer
	 * my questions (University extends College, Hospital) (by multiple line
	 * comments). Ans:-Here University inherit two interface that is College and
	 * Hospital.
	 */

}
