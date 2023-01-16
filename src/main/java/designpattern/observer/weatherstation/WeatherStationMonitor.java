package designpattern.observer.weatherstation;

public class WeatherStationMonitor {
	public static void main(String[] args) {
		WeatherDataSubject weatherDataSubject = new WeatherDataSubject();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherDataSubject);
		weatherDataSubject.setMeasurement(20f, 30f, 40f);
		weatherDataSubject.setMeasurement(30f, 40f, 50f);
		weatherDataSubject.setMeasurement(40f, 50f, 60f);
	}
}
