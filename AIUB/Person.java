public class Person {
    private String name;
    private int age;
    private String gender;

    public Person (String name, int age, String gender ){

        this.name = name;
        this.age = age;
        this.gender = gender;
	}

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }    

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }

    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);
    }

    public static void main (String [] args){

        Person p = new Person("Ziahd", 22, "Male");
		
		p.display();
    }

}
