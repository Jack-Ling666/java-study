package designpattern.observer.jdkobserver;

import java.util.Observable;
import java.util.Observer;

public class ForcastDisplay implements Observer, DisplayElement {
	private Observable observable;

	public ForcastDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display(float humidity, float presure, float temperature) {

	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
		}
	}
}
