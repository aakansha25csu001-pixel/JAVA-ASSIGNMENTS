package week5;

class Person {
    private String name;
    private String id;
    Person(String name, String id) 
    {
        this.name = name;
        this.id = id;
    }
    String getName() {
        return name;
    }
    String getId() {
        return id;
    }
    void printDetails() 
    {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
    void displayInfo(String name) {
        System.out.println("Person Name: " + name);
    }
    void displayInfo(String name, String id) 
    {
        System.out.println("Person Name: " + name);
        System.out.println("Person ID: " + id);
    }
}
class Student extends Person {
    private int[] marks;
    Student(String name, String id, int[] marks) {
        super(name, id);
        this.marks = marks;
    }
    double calculateAverage() {
        if (marks.length == 0) {
            return 0;
        }
        int total = 0;
        for (int i=0;i<marks.length;i++) {
            total += marks[i];
        }
        return (double) total / marks.length;
    }
    @Override
    void printDetails() 
    {
        System.out.println("student Name: " + getName());
        System.out.println("student ID: " + getId());
        System.out.println("student Average Marks: " + calculateAverage());
    }
}
class Instructor extends Person 
                                                                                                                                        {
    private String subject;
    Instructor(String name, String id, String subjects) {
        super(name, id);
        this.subject = subjects;
    }
    @Override
    void printDetails() {
        System.out.println(" instructor Name: " + getName());
        System.out.println(" instructor ID: " + getId());
        System.out.println("instructor Subject: " + subject);
    }
}
class CampusRegistry {
    private Person[] people;
    private int count;
    CampusRegistry(int capacity) {
        people = new Person[capacity];
        count = 0;
    }
    void addPerson(Person person) {
        if (count < people.length) {
            people[count] = person;
            count++;
        }
    }
    void printPeople() {
        for (int i = 0; i < count; i++) {
            people[i].printDetails();
            System.out.println();
        }
    }
    void FindPerson(String name) {
        for (int i = 0; i < count; i++) {
            if (people[i].getName().equals(name)) {
                people[i].printDetails();
                return;
            }
        }
        System.out.println("Person not found.");
    }
    void printStudentAvg() {
        for (int i = 0; i < count; i++) {
            if (people[i] instanceof Student) {
                Student student = (Student) people[i];
                System.out.println("Name: " + student.getName());
                System.out.println("Average: " + student.calculateAverage());
    }
}
}
}
public class CampusManagementApp {
    public static void main(String[] args) {
        CampusRegistry reg= new CampusRegistry(5);
        int[] marks1 = {96, 95, 90};
        int[] marks2 = {99, 85, 82};
        int[] marks3 = {95, 96, 90};
        Student stud1 = new Student("Amit", "S101", marks1);
        Student stud2 = new Student("Riya", "S102", marks2);
        Student stud3 = new Student("Kabir", "S103", marks3);
        Instructor inst1 =new Instructor("Dr. Sharma", "I101", "Java");
        Instructor inst2 =new Instructor("Dr. Mehta", "I102", "DBMS");
        reg.addPerson(stud1);
        reg.addPerson(stud2);
        reg.addPerson(inst1);
        reg.addPerson(inst2);
        reg.printPeople();
        reg.FindPerson("Riya");
        Person p = new Person("Neha", "P101");
        p.displayInfo("Neha");
        p.displayInfo("Neha", "P101");
    }
}
