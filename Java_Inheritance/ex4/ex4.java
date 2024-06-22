package Java_Inheritance.ex4;

public class ex4 {
    public static void main(String[] args) {
        Employee employee = new Employee(40000);
        HRManager hrManager = new HRManager(70000);

        employee.work();
        System.out.println("Employee salary: " + employee.getSalary());
        hrManager.work();
        System.out.println("Manager salary: " + hrManager.getSalary());
        hrManager.addEmployee();
    }
}
