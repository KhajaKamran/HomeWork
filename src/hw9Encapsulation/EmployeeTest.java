package hw9Encapsulation;

/*How can you access those variables by the getter and setter method? In EmployeeTest class, 
 * Please execute those variables by the help of getters and setters method and 
 * print Employee info (Use necessary String to make the outcome meaningful, you can also use \n if you want). 
 * Paste the GitHub link below.*/
public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		// in incapsulation in test class need to create argument / value inside
		// parameterize method
		employee.setEmpName("Kamran");
		employee.setEmpAge(19);
		employee.setEmpSex('M');
		employee.setEmpUsCitizen(false);
		System.out.println("Employee Name: " + employee.getEmpName() + "\nEmployee Age: " + employee.getEmpAge()
				+ "\nEmployee Sex: " + employee.getEmpSex() + "\nEmployee US Citizen: " + employee.isEmpUsCitizen());
//in encapsulation boolean type calling in sysout start with is
	}

}
