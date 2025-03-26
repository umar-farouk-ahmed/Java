import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();

        switch(ch){
            case "a","e","i","o","u" ->{
                System.out.println("Vowel");
            }
            default ->{
                System.out.println("Consonant");
            }
        }
    }
}
