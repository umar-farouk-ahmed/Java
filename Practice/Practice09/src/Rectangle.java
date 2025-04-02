public class Rectangle {
    int length, width;

    public int CalculateArea(int length, int width){
        this.length = length;
        this.width = width;
        return length * width;
    }

    public int CalculatePerimeter(int length, int width){
        this.length = length;
        this.width = width;
        return 2 * (length + width);
    }
}
