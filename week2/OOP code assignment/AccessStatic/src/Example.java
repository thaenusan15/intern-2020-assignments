
public class Example {
	public static void main(String args[]) {
		Calculate cal=new Calculate();
		System.out.println(cal.square(10));
	}
	
}
class Calculate{
	private int square(int num) {
		return num*num;
	}
}