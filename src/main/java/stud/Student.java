package stud;

public class Student {
   private String firstName;
    private String lastName;
    private String group;
    private Double averageMark;

    public Student(String firstName, String lastName, String group, Double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public Double getAverageMark() {
        return averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group='" + group + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }

    public int getScholarship(){
        if (averageMark == 5){
           return 2000;
        } else {
            return 1900;
        }

    }
}
