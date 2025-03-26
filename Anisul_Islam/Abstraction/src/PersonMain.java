public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new PersonUmar();
        Person p2 = new PersonTalha();

        p1.message();
        p1.call();
        p2.message();
        p2.call();
    }
}
