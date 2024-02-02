import java.util.Scanner;
public class ArithmeticOperator {
  
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,result;

        System.out.print("Enter 1st Number:");
        a= input.nextInt();

        System.out.print("Enter 2nd Number:");
        b= input.nextInt();

        result = a+b;
        System.out.println("Sum: "+result);

        result = a-b;
        System.out.println("Sub: "+result);

        result = a*b;
        System.out.println("Multiplication: "+result);

        result = a/b;
        System.out.println("Divition: "+result);

        result = a%b;
        System.out.println("Remainder: "+result);
    }
}
