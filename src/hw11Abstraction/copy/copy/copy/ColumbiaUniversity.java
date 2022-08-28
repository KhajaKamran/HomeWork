package hw11Abstraction.copy.copy.copy;

public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	// public abstract void chemistry(); //in regular class abstract method is not
	// possible to declare
	public void biology() { // non abstract or implemented method
		System.out.println("This is biology non abstract voidtipe method implemented from ColumbiaUniversity");

	}

	public ColumbiaUniversity() { // Constructor created and declared
		System.out.println("This is ColumbiaUniversity default constructor ");
	}

	public static void columbiaUniversityt() {
		System.out.println("This static method from ColumbiaUniversity");

	}

	/*
	 * iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity,
	 * RockefellerUniversity. how many keywords are used for the inheritance in Java
	 * for a regular Class? Can a regular Class inherit other Abstract Class or a
	 * regular class or interface by extends key word? How many inheritances is
	 * possible by a regular Class? (use java comments for the above question). Use
	 * one of above regular Classes (ColumbiaUniversity extends MedicalSchool ) and
	 * use the keywords to answer my questions. You don't need to execute anything
	 * as the main method is absent. github link is necessary to paste.
	 */
	@Override
	public void anatomyLab() {
		System.out.println("This is anatomyLab method");

	}

	@Override
	public void hygiene() {
		System.out.println("This is hygiene method");

	}

	@Override
	public void commonRoom() {
		System.out.println("This is commonRoom method");

	}

	@Override
	public void laboratory() {
		System.out.println("This is laboratory method");

	}

	@Override
	public void languageClub() {
		System.out.println("This is languageClub method");

	}

	@Override
	public void emergencyRoom() {
		System.out.println("This is emergencyRoom method");

	}

	@Override
	public void surgeryRoom() {
		System.out.println("This is surgeryRoom method");

	}

	@Override
	public void cafeteria() {
		System.out.println("This is cafeteria method");

	}

	@Override
	public void lawInfo() {
		System.out.println("This is lawInfo method");

	}

	@Override
	public void vocationalInfo() {
		System.out.println("This is vocationalInfo method");

	}

	@Override
	public void classSize() {
		System.out.println("This is classSize method");

	}

	@Override
	public void playGround() {
		System.out.println("This is playGround method");

	}

	@Override
	public void teacher() {
		System.out.println("This is teacher method");

	}

	// Ans: 1 keyword used for extends
	// Regular class can inherit only one abstract or regular class by Extends
	// keywords
	// Regular class can't inherit Interface by used Extends keywords

	// ------------------------------------//
	/*
	 * iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity,
	 * RockefellerUniversity. how many keywords are used for the inheritance in Java
	 * for a regular Class? Ans:-two keywords. 1. Extends 2.implements
	 * 
	 * Can a regular Class inherit other Abstract Class or a regular class or
	 * interface by extends or implements keyword? Ans:- Regular Class inherit Only
	 * one regular class or only one abstract class by extends keywords.
	 * 
	 * Ans:- Regular can't inherit interface by extends keywords.regular class can
	 * inherit more then one interface by implements keywords.
	 * 
	 * How many inheritances is possible by a regular Class? Use one of above
	 * regular Classes (ColumbiaUniversity extends MedicalSchool implements
	 * University, VocationalSchool) and use the keywords to answer my questions.
	 * You don't need to execute anything as the main method is absent. Ans:-3
	 * inharitance.Here regular class ColumbiaUniversity extends abstract class
	 * MedicalSchool implements interface University, VocationalSchool
	 */

} //
