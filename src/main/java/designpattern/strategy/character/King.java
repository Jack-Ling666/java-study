package designpattern.strategy.character;

import designpattern.strategy.character.behavior.SwordBehavior;

public class King extends Character{
	public King(){
		this.weaponBehavior = new SwordBehavior();
	}

	@Override
	public void fight() {
		System.out.println("king fight by sword");

	}
}
