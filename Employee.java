public class Employee {
    public void work(){
        System.out.println("Employee is working");
    }
}
class Developer extends Employee{
    public void writeCode(){
        System.out.println("Developer is writing code");
    }
    public static void main(String[] args) {
        Employee employee=new Developer(); //Upcasting

        if( employee instanceof Developer){
            Developer developer=(Developer) employee;
            developer.work();
            developer.writeCode();
        }
    }
}
