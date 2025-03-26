class Person{
    String name;
}
public class Pass_by_Ref {
    public static void update(Person x){
        x.name="Talha";
    }
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Umar";
        System.out.println(p.name);
        update(p);
        System.out.println(p.name);
    }
}
