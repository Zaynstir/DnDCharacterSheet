/**
 * Used to store the different Armor Sets.
 * @author Zayin Brunson, Weston Chan, Matt Link, Gabriel Maddex
 * @version CIS200Final
 */

public class Armor extends Item{

	final private char type;
	final private int AC;
	final private int maxDex;
  
	/**
	 * Armor() 6-arg constructor
	 * @param n: name of the armor item
	 * @param desc: description of the armor item
	 * @param p:
	 * @param t: array of types that are encompassed by this armor item
	 * @param ac: the "armor class" of this item, basically hitpoints gained from it
	 * @param max: the max dexterity needed for this armor item
	 */
	public Armor(String n, String desc, char t, int ac, int m) {

		super(n, desc);
		type = t;
		AC = ac;
		maxDex = m;
	}

	/**
	 * getType
	 * @return type: the damage type of the weapon
	 */
	public char getType() {
		return type;
	}
  
	/**
	 * getMaxDex
	 * @return maxDex: maximum amount of Dexterity that the wearer can use
	 */
	public int getMaxDex() {
		return maxDex;
	}

	/**
	 * getAC()
	 * @return AC: armore class
	 */
	public int getAC() {
		return AC;
	}
}
