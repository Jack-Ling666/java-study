package designpattern.observer.jdkobserver;


import java.util.Observable;
import java.util.Observer;

public class GenericDisplay implements Observer, DisplayElement {

	@Override
	public void display(float humidity, float presure, float temperature) {

	}

	@Override
	public void update(Observable o, Object arg) {

	}
}
