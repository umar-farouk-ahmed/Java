public class Student extends Person{
    int gradeLevel;

    public void setGradeLevel(int gradeLevel){
        this.gradeLevel = gradeLevel;
    }
    public int getGradeLevel(){
        return gradeLevel;
    }
    void attend(){
        System.out.println(getName()+" is attending the class.");
    }
}
