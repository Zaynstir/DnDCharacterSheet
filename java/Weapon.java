/**
 * Used to store the different Weapons.
 * @author Zayin Brunson, Weston Chan, Matt Link, Gabriel Maddex
 * @version CIS200Final
 */

public class Weapon extends Item{
	final private char attackType;
	final private String[] weaponType;
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
	
	/**
	 * How it attacks
	 * @return Char associated to with how the weapon attacks
	 */
	public char getAttackType() {
		return attackType;
	}
	
	/**
	 * What type of weapon it is
	 * @return Every type associated with the weapon
	 */
	public String[] getWeaponType() {
		return weaponType;
	}
	
	/**
	 * What type of weapon it is
	 * @param index: To find a specific weapon
	 * @return Every type associated with the weapon
	 */ 
	String getWeaponType(int index) {
		return weaponType[index];
	}

	/**
	 * getDamage
	 * @return damage: how much damage this weapon can do
	 */
	public String getDamage() {
		return damage;
	}
}
