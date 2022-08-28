package hw11Abstraction.copy.copy.copy;

public interface College { // Interface College Created
	public void commonRoom(); // method declare below

	public void laboratory();

	public void languageClub();

	public default void dorm() {// Default method created
		System.out.println("This is Default method dorm from College interface");
	}

	public static void studyRoom() {
		System.out.println("This is Static method studyRoom from college interface ");
	}
}
