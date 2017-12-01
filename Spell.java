/**
 * Spell.java
 * Used to define Spell objects that can be used by the character
 */
public class Spell {
	final private String name;
	final private int lvl;
	final private String action;
	final private String range;
	final private String[] components;
	final private String duration;
	final private String[] spellList;
	
	/**
	 * Sets variables that are passed in
	 * @param n Spell's name
	 * @param l Spell's lvl
	 * @param a What it takes to prep a spell
	 * @param r Spell's range
	 * @param c Spell's components
	 * @param d Spell's Duration
	 * @param s What list it is a part of.
	 */
	public Spell(String n, int l, String a, String r, String[] c, String d, String[] s) {
		name = n;
		lvl = l;
		action = a;
		range = r;
		components = c;
		duration = d;
		spellList = s;
	}

	/**
	 * getName
	 * @return name: the name of the spell
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * getLvl
	 * @return lvl: the level required to use this spell
	 */
	public int getLvl() {
		return lvl;
	}
	
	/**
	 * getAction
	 * @return action: what the spell does
	 */
	public String getAction() {
		return action;
	}

	/**
	 * getRange
	 * @return range: how many board units this spell is allowed to reach
	 */
	public String getRange() {
		return range;
	}
	
	/**
	 * getDuration
	 * @return duration: the duration of the spell, how many turns it lasts
	 */
	public String getDuration() {
		return duration;
	}
	
	/**
	 * getComponents()
	 * @return components: the items needed to make the spell.
	 */
	public String[] getComponents() {
		return components;
	}

	/**
	 * getSpellList()
	 * @return spellList: What spell list they are from
	 */
	public String[] getSpellList() {
		return spellList;
	}
}
