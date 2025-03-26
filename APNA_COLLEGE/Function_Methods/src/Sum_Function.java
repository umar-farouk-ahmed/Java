import java.util.*;
public class Sum_Function {
    public static  int calculateSum(int a,int b){
        int sum = a+ b;
//        System.out.println("Sum is: "+sum);
        return sum;
    }
    public static void main(String args[ ]){
        int first,second ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        first = sc.nextInt();
        second= sc.nextInt();
        int sum =calculateSum(first,second);
        System.out.println("Sum is: "+sum);
    }
}
