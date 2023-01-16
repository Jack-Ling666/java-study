package designpattern.strategy.duck.behavior;

public class QuackDuckCall implements QuackBehavor{
	@Override
	public void quack() {
		System.out.println("this duck quack by duckcall");
	}
}
