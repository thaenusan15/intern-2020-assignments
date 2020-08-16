import java.util.*;
import java.lang.*;
import java.io.*;
class Animal{
	public void print_animal() {
		System.out.println("Dogs are animals. ");
	}
}
class Cat extends Animal{
	public void print_cat() {
		System.out.println("Cats are animals. ");
	}
}
class Dog extends Animal{
	
}
public class Hierarchical {
	public static void main(String args[]) {
		Animal animal=new Animal();
	    Cat cat=new Cat();
	    Dog dog=new Dog();
	    animal.print_animal();
	    cat.print_cat();
	    dog.print_animal();
		
	}

}
