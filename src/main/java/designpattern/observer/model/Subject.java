package designpattern.observer.model;

public interface Subject {
	void registerObserver();

	void removeObserver();

	void notifyObserver();
}
