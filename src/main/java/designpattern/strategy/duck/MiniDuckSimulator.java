package designpattern.strategy.duck;

import designpattern.strategy.duck.behavior.FlyRocketPower;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallordDuck = new MallordDuck();
		mallordDuck.performFly();
		mallordDuck.performQuack();

		Duck modeleDuck = new ModelDuck();
		modeleDuck.setFlyBehavior(new FlyRocketPower());
		modeleDuck.performQuack();
		modeleDuck.performFly();


	}
}
