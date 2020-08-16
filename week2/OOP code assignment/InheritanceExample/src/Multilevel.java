import java.util.*;
import java.lang.*;
import java.io.*;
class First{
	public void display_one() {
		System.out.print("Testing ");
	}
}
class Second extends First{
	public void display_two() {
		System.out.print("multilevel ");
	}
}
class Third extends Second{
	public void display_three() {
		System.out.print("inheritance. ");
	}
	
}
public class Multilevel {
	public static void main(String args[]) {
		Third three=new Third();
		
		three.display_one();
	    three.display_two();
		three.display_three();
	}

}