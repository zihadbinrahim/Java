import java.util.Scanner;
public class Temperature {

    public static void main(String[] args) {
		
		float f,c;
		
	Scanner input = new Scanner(System.in);
		
	
	  System.out.print("Enter Farenheit Number:");
	  f = input.nextFloat();
	  	  
	  c = ((5f/9f)*(f-32));
	  
	  System.out.println("Coversion to Celsiuds:"+c+" C");
	  
        
    }
}
