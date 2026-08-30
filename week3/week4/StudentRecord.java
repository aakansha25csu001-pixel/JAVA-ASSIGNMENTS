package week4;
public class StudentRecord {
    static class Student{
    private String name;
    private String studentId;
    private int mark;

    public Student(String name, String studentId, int mark) {
        if (name==null || name.isBlank()){
            System.out.println("Name cannot be blank");
        }
        if (studentId==null || studentId.isBlank()){
            System.out.println("Student Id cannot be blank"); 
        }
        if (mark<0 || mark>100){
             System.out.println("Mark cannot be greater than 100 and less than 0");
        }
        this.name=name;
        this.studentId=studentId;
        this.mark=mark;
    }
    public String getName(){
        return name;
    }
    public String getStudentId(){
        return studentId;
    }
    public int getMark(){
        return mark;
    }
    public boolean setMark(int newMark){
        if(newMark>=0 && newMark<=100){
            mark=newMark;
            return true;
        }
        return false;
    }
    public boolean haspassed(){
        return mark>=50;
    }
    public String getclassfication(){
        if(mark>=80){
            return "Distinction";
        }
        if (mark>=70){
            return "First Class";
        }
        if(mark>=50){
            return "Pass";
        }
        else {
            return "Fail";
        }
    }
    @Override
    public String toString() {
            return "Name:"+ name+",Student id:"+studentId+",Mark:"+mark+",classfication:"+getclassfication();
        }
    }
    public static void main(String[] args) {
        Student s1=new Student("Aakansha","S101",49);
         Student s2=new Student("Bhavika","S102",50);
          Student s3=new Student("Bhavna","S103",79);
          s1.setMark(49);
          s2.setMark(50);
          s3.setMark(79);
          Student s4=new Student("Ananya","S104",60);
          boolean update=s1.setMark(101);
          System.out.println(update);
          System.out.println(s1);
          System.out.println(s2);
          System.out.println(s3);
          System.out.println(s4);
    }
}