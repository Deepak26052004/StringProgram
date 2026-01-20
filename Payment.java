abstract public interface Payment {
    abstract void pay();
}
class UPI implements Payment{
    @Override
    public void pay(){
        System.out.println("UPI Payment System");
    }
    public static void main(String[] args) {
        Payment payment=new UPI();
        payment.pay();
    }
}
