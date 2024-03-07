class Zoo {
    private String place;
    private double ticket;

    public Zoo (){}

    public Zoo (String place, double ticket){
        this.place = place;
        this.ticket = ticket;
    }

    public void setPlace(String place){
        this.place = place;
    }
    public String getPlace(){
        return place;
    }

    public void setTicket(double ticket){
        this.ticket = ticket;
    }
    public double getTicket(){
        return ticket;
    }

    public void display(){
        System.out.println("Place Name: "+place);
        System.out.println("Ticket Number: "+ticket);
    }
}

class Animal extends Zoo {
    private String name;
    private int number;
    private double ageinMonth;

    public Animal() {}

    public Animal (String name, int number, double ageinMonth){
        super(place, ticket);

        this.name = name;
        this.number = number;
        this.ageinMonth = ageinMonth;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }

    public void setAgeinMonth(double ageinMonth){
        this.ageinMonth = ageinMonth;
    }
    public double getAgeinMonth(){
        return ageinMonth;
    }

    public void display (){

        System.out.println("Name:"+name);
        System.out.println("Number: "+number);
        System.out.println("Agein Month:"+ageinMonth);
    }

    public double AgeinYear(){
        return 
    }
}