public class Reptile extends Animal{

    String scaleColor;

    Reptile(String name,int age,String scaleColor){
        this.name = name;
        this.age = age;
        this.scaleColor = scaleColor;
    }

    void thermoegulation(int n){
        System.out.println("Reptile is thermoegulating in way."+n);
    }
    @Override
    public void eat() {
        System.out.println(name+"("+getGender()+","+"Scale Color: "+scaleColor+")"+" is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println(name+"makes a reptile sound");
    }

    @Override
    public void sleep() {
        System.out.println(name+" is sleeping.");
    }
}
