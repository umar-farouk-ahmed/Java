public class this_constructor {
    this_constructor(){
        System.out.println("Default cons and No Nums");
    }
    this_constructor(int x){
        this();
        System.out.println("One Parameterized cons and Num is: "+x);
    }
    this_constructor(int x,int y){
        this(7);
        System.out.println("Two Parameterized cons and Nums are: "+x+" "+y);
    }
    public static void main(String[] args) {
        this_constructor a = new this_constructor();
        System.out.println();
        this_constructor b = new this_constructor(10);
        System.out.println();
        this_constructor c = new this_constructor(20,30);
    }
}
