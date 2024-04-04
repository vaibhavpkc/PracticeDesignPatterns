package Example2.Observer;

import Example2.Observable.WeatherDataObservableImpl;
import Example2.Observable.WeatherObservable;


public class ForecastDisplay implements WeatherObserver, Display {
	/**
	 * 	For abstraction we are having the interface(WeatherObservable) object declared here which can be reused in future.
	 * 	And not hard coding to a specific class(WeatherDataObservableImpl)  which is implementing this interface.
	 */

	private WeatherObservable weatherObservable;
	private float currentPressure = 29.92f;
	private float lastPressure;

	public ForecastDisplay(WeatherObservable weatherObservable) {
		this.weatherObservable = weatherObservable;
		weatherObservable.registerObserver(this);
	}

	public void update() {
		if (weatherObservable instanceof WeatherDataObservableImpl) {
			lastPressure = currentPressure;
			currentPressure = ((WeatherDataObservableImpl) weatherObservable).getPressure();
			display();
		}
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}
