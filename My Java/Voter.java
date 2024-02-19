 import java.util.Scanner;
 public class Voter{
	 public static void main (String[] args){
		 Scanner input = new Scanner(System.in);
		 
		 int age;
		 
		 System.out.print("Enter Your Age: ");
		 age = input.nextInt();
		 
		 if(age>=18){
			 System.out.println("You are valid voter.");
		 }
		 else{
		 System.out.println("Sorry You are invalid voter.");
		 }
	 }
 }