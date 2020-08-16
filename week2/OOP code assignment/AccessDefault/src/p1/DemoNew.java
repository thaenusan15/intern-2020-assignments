package p1;

class DemoNew 
{ 
	
	//This class is having default access modifier 
	
	    public static void main(String args[]) 
	       {   
	          //accessing class Demo from package p1 
	          Demo obj = new Demo(); //compile time error
	  
	          obj.display(); 
	       } 
	}