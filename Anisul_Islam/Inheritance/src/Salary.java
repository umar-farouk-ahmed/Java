class Senior_Developer{
    int salary = 90000;
    void display(){
        System.out.println("Senior developer salary is: "+salary);
    }
}
class Junior_Developer extends Senior_Developer{
    void display(){
        super.salary = 50000;
        System.out.println("Junior developer salary is: "+salary);
    }
}
public class Salary {
    public static void main(String[] args) {
        Senior_Developer s1 = new Senior_Developer();
        Junior_Developer j1 = new Junior_Developer();

        s1.display();
        j1.display();
    }
}

