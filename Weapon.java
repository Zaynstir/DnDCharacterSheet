/**
 * Weapon.java
 * Used for defining Weapon type Item objects to be used by D&D characters
 */
public class Weapon extends Item{
	final private int damage;
	final private boolean simple;
	final private boolean melee;

	/**
	 * Weapon() 5-arg constructor
	 * @param n: name of Weapon Item
	 * @param p:
	 * @param d: damage that this Weapon can do
	 * @param s: boolean if this is a simple weapon
	 * @param m: boolean if this is a melee weapon
	 */
	public Weapon(String n, char[] p, int d, boolean s, boolean m) {
		super(n, "");
		damage = d;
		simple = s;
		melee = m;
	}

	/**
	 * getDamage
	 * @return damage: how much damage this weapon can do
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * isSimple
	 * @return simple: boolean if this is a simple object or not
	 */
	public boolean isSimple() {
		return simple;
	}

	/**
	 * isMelee
	 * @return melee: boolean if this is a melee object or not
	 */
	public boolean isMelee() {
		return melee;
	}
}
