
abstract class Animal{
	abstract void makeSound();
}
class Dog extends Animal{
	public void makeSound() {
		System.out.println("Dog's sound.");
	}

}
class Cat extends Animal{
	public void makeSound() {
		System.out.println("Cat's sound.");
	}

}
public class Test {
	public static void main(String args[]) {
		Dog dog=new Dog();
		dog.makeSound();
		Cat cat=new Cat();
		cat.makeSound();
	}

}

