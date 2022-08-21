package hw9Abstraction.copy;

/*Create also one default and one static method dorm and studyRoom inside interface "College" */
public interface College { // Interface College Created
	public void commonRoom(); // method declare below

	public void laboratory();

	public void languageClub();

	public default void dorm() {// Default method created
		System.out.println("This is Default method from Hospital interface");
	}

	public static void studyRoom() {
		System.out.println("This is Static method from Hospital interface ");
	}
}
