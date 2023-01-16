package designpattern.strategy.duck;

import designpattern.strategy.duck.behavior.FlyNoWay;
import designpattern.strategy.duck.behavior.QuackMute;

public class ModelDuck extends Duck{
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavor = new QuackMute();
	}

	@Override
	public void display() {
		System.out.println("this is a Model Duck");
	}
}
