package Example2.Observer;

import Example2.Observable.WeatherDataObservableImpl;
import Example2.Observable.WeatherObservable;

public class StatisticsDisplay implements WeatherObserver, Display {

    private WeatherObservable weatherObservable;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;

    public StatisticsDisplay(WeatherObservable weatherObservable) {
        this.weatherObservable = weatherObservable;
        weatherObservable.registerObserver(this);
    }

    public void update() {
        if (weatherObservable instanceof WeatherDataObservableImpl) {
            float temp = ((WeatherDataObservableImpl) weatherObservable).getTemperature();
            tempSum += temp;
            numReadings++;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }

            display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
