/**
 * Armor.java
 * Used for defining Armor type Item objects
 */
public class Armor extends Item{
	final char[] types;
	final int AC;
	final int maxDex;

	/**
	 * Armor() 6-arg constructor
	 * @param n: name of the armor item
	 * @param desc: description of the armor item
	 * @param p:
	 * @param t: array of types that are encompassed by this armor item
	 * @param ac: the "armor class" of this item, basically hitpoints gained from it
	 * @param max: the max dexterity needed for this armor item
	 */
	public Armor(String n, String desc, char[] p, char[] t, int ac, int max) {
		super(n, desc);
		types = t;
		AC = ac;
		maxDex = max;
	}

	/**
	 * getTypes
	 * @return types: array of types that this item falls under
	 */
	public char[] getTypes() {
		return types;
	}

	/**
	 * getTypes
	 * @param index: index of the type you want
	 * @return types[index]
	 */
	public char getTypes(int index) {
		return types[index];
	}

	/**
	 * getAC()
	 * @return AC: armore class
	 */
	public int getAC() {
		return AC;
	}

	/**
	 * getMaxDex
	 * @return maxDex: maximum dexterity needed for this armor item
	 */
	public int getMaxDex() {
		return maxDex;
	}

}
