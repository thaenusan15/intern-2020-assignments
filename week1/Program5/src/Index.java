
public class Index   //create a class
{
public static void main(String[] args) {
String[] studentNames = new String[10]; //create a string array
studentNames[0] = "Htet Lwin Aung";     //assign value to room 0 of array
studentNames[1] = "Nann May Mi Zhue";   //assign value to room 1 of array
studentNames[2] = "Hnin Yee Aye";       //assign value to room 2 of array
studentNames[3] = "Phyo Ei San";        //assign value to room 3 of array
studentNames[4] = "Hnin Nandar Aung";   //assign value to room 4 of array
studentNames[5] = "Thae Nu San";        //assign value to room 5 of array
studentNames[6] = "Lwin Nandar Oo";     //assign value to room 6 of array
studentNames[7] = "Phyo Zin Mar";       //assign value to room 7 of array
studentNames[8] = "Mi Thike Non";       //assign value to room 8 of array
studentNames[9] = "Khin Thu Thu KO";    //assign value to room 9 of array
for(int i = 0; i < studentNames.length;i++) //outer loop for matching input student name in array
{ if(studentNames[i] == "Thae Nu San")  //condition for matching name
{
System.out.println("I'm " + studentNames[i]);//print student name if the condition is successful
System.out.println();
System.out.println("and my Index is : " + i); //print the array index by matching name
}
}
}
}