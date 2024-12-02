package designpatterns.notadapter;

public class LoggerEventHandler extends TemperatureEventHandlerAdapter {

    @Override
    public void handleTemperatureIncrease(int temperature) {
        System.out.println("Temperature increased: " + temperature);
    }
}
