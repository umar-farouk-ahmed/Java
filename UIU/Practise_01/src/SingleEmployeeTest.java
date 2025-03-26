import  java.util.*;
public class SingleEmployeeTest {
    public static void main(String[] args) {
        Employee e =new Employee();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter id: ");
        e.id = sc.nextInt();
        System.out.print("Enter work Experience: ");
        e.workExperience = sc.nextInt();
        System.out.println("Enter monthly salary: ");
        e.salary = sc.nextDouble();
        System.out.print("How many months you want to calculate score: ");
        int n;
        n = sc.nextInt();
        e.score = new int[n];
        for(int i=0; i<e.score.length; i++){
            System.out.print("Enter "+i+" th month score: ");
            e.score[i] = sc.nextInt();
        }
        e.display();
        e.bonusEligibility();
        e.increment(20);
        e.averageScore();
    }
}
