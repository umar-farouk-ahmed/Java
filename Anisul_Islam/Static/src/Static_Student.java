public class Static_Student {

    static int count = 0;

    Static_Student(){
        ++count;
    }

    void  display(){
        System.out.println("Total objects created: "+count);
    }
}
