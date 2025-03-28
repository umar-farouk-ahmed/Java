public class Mammal extends Animal{
    String furType;

    Mammal(String name,int age,String furType){
        this.name = name;
        this.age = age;
        this.furType = furType;
    }

    @Override
    public void eat() {
        System.out.println(name+"("+getGender()+","+"Fur Color: "+furType+")"+" is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println(name+" makes mammal sound.");
    }

    @Override
    public void sleep() {
        System.out.println("Mammal is sleeping.");
    }

    void nurseYoung(){
        System.out.println("Mammal is taking care of its child.");
    }
}
