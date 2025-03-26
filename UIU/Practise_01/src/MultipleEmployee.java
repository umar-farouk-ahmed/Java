import java.util.*;
public class MultipleEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employee_number;
        System.out.print("Enter the number of employees: ");
        employee_number = sc.nextInt();
        Employee[] employee = new Employee[employee_number];

        for(int i=0; i<employee.length; i++){
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            //sc.nextLine();
            System.out.println("Enter work experience: ");
            int workExperience = sc.nextInt();
            System.out.println("Enter monthly salary: ");
            double salary = sc.nextDouble();
            System.out.print("How many months you want to calculate score: ");
            int n;
            n = sc.nextInt();
            int[] score = new int[n];
            for(int j=0; j<n; j++){
                System.out.print("Enter "+i+" th month score: ");
                score[j] = sc.nextInt();
            }
            employee[i] = new Employee(id, workExperience, salary, score);
        }
        for(int i=0; i<employee_number; i++){
            employee[i].display();
            employee[i].bonusEligibility();
            employee[i].increment(20);
            employee[i].averageScore();
        }
    }
}
