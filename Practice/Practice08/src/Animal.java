public abstract class  Animal {
    public int legs;

    public abstract void eat();

    Animal(int legs){
        this.legs = legs;
    }
    public void walk(){
        System.out.println("Animal is walking with " + legs + " legs");
    }
}
