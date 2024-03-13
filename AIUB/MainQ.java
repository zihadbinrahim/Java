class Scholarship {
    private String dept;
    private double stipend;

    public Scholarship (){}

    public Scholarship (String dept, double stipend){
        this.dept=dept;
        this.stipend=stipend;
    }

    public void setDept(String dept){
        this.dept=dept;
    }
    public String getDept(){
        return dept;
    }

    public void setStipend(double stipend){
        this.stipend=stipend;
    }
    public double getStipend(){
        return stipend;
    }

    public void display(){
        System.out.println("Dept:"+dept);
        System.out.println("Stipend:"+stipend);
    }
    
}

class Student extends Scholarship {
    private String name;
    private char gender;
    private int[] marks;

    public Student (){}

    public Student(String dept, double stipend, String name, char gender, int[] marks){
        super(dept,stipend);
        this.name=name;
        this.gender=gender;
        this.marks=marks;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setGender(char gender){
        this.gender=gender;
    }
    public char getGender(){
        return gender;
    }

    public void setMarks (int[] marks){
        this.marks=marks;
    }

    public int[] getMarks(){
        return marks;
    }

    public void display (){
        super.display();
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.print("Marks:");

        for(int i = 0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }

    public double halfYearlyStipend(){
        return getStipend()*6;
    }
}    

public class MainQ {

    public static void main(String[] args) {
        Student str1 = new Student("CSE",1200,"Zihad",'M',new int[]{12,23,40});
        Student str2 = new Student("CSE",1150,"Adib",'M',new int[]{10,34,26});

        str1.display();
        System.out.println();
        str2.display();
        System.out.println();

        System.out.println(str1.halfYearlyStipend());
        System.out.println(str2.halfYearlyStipend());
    }
}