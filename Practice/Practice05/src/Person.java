public class Person {
    private String name;
    private int age;

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    void attend(){
        System.out.println(getName()+" is attending the school.");
    }
    void leave(){
        System.out.println(getName()+" is leaving the school.");
    }
}
