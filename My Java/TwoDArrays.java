import java.util.Scanner;
public class TwoDArrays {
	public static void main (String [] args){
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Row Number: ");
		int row = sc.nextInt();
		System.out.print("Enter Colums Number: ");
		int cols = sc.nextInt();
		
		int [][] numbers = new int [row][cols];
		
		//input
		//row
		
		for(int i=0; i<row; i++){
			//colums
			for(int j=0; j<cols; j++){
				numbers[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		//output
		for(int i=0; i<row; i++){
			for(int j=0; j<cols; j++){
				//compare x
				if(numbers[i][j] ==x){
					System.out.println("x found at location ("+i+", "+j+")");
					
				}
				
			}
			
		}
	}
}