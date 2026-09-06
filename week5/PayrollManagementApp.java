package week5;
class Employee {
    private String name;
    private int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    String getName() {
        return name;
    }
    int getId() {
        return id;
    }
    double calculateSalary() {
        return 0;
    }
    double calculateSalary(double amount) {
        return amount;
    }
    void printDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}
class SalariedEmployee extends Employee {
    private double monthlySalary;
    SalariedEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        if (monthlySalary <= 0) {
            this.monthlySalary = 1;
        } else {
            this.monthlySalary = monthlySalary;
        }
    }
    @Override
    double calculateSalary() {
        return monthlySalary;
    }
    @Override
    void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Salary: " + calculateSalary());
    }
}
class HourlyEmployee extends Employee {
    private double hours;
    private double hourlyRate;
    HourlyEmployee(String name, int id, double hours, double hourlyRate) {
        super(name, id);
        if (hours <= 0) {
            this.hours = 1;
        } else {
            this.hours = hours;
        }
        if (hourlyRate <= 0) {
            this.hourlyRate = 1;
        } else {
            this.hourlyRate = hourlyRate;
        }
    }
    @Override
    double calculateSalary() {
        return hours * hourlyRate;
    }
    @Override
    void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Hours: " + hours);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Salary: " + calculateSalary());
    }
}
class CommissionEmployee extends Employee {
    private double sales;
    private double commissionRate;
    CommissionEmployee(String name, int id, double sales, double commissionRate) {
        super(name, id);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }
    @Override
    double calculateSalary() {
        return sales * commissionRate / 100;
    }
    @Override
    void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Sales: " + sales);
        System.out.println("Commission Rate: " + commissionRate + "%");
        System.out.println("Salary: " + calculateSalary());
    }
}
class PayrollProcessor {
    private Employee[] employees;
    private int count;
    PayrollProcessor(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }
    void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        }
    }
    void printEmployees() {
        for (int i = 0; i < count; i++) {
            employees[i].printDetails();
            System.out.println();
        }
    }
    void searchEmployee(String name) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getName().equals(name)) {
                employees[i].printDetails();
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    double calculateTotalSalary() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total = total + employees[i].calculateSalary();
        }
        return total;
    }
}
public class PayrollManagementApp {
    public static void main(String[] args) {
        PayrollProcessor payroll = new PayrollProcessor(5);
        SalariedEmployee emp1 = new SalariedEmployee("Aman", 101, 5000);
        SalariedEmployee emp2 =new SalariedEmployee("Riya", 102, 45000);
        HourlyEmployee emp3 = new HourlyEmployee("Karan", 103, 160, 250);
        HourlyEmployee emp4 =new HourlyEmployee("Neha", 104, 150, 400);
        CommissionEmployee emp5 = new CommissionEmployee("Rahul", 105, 10000, 10);
        payroll.addEmployee(emp1);
        payroll.addEmployee(emp2);
        payroll.addEmployee(emp3);
        payroll.addEmployee(emp4);
        payroll.searchEmployee("Riya");
        System.out.println("Total Salary = " + payroll.calculateTotalSalary());
        Employee emp = new Employee("Student Employee", 106);
        System.out.println("Salary: " + emp.calculateSalary());
        System.out.println("Salary: " + emp.calculateSalary(30000));
    }
}
