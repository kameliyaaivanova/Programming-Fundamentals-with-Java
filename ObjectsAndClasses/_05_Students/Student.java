package ObjectsAndClasses._05_Students;

public class Student {

    private String firstName;
    private String lastName;
    private String age;
    private String homeTown;


    public Student(String firstName, String lastName, String age, String homeTown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;

    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getAge(){
        return this.age;
    }
    public void setAge(String age){
        this.age = age;
    }

    public String getHomeTown(){
        return this.homeTown;
    }
    public void setHomeTown(String homeTown){
        this.homeTown = homeTown;
    }
}
