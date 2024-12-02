package designpatterns.simplefactory;

public interface Payment {

    void pay();

    static Payment createPayment(String s) {
        if (s.equals("h")) {
            return new HourlyPayment();
        }
        else {
            return new MonthlyPayment();
        }
    }
}
