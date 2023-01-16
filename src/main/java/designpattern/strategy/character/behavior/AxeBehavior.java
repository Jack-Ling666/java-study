package designpattern.strategy.character.behavior;

public class AxeBehavior implements WeaponBehavior{
	@Override
	public void useWeapon() {
		System.out.println("use weapon by axe");
	}
}
