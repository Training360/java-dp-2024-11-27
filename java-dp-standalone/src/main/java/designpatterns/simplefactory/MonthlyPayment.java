package designpatterns.simplefactory;

public class MonthlyPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Monthly pay");
    }
}
