public class this_constructor_02 {
    String name;
    int id,semester;
    double cgpa;

    this_constructor_02(String name,int id){
        this.name = name;
        this.id = id;
    }
    this_constructor_02(String name,int id,int semester,double cgpa){
        this(name,id);
        this.semester = semester;
        this.cgpa = cgpa;
    }
    void display(){
        System.out.println(name+" "+id+" "+cgpa+" "+semester);
    }
}
