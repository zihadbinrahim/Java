import java.util.Scanner;
public class Mark {

    public static void main(String[] args) {
		int a,b,c,d;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 1st Subject: ");
		a= input.nextInt();
		
		
		System.out.print("Enter 2nd Subject: ");
		b= input.nextInt();
		
		
		System.out.print("Enter 3rd Subject: ");
		c= input.nextInt();
		
		System.out.print("Enter 4th Subject: ");
		d= input.nextInt();
		
		
		float sum = a+b+c+d;
		
		float percentage = (sum/400)*100;
		
		System.out.println("Percenttage	of 4 Subject: "+percentage);
		
		
		
		
		
        
    }
}
