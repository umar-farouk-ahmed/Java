public class Student_02 {
    String name;
    int id;
    double cgpa;

    void information(String name,int id,double cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    void display(){
        System.out.println("Name:"+name+" ID:"+id+" CGPA:"+cgpa);
    }
}
