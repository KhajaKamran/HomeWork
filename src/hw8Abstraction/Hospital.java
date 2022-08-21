package hw8Abstraction;

/*b) Create another interface "Hospital". Declare some methods inside the interface
 *  - emergencyRoom, surgeryRoom, cafeteria.
 */
public interface Hospital {    // interface created
	public void emergencyRoom();    // method declare below

	public void surgeryRoom();

	public abstract void cafeteria();   

}
