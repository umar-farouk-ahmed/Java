class Shape{
    void printShape(){
        System.out.println("This is shape");
    }
}
class Rectangle extends Shape{
    void printRectangle(){
        System.out.println("This is a rectangular shape");
    }
}
class Circle extends Shape{
    void printCircle(){
        System.out.println("This is a circular shape");
    }
}
class Square extends Rectangle{
    void printSquare(){
        System.out.println("Square is a rectangle");
    }
}
public class Question_07 {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.printShape();
        s1.printRectangle();
    }
}


