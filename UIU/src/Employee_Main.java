import java.util.*;
class Employee{
    String name,id;
    int salary;
    public Employee(String name,String id,int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}
public class Employee_Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = sc.nextInt();
        sc.nextLine();
        Employee[] e = new Employee[n];

        for(int i=0; i<n; i++){
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            String id = sc.nextLine();
            int salary = sc.nextInt();
            sc.nextLine();
            e[i] = new Employee(name,id,salary);
        }
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<e.length; i++){
            if(e[i].salary >12000){
                ++count;
            }
            if(e[i].salary > max){
                max = e[i].salary;
            }
        }
        System.out.println("Count: "+count);
        System.out.println("Max: "+max);
    }
}
