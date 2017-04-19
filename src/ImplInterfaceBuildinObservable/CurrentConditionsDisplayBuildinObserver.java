/**
 * 
 */
package ImplInterfaceBuildinObservable;

import java.util.Observable;
import java.util.Observer;

import Service.DisplayElement;

/**
 * @author alex_jd
 *
 */
public class CurrentConditionsDisplayBuildinObserver implements Observer, DisplayElement{
	
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplayBuildinObserver (Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Buildin...Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherDataObservable) {
			WeatherDataObservable weatherDataObservable = (WeatherDataObservable) o;
			this.temperature = weatherDataObservable.getTemperature();
			this.humidity = weatherDataObservable.getHumidity();
			display();
		}
	}
	
	/**
	 *  method get the current data from Subject
	 * @param no params
	 */
	public void renewData() {
		if (observable instanceof WeatherDataObservable) {
			WeatherDataObservable weatherDataObservable = (WeatherDataObservable) observable;
			this.temperature = weatherDataObservable.getTemperature();
			this.humidity = weatherDataObservable.getHumidity();
			display();
		}
	}

}
