package hw10Abstraction.copy.copy;

/*  */
public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool{
	//public abstract void chemistry();   //in regular class abstract method is not possible to declare
	public void biology() {  // non abstract or implemented method
		System.out.println("This is biology non abstract voidtipe method implemented");
		
	}
	public ColumbiaUniversity() {  // Constructor created and declared 
	}
	/*iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity, RockefellerUniversity.	
	 * how many keywords are used for the inheritance in Java for a regular Class? 
	 *  Can a regular Class inherit other Abstract Class or a regular class or interface by extends key word? 
	 *  How many inheritances is possible by a regular Class? 
	 *  (use java comments for the above question). 
	 *  Use one of above regular Classes (ColumbiaUniversity extends MedicalSchool ) and 
	 *  use the keywords to answer my questions. 
	 *  You don't need to execute anything as the main method is absent. 
	 *  github link is necessary to paste.*/
	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void lawInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void vocationalInfo() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}

	// Ans:  1 keyword used for extends 
	// Regular class can inherit only one abstract or regular class by Extends keywords
			// Regular class can't inherit Interface by used Extends keywords
	
	//------------------------------------//
	/*iii) You have 3 regular class names -- ColumbiaUniversity, NYUniversity, RockefellerUniversity. how many keywords are used for the inheritance in Java for a regular Class? 
	 * Ans:-two keywords. 1. Extends 2.implements
	 *  
	 * Can a regular Class inherit other Abstract Class or a regular class or interface by extends or implements keyword?
	 * Ans:- Regular Class inherit Only one regular class or only one abstract class by extends keywords.
	 * 
	 * Ans:- Regular can't inherit interface by extends keywords.regular class can inherit more then one interface by implements keywords. 
	 * 
	 * How many inheritances is possible by a regular Class? Use one of above regular Classes  (ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool) and use the keywords to answer my questions. You don't need to execute anything as the main method is absent.
	 * Ans:-3 inharitance.Here regular class ColumbiaUniversity extends abstract class MedicalSchool implements interface University, VocationalSchool 
	 * */
	
	
	
	
	
	
	
}     // 
