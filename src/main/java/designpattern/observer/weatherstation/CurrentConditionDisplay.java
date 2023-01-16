package designpattern.observer.weatherstation;

public class CurrentConditionDisplay implements Observer, DisplayElement{

	private float temperature;

	private float humidity;

	private float pressure;

	private Subject weatherData;

	// 保存subject 的引用是为了注销时用到，刚创建对象就注册到主题上
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void display(float humidity, float pressure, float temperature) {
		System.out.println("humidity is : " + humidity + "; pressure is : " + pressure + "; temperature is : " + temperature);
	}

	@Override
	public void update(float humidity, float pressure, float temperature) {
		System.out.println("CurrentConditionDisplay is notified by subject");
		this.humidity = humidity;
		this.pressure = pressure;
		this.temperature = temperature;
		display(humidity, pressure, temperature);
	}
}
