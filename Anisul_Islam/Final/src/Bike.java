public class Bike {
    final int speed;
    Bike(){
        speed = 50;
        System.out.println("Speed is "+speed);
    }
}
class Bike_Main{
    public static void main(String[] args) {
        Bike b = new Bike();
    }
}
