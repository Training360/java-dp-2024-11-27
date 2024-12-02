package designpatterns.notadapter;

public interface TemperatureEventHandler {

    void handleTemperatureIncrease(int temperature);

    void handleTemperatureDecrease(int temperature);
}
