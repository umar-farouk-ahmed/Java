public class Teacher extends Person{
    String subject;

    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    void leave(String reason){
        System.out.println(getName()+" is leaving the school for "+reason+".");
    }
}
