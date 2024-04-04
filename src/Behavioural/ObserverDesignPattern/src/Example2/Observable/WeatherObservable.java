package Example2.Observable;

import Example2.Observer.WeatherObserver;

public interface WeatherObservable {

    public void registerObserver(WeatherObserver weatherObserver);
    public void removeObserver(WeatherObserver weatherObserver);
    public void notifySubscribers();

    public void setMeasurements(float temperature, float pressure, float humidity);
}
