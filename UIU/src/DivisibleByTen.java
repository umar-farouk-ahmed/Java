import java.util.Scanner;
public class DivisibleByTen {
    public static  void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int count = 0;

        for(int i=first; i<=second; i++){
            if(i % 10 == 0){
                System.out.print(i+" ");
                ++count;
            }
        }
        System.out.println("\nTotal Numbers: "+count);
    }
}