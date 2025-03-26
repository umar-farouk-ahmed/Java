public class Example_01_Main {
    public static void main(String[] args) {
        Example_01 a = new Example_01("Umar",365);
        Example_01 b = new Example_01(a);

        a.display();
        b.display();
    }
}
