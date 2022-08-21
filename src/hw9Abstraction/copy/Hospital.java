package hw9Abstraction.copy;

/*Create one default and one static method morgue and pharmacy inside interface "Hospital"
 */
public interface Hospital {    // interface created
	public void emergencyRoom();    // method declare below

	public void surgeryRoom();

	public abstract void cafeteria();   
	
	public default void morgue() {// Default method created
		System.out.println("This is Default method from Hospital interface");
	}
	public static void pharmacy() {
		System.out.println("This is Static method from Hospital interface ");
	}

}
