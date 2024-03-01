 import java.util.Scanner;
 public class Sum{
	 private int a;
	 private int b;
	 
	 public Sum (int a, int b){ //constructor 
		 
		 this.a = a;
		 this.b = b;
	 
	 } 
	 
	 public int add(){
		 return a + b;
	 }
	 
	 public void display (){ //Display Fanction
		 System.out.println (add());
	 }
	 
	 public static void main (String[]args){
		 Scanner input = new Scanner (System.in);
		 
		 System.out.print("Enter First Number : ");
		 int a = input.nextInt();
		 System.out.print("Enter Second Number : ");
		 int b = input.nextInt();
		 
		 Sum ss = new Sum (a,b); //object
		 
		 ss.display();
		 
	 }
	 
	 }