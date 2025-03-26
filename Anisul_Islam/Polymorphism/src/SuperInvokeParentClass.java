public class SuperInvokeParentClass {
    public static void main(String[] args) {
        Umar a = new Umar();
        a.info();
    }
}
class Student{
    void info(){
        System.out.println("I am a student");
    }
}
class Umar extends Student{
    void id(){
        System.out.println("My id is 365");
    }
    void info(){
        super.info();
        id();
        System.out.println("3rd semester course OOP LAB");
    }

}
