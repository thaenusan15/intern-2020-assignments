
public class NumberArray  //create a class
{
	public static void main(String[] args) {
		int[] numArray = {34,54,64,42,34,56,44,65,87,23,57,74}; //create an integer array
		int biggestNumber=numArray[0]; //variable assign
		for(int number:numArray) //looping for finding biggest number in array
		{
			if(biggestNumber<number) //condition for finding biggest number
				biggestNumber=number; //value assign
		}
		int smallestNumber=numArray[0];  //variable assign
		for(int number:numArray)  //looping for finding smallest number in array
		{
			if(smallestNumber>number)  //condition for finding smallest number
				smallestNumber=number; //value assign
		}
		System.out.println("The Biggest Number:"+biggestNumber);//print biggest number in array
		System.out.println("The Smallest Number:"+smallestNumber);//print smallest number in array
		}
	
}

