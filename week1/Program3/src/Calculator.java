

public class Calculator //create a class
{
	
		public static void main(String[] args) //entry of a program 
		{
		int valueOne = 10;    //define a variable
		int valueTwo = 5;     //define a variable
		Calculator Calculator = new Calculator(); //create object of Calculator class
		int addResult = Calculator.add(valueOne, valueTwo); // Output => 15
		int subValue = Calculator.sub(valueOne, valueTwo); // Output => 5
		int mulValue = Calculator.mul(valueOne, valueTwo); // Output => 50 
		int divValue = Calculator.div(valueOne, valueTwo); // Output => 2
		System.out.println("add : " + addResult); //print adding result
		System.out.println("sub : " + subValue); //print substitution result
		System.out.println("mul : " + mulValue); //print multiplying result
		System.out.println("div : " + divValue); //print dividing result
		}
		public int add(int a,int b)  //create add method
		{
			return a+b; //return adding value to Calculator class
		}
		public int sub(int a,int b)  //create sub method
		{
			return a-b; //return substitution value to Calculator class
		}
		public int mul(int a,int b) //create mul method
		{
			return a*b;  //return multiplying value to Calculator class
		}
		public int div(int a,int b) //create div method
		{
			return a/b;   //return dividing value to Calculator class
		}
}


