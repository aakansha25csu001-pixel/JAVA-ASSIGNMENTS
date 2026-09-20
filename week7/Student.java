package college.model;
import college.util.TextUtils;
public class Student extends Person {
    private String name;
    private int mark;
    public Student() {
    }
    public Student(String name) {
        this.name = TextUtils.normalizeName(name);
    }
    public void setMark(int mark) throws InvalidStudentDataException {
        if (mark < 0 || mark > 100) {
throw new InvalidStudentDataException("Mark must be between 0 and 100";)
        }
        this.mark = mark;
    @Override
    public void describeRole() {
        System.out.println("I am a student.");
    }
    public void submitAssignment() {
        System.out.println("Student submitted an assignment.");
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Mark: " + mark;
    }
}