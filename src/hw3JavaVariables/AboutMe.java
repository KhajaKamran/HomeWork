package hw3JavaVariables;

public class AboutMe {

	public String name; // name variable is declare

	public String nickName = "Khaja Mohammad Kamran";// Variable initialized here

	public byte age = 19;
	public short myApartmentRent = 4500;
	public int myYearlySalary = 12222444;
	public long myBankBalance = 12345678901234l;
	public float myHeight = 2.74564f;
	public double myGrade = 3.12345678;
	public char gender = 'M';
	public boolean marride = true;

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe();
		System.out.println("My Name :" + aboutMe.nickName);
		System.out.println("\n");
		System.out.println(
				"My Nick Name:" + aboutMe.nickName + "\nMy Age:\t" + aboutMe.age + "\nMy Height: " + aboutMe.myHeight);

	}

}
