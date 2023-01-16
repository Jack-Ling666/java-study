package designpattern.strategy.character;

import designpattern.strategy.character.behavior.AxeBehavior;

public class WeaponMonitor {
	public static void main(String[] args) {
		Character king = new King();
		king.setWeaponBehavior(new AxeBehavior());
		king.performFight();
	}
}
