public abstract class Animal {
    public String name;
    public int age;
    private String gender;
    private String habitat;

    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }

    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public String getHabitat(){
        return habitat;
    }

    public abstract void eat();
    public abstract void makeSound();
    public abstract void sleep();
}
