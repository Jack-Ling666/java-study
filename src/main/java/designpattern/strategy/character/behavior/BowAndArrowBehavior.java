package designpattern.strategy.character.behavior;

public class BowAndArrowBehavior implements WeaponBehavior{
	@Override
	public void useWeapon() {
		System.out.println("use weapon by bow and arrow");
	}
}
