public class Calculator {
    public static void add(){
        System.out.println("Adding Problem");
    }
    public static void add(int a, int b){
        System.out.println("Two Integer Number addition: "+(a+b));
    }
    public static void add(double a, double b){
        System.out.println("Two Double Number addition: "+(a+b));
    }
    public static void add(int a, int b, int c){
        System.out.println("Three Integer Number addition: "+(a+b+c));
    }
    public static void add(double a, double b, double c){
        System.out.println("Three Double Number addition: "+(a+b+c));
    }
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.add();
        calculator.add(2, 3);
        calculator.add(2.5, 3.5);
        calculator.add(5, 6, 2);
        calculator.add(5.5,6.5,7.5);
    }

}
