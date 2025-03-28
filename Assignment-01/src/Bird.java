public class Bird extends Animal{

    double wingSpan;

    Bird(String name,int age,double wingSpan){
        this.name = name;
        this.age = age;
        this.wingSpan = wingSpan;
    }

    void fly(){
        System.out.println(name+" is flying in the sky.");
    }

    void sleep(int hours){
        System.out.println(name+" is sleeping for " + hours + " hours.");
    }

    @Override
    public void eat() {
        System.out.println(name+"("+getGender()+","+"Wing Span: "+wingSpan+")"+" is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println(name+"makes a bird sound.");
    }

    @Override
    public void sleep() {
        System.out.println(name+" is sleeping for ");
    }

}
