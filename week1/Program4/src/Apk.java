
public class Apk  // create a class
{
	public Apk() //create a constructor
	{
		}
public static void main(String[] args) {
Apk myApk = new Apk(); //create an object
myApk.hyperMethod();   // call hyperMethod
myApk.superMethod();   // call superMethod
myApk.ultraMethod();   // call ultraMethod
}
public void superMethod()  //create superMethod
{
System.out.println("This is super Methods.......");
}
public void hyperMethod()  //create hyperMethod
{
System.out.println("This is hyper Methods....");

}

public void  ultraMethod()   //create ultraMethod
{ 
System.out.println("This is ultra Methods....");

}
}

