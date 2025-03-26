import java.util.*;
public class Calculator {
    int a,b;
    Calculator(int a,int b){
        this.a = a;
        this.b = b;
    }
    int  getFactorial(){
        int fact=1;
        for(int i=1; i<=a; i++){
            fact = fact * i;
        }
        System.out.println("Factorial with no arg: ");
        return fact;
    }
    int  getFactorial(int a){
        int fact=1;
        for(int i=1; i<=a; i++){
            fact = fact * i;
        }
        System.out.println("Factorial with 1 arg: ");
        return fact;
    }
    int  pow(){
        System.out.println("Power method with no arg: ");
        int x = (int)Math.pow(a,b);
        return x;
    }
    int pow(int a,int b){
        System.out.println("Power method for 2 arg: ");
        int x = (int)Math.pow(a,b);
        return x;
    }
    int multiply(){
        System.out.println("multiple method with no arg: ");
        return a*b;
    }
    int multiply(int a,int b){
        System.out.println("multiple method with 2 arg: ");
        return a*b;
    }

}
class TestCalc{
    public static void main(String[] args) {
        Calculator c1 = new Calculator(3,2);
        System.out.println(c1.getFactorial());
        System.out.println(c1.getFactorial(4));
        System.out.println(c1.pow());
        System.out.println(c1.pow(4,2));
        System.out.println(c1.multiply());
        System.out.println(c1.multiply(5,6));
    }
}
