package Example2.Observer;

import Example2.Observable.WeatherDataObservableImpl;
import Example2.Observable.WeatherObservable;

public class CurrentConditionsDisplay implements WeatherObserver, Display {

    private WeatherObservable weatherObservable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(WeatherObservable weatherObservable) {
        this.weatherObservable = weatherObservable;
        weatherObservable.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("The value of temperature is:" + temperature + "\n"
                + "The value of Pressure is: " + pressure + "\n"
                + "The value of Humidity is: " + humidity);
    }

    @Override
    public void update() {
        if (weatherObservable instanceof WeatherDataObservableImpl) {
            this.temperature = ((WeatherDataObservableImpl) weatherObservable).getTemperature();
            this.humidity = ((WeatherDataObservableImpl) weatherObservable).getHumidity();
            this.pressure = ((WeatherDataObservableImpl) weatherObservable).getPressure();
            display();
        }
    }
}
