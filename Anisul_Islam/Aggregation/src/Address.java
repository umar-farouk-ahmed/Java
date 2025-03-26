public class Address {
    String country,city;
    int postCode;
    public Address(String country , String city, int postCode){
        this.country = country;
        this.city = city;
        this.postCode = postCode;
    }
}
class Employee{
    String name;
    int id;
    Address address;
    public Employee(String name,int id,Address address){
        this.name = name;
        this.id = id;
        this.address = address;
    }
    void display(){
        System.out.println("Name: "+name+" Id: "+id+" Country: "+address.country+" City: "+address.city);
    }
}
class Main{
    public static void main(String[] args) {
        Address a1 = new Address("Bangladesh","Dhaka",1212);
        Employee e1 =new Employee("Umar",365,a1);
        e1.display();
    }
}
