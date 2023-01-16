package designpattern.observer.jdkobserver;

import designpattern.observer.weatherstation.DisplayElement;
import designpattern.observer.weatherstation.Subject;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private float temperature;

	private float humidity;

	private float pressure;

	private Observable observable;

	// 保存subject 的引用是为了注销时用到，刚创建对象就注册到主题上
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	@Override
	public void display(float humidity, float pressure, float temperature) {
		System.out.println("humidity is : " + humidity + "; pressure is : " + pressure + "; temperature is : " + temperature);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.humidity = weatherData.getHumidity();
			this.temperature = weatherData.getTemperature();
			this.pressure = weatherData.getPressure();
			display(humidity, pressure, temperature);
		}

	}
}
