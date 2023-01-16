package designpattern.strategy.duck.behavior;

public class QuackSqueak implements QuackBehavor{
	@Override
	public void quack() {
		System.out.println("this duck quack squeak");
	}
}
