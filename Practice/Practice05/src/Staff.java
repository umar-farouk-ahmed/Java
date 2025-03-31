public class Staff extends Person{
    String position;

    public void setPosition(String position){
        this.position = position;
    }
    public String getPosition(){
        return position;
    }

    void assit(){
        System.out.println(getName()+" "+position+" is assisting with school operations.");
    }
}
