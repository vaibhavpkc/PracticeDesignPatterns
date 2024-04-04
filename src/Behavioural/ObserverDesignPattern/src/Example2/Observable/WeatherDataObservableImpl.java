package Example2.Observable;

import Example2.Observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataObservableImpl implements WeatherObservable {
    List<WeatherObserver> weatherObserverList;
    private float temperature;
    private float humidity;
    private float pressure;
    boolean measurementsChanged;

    public WeatherDataObservableImpl() {
        weatherObserverList = new ArrayList<>();
        measurementsChanged = true;
    }

    @Override
    public void registerObserver(WeatherObserver weatherObserver) {
        weatherObserverList.add(weatherObserver);
    }

    @Override
    public void removeObserver(WeatherObserver weatherObserver) {
        weatherObserverList.remove(weatherObserver);
    }

    @Override
    public void notifySubscribers() {
        for (WeatherObserver weatherObserver : weatherObserverList) {
            weatherObserver.update();
        }
    }
    public void measurementsChanged() {
        notifySubscribers();
    }

    @Override
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    public float getTemperature() {
        return temperature;
    }
    public float getPressure() {
        return pressure;
    }
    public float getHumidity() {
        return humidity;
    }
}
