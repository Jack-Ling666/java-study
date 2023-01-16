package designpattern.strategy.duck.behavior;

public class QuackMute implements QuackBehavor{
	@Override
	public void quack() {
		System.out.println("this duck can not quack");
	}
}
