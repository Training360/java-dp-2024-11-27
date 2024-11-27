package designpatterns.simplefactory;

public class HourlyPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Hourly pay");
    }
}
