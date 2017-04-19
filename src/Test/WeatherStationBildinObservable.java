/**
 * 
 */
package Test;

import ImplInterface.CurrentConditionsDisplay;
import ImplInterface.WeatherData;
import ImplInterfaceBuildinObservable.CurrentConditionsDisplayBuildinObserver;
import ImplInterfaceBuildinObservable.WeatherDataObservable;

/**
 * @author alex_jd
 *
 */
public class WeatherStationBildinObservable {
	
public static void main(String[] args) {
		
	WeatherDataObservable weatherDataObservable = new WeatherDataObservable();
		
	CurrentConditionsDisplayBuildinObserver currentConditionsDisplayBuildinObserver = 
			new CurrentConditionsDisplayBuildinObserver(weatherDataObservable);
		
	weatherDataObservable.setMeasurements(80, 65, 30.4f);
	weatherDataObservable.setMeasurements(82, 70, 29.2f);
	weatherDataObservable.setMeasurements(78, 90, 29.2f);
	
	currentConditionsDisplayBuildinObserver.renewData();

	}

}
