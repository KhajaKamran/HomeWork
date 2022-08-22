package hw8Inheritance;

/*Now create a class "AnimalTest".
Under the main method create an object from each class and call their own method by their own object first. 
Now extends BullDog, Cobra, and Robin class to their parents class and shows their hierarchy till Animal Class, or example: bulldog -- dog -- mammal --Animal, Cobra -- snake--reptile--Animal, Robin -- Bird -- Animal etc. 
We know, An object Can call other methods if the class is extended, if yes, show all the possible calls. 
Use Java comments to show single inheritance, multilevel inheritance,Hierarchical inheritance by example form the above. 
Also, show by java comments who is Parent class and who is child class for at least one class. 
Organize the code.Push the code in Github. 
Paste your github link below. 
 */
public class AnimalTest {
	public static void main(String[] args) { // Main method
		Animal animal = new Animal();   // Class instantiate / object created / Constructor  initialized 
		animal.animalInfo(); // animal object is calling animalInfo method from Animal class
		System.out.println("\n---------------------------\n");

		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo(); // Single Inheritance.Animal parent & Mammal child class
		//Also Hierarchical inheritance Animal parents & Mammal child
		System.out.println("\n---------------------------\n");

		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();  // Single Inheritance / Here Animal is parent class and Reptile is child class
		//Also Hierarchical inheritance Animal parents & reptile child
		System.out.println("\n---------------------------\n");

		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();   //Single Inheritance /
		System.out.println("\n---------------------------\n");

		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();    //
		dog.animalInfo();     //Hierarchical Inheritance ****
		System.out.println("\n---------------------------\n");

		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();        // Hierarchical Inheritance ****
		System.out.println("\n---------------------------\n");

		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();          //Hierarchical Inheritance ****
		System.out.println("\n---------------------------\n");

		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();     //Multilevel inheritance 
		System.out.println("\n---------------------------\n");

		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();    //Multilevel inheritance 
		System.out.println("\n---------------------------\n");

	}
}
