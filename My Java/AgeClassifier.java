import java.util.Scanner;
public class AgeClassifier {
    public static void main(String[] args) {
        int age; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Your Age:");
		
		age = input.nextInt();
		

        if (age >= 13 && age <= 17) {
            System.out.println("Teen.");
        } else if (age >= 18 && age <= 30) {
            System.out.println("Adult.");
        } else if (age >= 31 && age <= 59) {
            System.out.println("Middle age.");
        } else {
            System.out.println("Senior.");
        }
    }
}