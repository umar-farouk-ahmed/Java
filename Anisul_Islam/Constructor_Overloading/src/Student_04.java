public class Student_04 {
    String name,gender;
    int id;
    double cgpa;

    Student_04(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    Student_04(int id, double cgpa){
        this.id = id;
        this.cgpa = cgpa;
    }

    void display(){
        System.out.println("Name:"+name+" ID:"+id+" CGPA:"+cgpa+" Gender: "+gender);
    }
}
