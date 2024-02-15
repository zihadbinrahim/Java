import java.util.Scanner;
public class Temperature {
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		
		double celsius,fahrenheit;
		System.out.print("Enter Celsius Temperature: ");
		celsius = input.nextDouble();
		
		fahrenheit= 1.8*celsius+32 ;
		
		System.out.print("Fahrenheit: "+fahrenheit);
	}
}