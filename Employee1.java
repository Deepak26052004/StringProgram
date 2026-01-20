public class Employee1 {
    public void getSalary(){
        System.out.println("Employee Salary");
        System.out.println("Salary: "+50000);
    }
}
class Manager extends Employee1{
    @Override
    public void getSalary(){
        System.out.println("Manager Salary");
        System.out.println("Salary: "+90000);
    }
    public static void main(String[] args) {
        Employee1 employee1=new Employee1();
        employee1.getSalary();
        Manager manager = new Manager();
        manager.getSalary();
    }
}
