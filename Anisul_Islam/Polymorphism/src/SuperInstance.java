public class SuperInstance {
    public static void main(String[] args) {
        Cat c = new Cat();
    }
}
class Animal{
    String color = "White";
}
class Cat extends Animal{
    String color = "Brown";
    Cat(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
