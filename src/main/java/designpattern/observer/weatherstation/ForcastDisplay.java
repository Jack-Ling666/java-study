package designpattern.observer.weatherstation;

public class ForcastDisplay implements Observer, DisplayElement{

	@Override
	public void display(float humidity, float presure, float temperature) {

	}

	@Override
	public void update(float humidity, float presure, float temperature) {
		System.out.println("ForcastDisplay is notified by subject");


	}
}
