package Example2;

import Example2.Observable.WeatherDataObservableImpl;
import Example2.Observable.WeatherObservable;
import Example2.Observer.*;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherObservable weatherDataObservable = new WeatherDataObservableImpl();
        //The below observers are getting registered internally by calling weatherDataObservable.registerObserver(currentDisplay);
        // in their class constructors. Therefore here we don't need to call them explicitly to be add them to subscriber list.
        WeatherObserver currentDisplay =
                new CurrentConditionsDisplay(weatherDataObservable);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherDataObservable);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherDataObservable);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherDataObservable);

        weatherDataObservable.setMeasurements(80, 65, 30.4f);
        weatherDataObservable.setMeasurements(82, 70, 29.2f);
        //removing this observer the statistics observer will be unsubscribed and he will stop getting details.
        weatherDataObservable.removeObserver(statisticsDisplay);
        weatherDataObservable.setMeasurements(78, 90, 29.2f);

    }
}
