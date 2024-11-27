package designpatterns.simplefactory;

// GoF Tervezési minták
//   factory method
//   abstract factory
//   "simple factory"
public class PaymentSimpleFactory {

    public Payment createPayment(String s) {
        if (s.equals("h")) {
            return new HourlyPayment();
        }
        else {
            return new MonthlyPayment();
        }
    }

    public static void main(String[] args) {
        Payment payment = new PaymentSimpleFactory().createPayment("h");
        System.out.println(payment instanceof HourlyPayment);
    }
}
