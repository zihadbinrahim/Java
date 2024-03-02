class Student {
	String name;
    int id;
    int[] marks;
    
 
    public Student(String name, int id, int[] marks) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }
 
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.print("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
 
public class StudentRecords {
    public static void main(String[] args) {
 
        // Creating array of object
        System.out.println("Display using Array of object: ");
        Student[] st = new Student[2];
 
        st[0] = new Student("Alok", 10, new int[]{90,87,89});
        st[1] = new Student("Zihad", 23, new int[]{76,88,68});
 
        for (int i = 0; i < st.length; i++) {
            st[i].display();
        }
 
        // Creating object of class
        System.out.println("Display using object of Class: ");
        Student st1 = new Student("Alok", 10, new int[]{90,87,89});
        Student st2 = new Student("Zihad", 23, new int[]{76,88,68});
 
        st1.display();
        st2.display();
	}	

}