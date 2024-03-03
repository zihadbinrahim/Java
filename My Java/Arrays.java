import java.util.Scanner;

public class Arrays {
    public static void main (String [] args) {


        Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size:");
        int size = sc.nextInt();
        int number[] = new int[size];
		
		//input 
		for(int i=0; i<size; i++){
			
			System.out.print("Enter any number:");
			number[i] = sc.nextInt();
		}

        //output
        for(int i=0; i<number.length; i++){
            System.out.println(number[i]);
        }


    }
}


  /*int marks [] = new int[3];
        marks[0]= 97;
        marks[1]= 93;
        marks[2]= 95;*/

       /*System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);*/