package designpattern.strategy.duck.behavior;

public class FlyRocketPower implements FlyBehavior{
	@Override
	public void fly() {
		System.out.println("fly by rocket power energy");
	}
}
