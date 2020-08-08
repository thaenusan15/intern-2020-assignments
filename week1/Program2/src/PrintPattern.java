
public class PrintPattern //create a class
{
	public static void main(String[] args) //entry of a program
	{
		int n=5;   //defining a variable
		for(int i=1;i<=n;i++) //outer loop to print space
		{
			for(int j=1;j<=i;j++)  //inner loop to print *
			{
				System.out.print("*"); //print *
			}
			System.out.println();  // line separator
		}
	}

}
