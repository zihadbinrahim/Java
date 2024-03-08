public class StringsMain {
    public static void main(String args[]) {
        // Declare and initialize a string variable s1 with the value "CRICKET WROLDCUP"
        String s1 = "CRICKET WROLDCUP";

        // Declare and initialize an empty string variable s2
        String s2 = new String();

        // Declare and initialize a string variable s3 with the value "CRICKET WORLDCUP"
        String s3 = new String("CRICKET WORLDCUP");

        // Check if s1 is empty and print the result
        System.out.println(s1.isEmpty());

        // Check if s2 is empty and print the result
        System.out.println(s2.isEmpty());

        // Print the length of s1
        System.out.println(s1.length());

        // Print the length of s2
        System.out.println(s2.length());

        // Print the length of s3
        System.out.println(s3.length());

        // Print the character at index 1 of s3
        System.out.println(s3.charAt(1));

        // Concatenate s1 and s3 and print the result
        System.out.println(s1.concat(s3));

        // Extract a substring from s1 starting at index 2 and ending at index 7
        String s4 = s1.substring(2, 7);

        // Print the substring s4
        System.out.println(s4);

        // Print the original value of s1
        System.out.println(s1);

        // Convert s1 to lowercase and print the result
        s1 = s1.toLowerCase();
        System.out.println(s1);
    }
}