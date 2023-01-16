package designpattern.strategy.character.behavior;

public class KnifeBehavior implements WeaponBehavior{
	@Override
	public void useWeapon() {
		System.out.println("use weapon by knife");
	}
}
