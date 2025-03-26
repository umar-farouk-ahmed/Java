import java.util.Scanner;
public class FirstDigit {
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit = 0;
        while(number != 0){
            digit = number % 10;
            number = number / 10;
        }
        System.out.println("\nFirst Digit: "+digit);
    }
}
