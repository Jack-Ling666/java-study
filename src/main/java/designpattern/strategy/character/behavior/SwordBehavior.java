package designpattern.strategy.character.behavior;

public class SwordBehavior implements WeaponBehavior{
	@Override
	public void useWeapon() {
		System.out.println("use weapon by sword");
	}
}
