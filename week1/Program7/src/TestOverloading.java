class TestOverloading  //create a class
{  
    public static void main(String[] args){  
    System.out.println(Adder.add(11,11)); //call the add method with 2 parameter values and print the return value
    System.out.println(Adder.add(11,11,11));//call the add method with 3 parameter values and print the return value  
    }}  
    class Adder //create a class
    {  
        static int add(int a,int b) //create a method with 2 parameter as the same method name of another method
        {return a+b;}  //return a+b value
        static int add(int a,int b,int c)//create a method with 3 parameter as the same method name of another method
        {return a+b+c;} //return a+b+C value 
        }  
