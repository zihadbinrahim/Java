import java.util.Scanner;
public class AIUB {
	public static void main (String[] args) {
	 double id;
	 String name;
     String department;
     
	 
	 Scanner input1 = new Scanner (System.in);
	 System.out.print("Enter Your Name: ");
	 name = input1.nextLine();
	 
	 Scanner input2 = new Scanner (System.in);
	 System.out.print("Enter ID:");
	 id = input2.nextInt();
	 
	 Scanner input3 = new Scanner (System.in);
	 System.out.print("Enter Your Department Name:");
	 department = input3.nextLine();
	 
	 System.out.println("Name :"+name);
	 System.out.println("Your id :"+id);
	 System.out.println("Your Department Name :"+department);
	 
	}
}