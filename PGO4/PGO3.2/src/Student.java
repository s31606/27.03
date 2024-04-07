import java.util.ArrayList;

public class Student {
    public String fname;
    public String lname;
    public String indexNumber;
    public String email;
    public String address;
    public ArrayList<Double> grades;
    public double calculateAvg() {
        //grades.size()

        if (grades.size() < 20) {
            double avg = 0;
            for (int i = 0; i < grades.size(); i++) {
                avg += grades.get(i);
            }
            avg /= grades.size();

            double grade = 0;
            if (avg <= 2.4) {
                grade = 2;
            }

            if (avg > 2.4 && avg <= 2.5) {
                grade = 2.5;
            }

            if (avg > 2.5 && avg <= 3.4) {
                grade = 3;
            }

            if (avg > 3.4 && avg <= 3.5) {
                grade = 3.5;
            }

            if (avg > 3.5 && avg <= 4.4) {
                grade = 4;
            }

            if (avg > 4.4 && avg <= 4.5) {
                grade = 4.5;
            }

            if (avg > 4.5 && avg <= 5) {
                grade = 5;
            }

            if (avg > 5 || avg == 0) {
                throw new IllegalArgumentException("Student nie ma żadnych ocen");
            }
            return grade;
        }

        return 0;
    }
}