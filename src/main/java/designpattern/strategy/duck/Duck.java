package designpattern.strategy.duck;

import designpattern.strategy.duck.behavior.FlyBehavior;
import designpattern.strategy.duck.behavior.QuackBehavor;

/**
 * 一个抽象类+一个接口+多个实现类（行为模式，也可以理解为算法族）+ 多个继承类（不同duck）
 */
public abstract class Duck {
	// 抽象类Duck，拥有两种行为模式：quack+fly
	FlyBehavior flyBehavior;
	QuackBehavor quackBehavor;
	public Duck() {}

	public abstract void display();

	// 构建set方法可以动态修改具体的行为模式
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavor(QuackBehavor quackBehavor) {
		this.quackBehavor = quackBehavor;
	}

	public void performFly() {
		flyBehavior.fly();
	}

	// 通过封装表现模式来避免直接调用抽象类方法
	public void performQuack() {
		quackBehavor.quack();
	}

	// 填写一些共性的行为模式，duck all can swim
	public void swim() {
		System.out.println("all duck can fly");
	}
}
