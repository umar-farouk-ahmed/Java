import java.util.Scanner;
public class TestRectangle {
    public static void main(String[] args) {
        System.out.println("Enter dimensions of rectangle: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Please enter choice: 1.Area of Reactangle. 2.Perimeter of rectangle.");
        int choice = sc.nextInt();

        Rectangle r = new Rectangle();
        if(choice == 1){
            System.out.println("Area is: "+ r.CalculateArea(a,b));
        }
        else{
            System.out.println("Perimeter is: "+ r.CalculatePerimeter(a,b));
        }
    }
}
