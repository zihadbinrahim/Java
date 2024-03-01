import java.util.Scanner;

public class Factorial {

    public static void printFactorial (int n){

        int factorial = 1;

        for(int i=n; i>=1; i--){

            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }

    public static void main (String [] args ){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number:");

        int n = sc.nextInt();

        printFactorial(n);

    }
    
}
