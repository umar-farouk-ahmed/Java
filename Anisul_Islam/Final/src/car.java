public class car {
    final void display(){
        System.out.println("This is not a car");
    }
}
class Civic extends car{
    public static void main(String[] args) {
        new car().display();
        new Civic().display();
    }
}
