package designpattern.strategy.duck.behavior;

public class QuackGua implements QuackBehavor{
	@Override
	public void quack() {
		System.out.println("this duck quack zhizhi");
	}
}
