package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe aboutMe=new AboutMe();
		aboutMe.nickName="kamran"; // String  Initialize
		aboutMe.age=19;   // Byte Initialize
		aboutMe.myApartmentRent=4500;  //Short Initialize
		aboutMe.myYearlySalary=4080;     //  int Initialize
		aboutMe.myBankBalance=12345678901l;  //Long Initialize
		aboutMe.myHeight=5.677f;  // float Initialize
		aboutMe.myGrade=3.12345678901234; // Double  Initialize
		aboutMe.gender='M'; // Char  Initialize
		aboutMe.marride=true;//Boolean Initialize
			
		aboutMe.aboutMe();
		
		System.out.println("\n**************************\n");
		
		AboutMe aboutAlex=new AboutMe();
		aboutAlex.nickName="Alex"; // String  Initialize
		aboutAlex.age=39;   // Byte Initialize
		aboutAlex.myApartmentRent=5500;  //Short Initialize
		aboutAlex.myYearlySalary=5080;     //  int Initialize
		aboutAlex.myBankBalance=123456789012l;  //Long Initialize
		aboutAlex.myHeight=5.777f;  // float Initialize
		aboutAlex.myGrade=1.12345678901234; // Double  Initialize
		aboutAlex.gender='M'; // Char  Initialize
		aboutAlex.marride=false;//Boolean Initialize
		
		aboutAlex.aboutMe();  // method  call

	}

}
