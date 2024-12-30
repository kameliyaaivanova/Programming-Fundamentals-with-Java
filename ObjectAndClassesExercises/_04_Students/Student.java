package ObjectAndClassesExercises._04_Students;

public class Student {

    private String firstName;
    private String secondName;
    private double grade;

    public Student(String firstName,String secondName,double grade){
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.secondName;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.secondName = lastName;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
