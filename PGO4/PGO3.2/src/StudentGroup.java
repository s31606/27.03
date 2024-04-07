import java.util.ArrayList;

public class StudentGroup {
    public String nazwa;
    public ArrayList<Student> students = new ArrayList<Student>();
    public void AddStudent(Student student) throws Exception {
        if (students.size() < 15) {
            this.students.add(student);
        } else {
            throw new IllegalArgumentException("Maksymalna liczba osób w grupie to 15");
        }
        if (students.contains(student)) {
            throw new IllegalArgumentException("Student znajduje się już w tej grupie");
        }
    }
}