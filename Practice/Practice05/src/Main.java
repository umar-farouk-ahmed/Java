public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Umar");
        student.setAge(20);
        student.setGradeLevel(3);
        student.attend();
        Teacher teacher = new Teacher();
        teacher.setName("Asif sir");
        teacher.setAge(35);
        teacher.setSubject("Math");
        teacher.leave("a meeting");
        Staff staff = new Staff();
        staff.setName("Ali Abdal");
        staff.setAge(30);
        staff.position = "Manager";
        staff.assit();
    }
}
