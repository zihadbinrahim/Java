import java.util.Scanner;
public class Sum3Num {

    public static void main(String[] args) {
		int a,b,c;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 1st Subject: ");
		a= input.nextInt();
		
		
		System.out.print("Enter 2nd Subject: ");
		b= input.nextInt();
		
		
		System.out.print("Enter 3rd Subject: ");
		c= input.nextInt();
		
		
		
		int sum = a+b+c;
		
		int average = (a+b+c)/3;
		
		System.out.println("Total of 3 Subject: "+(float)average);
		
		
		
		
		
        
    }
}
