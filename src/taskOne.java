class Employee{
    static String name;
    static int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public String toString(){
        return "Employee Name: " + name + "\nSalary: " + salary;
    }
}
class Manager extends Employee{


    private String department;
    public Manager(String department){
        super(name, salary);
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }

    public String toString(){
        return super.toString() + "\nDepartment: " + department;
    }
}

public class taskOne {
    public static void main(String[] args) {
        Employee emp = new Employee("Mr. X", 100);
        Manager mng = new Manager("Executive Officer");
        System.out.println(mng.toString());
    }
}
