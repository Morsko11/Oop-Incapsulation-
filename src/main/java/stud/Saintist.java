package stud;

public class Saintist extends Aspirant {
   private String kandidat;
    public Saintist(String firstName, String lastName, String group, Double averageMark, String kandidat) {
        super(firstName, lastName, group, averageMark);
        this.kandidat = kandidat;
    }

    public String getKandidat() {
        return kandidat;
    }
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", group='" + getGroup() + '\'' +
                ", averageMark=" + getAverageMark() +'\''+
                ", kandidat=" + kandidat +'\''+
                '}';
    }

    public void setKandidat(String kandidat) {
        this.kandidat = kandidat;
    }

    public int getScholarship() {
        if (getAverageMark() == 5) {
            return 4244;
        } else {
            return 3200;
        }
    }
}
