package designpattern.strategy.duck;

import designpattern.strategy.duck.behavior.FlyWithWing;
import designpattern.strategy.duck.behavior.QuackGua;

public class MallordDuck extends Duck{
	public MallordDuck() {
		this.flyBehavior = new FlyWithWing();
		this.quackBehavor = new QuackGua();
	}
	public void display() {
		System.out.println("this is a Mallord duck");
	}
}
