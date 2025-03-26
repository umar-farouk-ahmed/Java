public class Student_03 {
    String name;
    int id;
    double cgpa;

    Student_03(){
        System.out.println("Default Constructor !!!");
    }

    Student_03(String name,int id,double cgpa){
        this.name = name;
        this.id = id ;
        this.cgpa = cgpa;
    }

    void display(){
        System.out.println("Name:"+name+" ID:"+id+" CGPA:"+cgpa);
    }
}
