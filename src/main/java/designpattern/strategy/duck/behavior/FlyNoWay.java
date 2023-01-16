package designpattern.strategy.duck.behavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("this duck can not fly");
	}
}
