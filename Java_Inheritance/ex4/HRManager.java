package Java_Inheritance.ex4;

public class HRManager extends Employee{

    public HRManager(int salary)
    {
        super(salary);
    }

    @Override
    public void work()
    {
        System.out.println("\nManaging employees");
    }

    public void addEmployee()
    {
        System.out.println("\nAdding new Employee!");
    }
}
