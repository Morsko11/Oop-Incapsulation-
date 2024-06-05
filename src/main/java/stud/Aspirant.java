package stud;

public class Aspirant  extends  Student{

    public Aspirant(String firstName, String lastName, String group, Double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    public int getScholarship() {
        if (getAverageMark() == 5) {
            return 2500;
        } else {
            return 2200;
        }
    }
}
