public class Area {
    public static void main(String[] args) {
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }
}

class Square{
    int area (int side){
        return  side*side;
    }
}
class Circle{
    Square a = new Square();
    double pi = 3.1416;
    double area(int radius){
        return pi*(a.area(radius));
    }
}