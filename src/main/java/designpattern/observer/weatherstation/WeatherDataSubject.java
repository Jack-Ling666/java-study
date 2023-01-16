package designpattern.observer.weatherstation;

import java.util.ArrayList;
import java.util.List;

public class WeatherDataSubject implements Subject{

	List<Observer> observerList = new ArrayList<>();

	float temperature;
	float humidity;
	float pressure;

	public float getTemperature() {
		return this.temperature;
	}

	public float getHumidity() {
		return this.humidity;
	}

	public float getPressure() {
		return this.pressure;
	}

	public void measurementsChanged() {
		notifyObserver();
	}

	public void setMeasurement(float humidity, float pressure, float temperature) {
		this.humidity = humidity;
		this.pressure = pressure;
		this.temperature = temperature;
		measurementsChanged();
	}

	@Override
	public void registerObserver(Observer observer) {
		observerList.add(observer);
		System.out.println("this observer is added to subject");
	}

	@Override
	public void removeObserver(Observer observer) {
		int i = observerList.indexOf(observer);
		if (i > -1) {
			observerList.remove(i);
			System.out.println("this observer is removed to subject");
		}
	}

	@Override
	public void notifyObserver() {
		for(Observer observer : observerList) {
			observer.update(humidity, pressure, temperature);
		}
	}
}
