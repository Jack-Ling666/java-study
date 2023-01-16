package designpattern.strategy.character;

import designpattern.strategy.character.behavior.WeaponBehavior;

public abstract class Character {
	public WeaponBehavior weaponBehavior;

	public abstract void fight();

	public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}

	public void performFight() {
		weaponBehavior.useWeapon();
	}

//	public abstract void display();

}
