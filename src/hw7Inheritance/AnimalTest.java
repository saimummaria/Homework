package hw7Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();
		// Animal is a hierarchical inheritance because more then one derived class created from this class.
		// Example:Mammal extends animal,Reptile extends animal,Birds extends animal.

		System.out.println("\n...................................***................................\n");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();

		System.out.println("\n...................................***................................\n");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();

		System.out.println("\n...................................***................................\n");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		// Birds extends Animal .This is a single inheritance.

		System.out.println("\n...................................***................................\n");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();

		System.out.println("\n...................................***................................\n");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();

		System.out.println("\n...................................***................................\n");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();

		System.out.println("\n...................................***................................\n");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		// Bulldog extends dog.Dog extends mammal.Mammal extends animal.
		// This is an example of multilevel inheritance because one derived class created from another derived class.

		System.out.println("\n...................................***................................\n");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();

	}

}
