public class Employee {
    int id;
    int workExperience;
    double salary;
    int[] score;

    Employee(int id,int workExperience,double salary,int[] score){
        this.id = id;
        this.workExperience = workExperience;
        this.salary = salary;
        int size = score.length;
        this.score = new int[size];
        for(int i=0; i<size; i++){
            this.score[i]=score[i];
        }
    }
    Employee(){}
    void bonusEligibility(){
        if(workExperience > 10 || salary < 10000){
            System.out.println("Eligible for bonus");
        }
    }
    void increment(int inc){
        double x =  ((double) inc /100);
        double add = (salary) + ((salary)*x);
        System.out.println("Increment is: "+add);
    }
    void averageScore(){
        int sum = 0;
        for(int i=0; i< score.length; i++){
            sum = sum + score[i];
        }
        System.out.println("Average score is: "+(sum/ score.length));
    }
    void display(){
        System.out.println("Employee id= "+id);
        System.out.println("workExperience in years= "+workExperience);
        System.out.println("monthly salary= "+salary);
        System.out.println();
    }
}
