package hw4JavaVariables;

public class AboutMe {

	public String nickName;// Variable Declare
	public byte age;
	public short myApartmentRent;
	public int myYearlySalary;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char gender;
	public boolean marride;

	public AboutMe() { // constructor Declare
		System.out.println("This is all about us:\n"); // constructor Initialize
		System.out.println("\n**************************\n");
	}

	public void aboutMe() { //   Method Implement
		System.out.println("My Nick Name is:" + nickName + "\t\tMy Age:" + age + "\tMy Apartment Rent: "
				+ myApartmentRent + "\n\nMy Yearly Salayr  :" + myYearlySalary + "\t\tMy Bank Balance:  "
				+ myBankBalance + "\tMy Height:  " + myHeight + "\nMy Grade:" + myGrade + "\t\tGender:" + myGrade
				+ "\tMy Status:" + marride);

	}

}
