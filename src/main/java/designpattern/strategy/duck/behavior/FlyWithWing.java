package designpattern.strategy.duck.behavior;

public class FlyWithWing implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("this duck is flying with wing");
	}
}
