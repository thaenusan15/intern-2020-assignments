import java.util.*;
import java.lang.*;
import java.io.*;
class One{
	public void display_one() {
		System.out.print("This is ");
	}
}
class Two extends One{
	public void display_two() {
		System.out.print("single inheritance.");
	
}
	}

public  class Single {
  public static void main(String args[]) {
	Two sentance=new Two();
	sentance.display_one();
	sentance.display_two();
}
	
}

