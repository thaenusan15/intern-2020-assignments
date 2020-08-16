package compileTimePoly;



class Overload{
	void demo(int num) {
		System.out.println("Integer:"+num);
	}
	void demo(int num1,int num2) {
		int add=num1+num2;
		System.out.println("Addition:"+add);
	}
	double demo(double num) {
		return num;
	}
}

public class MethodOverloading {
	public static void main (String args[]){
		Overload obj=new Overload();
		double number;
		obj.demo(10);
		obj.demo(10,20);
		number=obj.demo(5.5);
		System.out.print("Double"+number);
		
	}
	}
