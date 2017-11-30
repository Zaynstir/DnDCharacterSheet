/**
 * Weapon.java
 * Used for defining Weapon type Item objects to be used by D&D characters
 */
public class Weapon extends Item{
	private static char attackType;
	private String[] weaponType;
	final private String damage;
	/**
	 * Weapon() 5-arg constructor
	 * @param n: name of Weapon Item
	 * @param at: the type of damage of the weapon
	 * @param wt: the types of the weapon
	 * @param d: damage the weapon does
	 */
	public Weapon(String n, char at, String[] wt, String d) {
		super(n, "");
		weaponType = wt;
		attackType = at;
		damage = d;
	}
	public char attackType() {
		return attackType;
	}
	
	public String[] getWeaponType() {
		return weaponType;
	}
	
	public String getWeaponType(int index) {
		return weaponType[index];
	}

	/**
	 * getDamage
	 * @return damage: how much damage this weapon can do
	 */
	public int getDamage() {
		return damage;
	}
}
