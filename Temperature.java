import java.util.Scanner;
public class Temperature {

    public static void main(String[] args) {
		
		float f,c;
		
	Scanner input = new Scanner(System.in);
		
	
	  System.out.print("Enter Farenheit Number:");
	  f = input.nextFloat();
	  	  
	  c = ((5f/9f)*(f-32));
	  
	  System.out.printf("Coversion to Celsiuds: % 2f",c," C");
	  
        
    }
}
