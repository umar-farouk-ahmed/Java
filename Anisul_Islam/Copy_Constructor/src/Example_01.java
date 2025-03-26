public class Example_01 {
    String name;
    int id;

    Example_01(String name,int id){
    this.name = name;
    this.id = id;
    }

    Example_01(Example_01 e1){
        name = e1.name;
        id = e1.id;
    }

    void display(){
        System.out.println("Name: "+name+" "+"ID: "+id);
    }
}
