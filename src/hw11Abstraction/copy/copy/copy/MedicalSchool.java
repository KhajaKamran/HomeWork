package hw11Abstraction.copy.copy.copy;

public abstract class MedicalSchool extends NursingSchool implements LawSchool { // abstract class created
	public abstract void anatomyLab(); // abstract method declared

	public void biochemistryLab() { // non abstract or implemented method
		System.out.println("This is biochemistryLab non abstrct void tipe method implemented ");
	}

	public MedicalSchool() { // Default Constructor inside abstract class declare
	}

	public static void medicalSchool() {
		System.out.println("This is static method come from MedicalSchool");
	}
	// public default void CedicalSchool() { we can't create default method in
	// abstract class or regular class
	// }

	/*
	 * ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and
	 * NursingSchool. how many keywords are used for the inheritance in Java for
	 * Abstract Class? Can an Abstract Class inherit other Abstract Class or a
	 * regular class or interface by extends keyword? How many inheritances is
	 * possible by an Abstract Class? (use java comments for the above question) Use
	 * one of above Abstract Class (MedicalSchool extends NursingSchool) and use the
	 * keywords to answer my questions.
	 */

	// Ans: 1 keyword used for extends
	// abstract class can inherit only one abstract or regular class by Extends
	// keywords
	// an abstract class can't inherit Interface by used Extends keywords
	/// ----------------------------------------------//

	/*
	 * ii) You have 3 abstract class names --MedicalSchool, EngineeringSchool, and
	 * NursingSchool. how many keywords are used for the inheritance in Java for
	 * Abstract Class? Ans:- 2 key words .1. Extends 2. Implements
	 * 
	 * Can an Abstract Class inherit other Abstract Class or a regular class or
	 * interface by extends or implements keyword? Ans:-Abstract Class can inherit
	 * only one Abstract Class or only one regular class by extends keywords.
	 * Ans:-Abstract Class can't inherit Interface by extends keywords. Ans:Abstract
	 * Class can inherit interface more then one interface by implements keywords.
	 * 
	 * How many inheritances is possible by an Abstract Class? Use one of above
	 * Abstract Class (MedicalSchool extends NursingSchool implements LawSchool) and
	 * use the keywords to answer my questions Ans:-two inheritance .Here abstract
	 * class MedicalSchool inherit abstract class NursingSchool by extends keywords
	 * and inherit interface LawSchool by implements keywords.
	 */

}
