import java.util.Scanner;
public class AIUB {
	public static void main (String[] args) {
	 double id;
	 String name;
     String department;
     
	 
	 Scanner input = new Scanner (System.in);
	 
	 System.out.print("Enter Your Name: ");
	 name = input.nextLine();

	 System.out.print("Enter ID:");
	 id = input.nextInt();
     
	 Scanner input1 = new Scanner (System.in);
	 System.out.print("Enter Your Department Name:");
	 department = input1.nextLine();
	 
	 System.out.println("Name :"+name);
	 System.out.println("Your id :"+id);
	 System.out.println("Your Department Name :"+department);
	 
	}
}  