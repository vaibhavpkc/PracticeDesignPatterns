package Example2.Observer;

public interface WeatherObserver {

    public void update();

    /**
     * The below implementation should not be used instead the weatherObservable class object which has all these fields should
     * be injected in the class defining this method which will automatically take care of getting the values of the below fields.
     * Which can be seen in the CurrentConditionsDisplay class.
     *
     * public void update(float temp, float humidity, float pressure);
     */
}
