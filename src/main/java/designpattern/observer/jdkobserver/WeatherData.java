package designpattern.observer.jdkobserver;

import java.util.Observable;

public class WeatherData extends Observable {
	float temperature;
	float humidity;
	float pressure;

	public WeatherData(){}

	public void measurementChanged(){
		setChanged();
		// 没带参数是观察者自己拉数据，notifyObservers(Object arg)带参数是主题推数据给观察者，一个主动一个被动
		notifyObservers();
	}

	public void setMeasurement(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		measurementChanged();
	}

	public float getTemperature() {
		return this.temperature;
	}

	public float getHumidity() {
		return this.humidity;
	}

	public float getPressure() {
		return this.pressure;
	}
}
