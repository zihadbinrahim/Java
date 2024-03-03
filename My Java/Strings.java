import java.util.Scanner;

public class Strings {
	public static void main (String [] args){
		
		/*String firstname = "Zihad";
		String lastname = "Bin Rahim";
		String fullname = firstname + " " + lastname;
		
		System.out.println(fullname.length());
		
		//charAt
		for(int i=0; i<fullname.length(); i++){
			System.out.println(fullname.charAt(i));
		}*/
		
		String name1 = "Zihad";
		String name2 = "Zihad";
		
		if(name1.compareTo(name2) ==0){
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("Strings are not equal");
		}
	}
}