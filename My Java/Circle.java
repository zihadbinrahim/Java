import java.util.Scanner;
 public class Circle{
		 private double radius ;
		 private String color;
	 
	 public Circle(double radius, String color){
		 this.radius= radius;
		 this.color=color;
	 }
	 public double area(){
		 return(3.1416*((radius)*(radius)));
	 }
	 public String color(){
		 return color;
	 }
	 public void display(){
		 System.out.println(area());
		 System.out.println(color());
	 }
	 public static void main (String[] args){
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print("Enter Radiud: "); 
		 double radius = input.nextDouble();
		 
		 System.out.print("Enter Color: "); 
		 String color = input.nextLine();
		 
		 Circle c = new Circle(radius,color);
		 
		 c.display();
	 }
 }