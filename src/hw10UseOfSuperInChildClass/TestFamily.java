package hw10UseOfSuperInChildClass;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\nDefault Constructo initilize from Daughter class");
		Daughter daughter=new Daughter();
		
		System.out.println("\nPeremetrize Constructo initilize from Daughter class");
		
		Daughter daughter1=new Daughter("March",30);
		
		System.out.println("Void type method initilize from Daughter class");
		
		daughter.daughter();
		
		System.out.println("Peremetrize method initilize from Daughter class");
		daughter.daughterInfo("April", 28);
		

		
		
	}

}
