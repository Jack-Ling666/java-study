package designpattern.observer.weatherstation;

public class StatisticsDisplay implements Observer, DisplayElement{


	@Override
	public void display(float humidity, float presure, float temperature) {

	}

	@Override
	public void update(float humidity, float presure, float temperature) {
		System.out.println("StatisticsDisplay is notified by subject");


	}
}
