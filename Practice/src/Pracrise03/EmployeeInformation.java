package Pracrise03;
import java.util.Scanner;
public class EmployeeInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        Employee[] emp = new Employee[n];

        for(int i=0 ;i<n; i++){
            System.out.print("Enter name, id and salary of employee " + (i+1) + ": ");
            String name = sc.nextLine();
            String id = sc.nextLine();
            int salary = sc.nextInt();
            emp[i] = new Employee(name, id, salary);
            sc.nextLine();
        }

        int count = 0;
        for(int i=0; i<n; i++){
            if(emp[i].salary >= 12000){
                ++count;
            }
        }

        System.out.println("\nCount: "+count);

        int maxSalary = emp[0].salary;
        for(int i=0; i<n; i++){
            if(emp[i].salary > maxSalary){
                maxSalary = emp[i].salary;
            }
        }
        System.out.println("Maximum salary is: "+maxSalary);
    }
}
