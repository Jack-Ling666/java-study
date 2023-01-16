package designpattern.strategy.character.behavior;

public class FireBehavior implements WeaponBehavior{
	@Override
	public void useWeapon() {
		System.out.println("use weapon by fire");
	}
}
