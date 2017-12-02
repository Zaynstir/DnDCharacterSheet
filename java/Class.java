/**
 * Used to store the different Classes
 * @author Zayin Brunson, Weston Chan, Matt Link, Gabriel Maddex
 * @version CIS200Final
 */

import java.util.ArrayList;

public class Class{
	final private String name;
	final private int health;
	final private String[] prof;
	final private String[] SV;
	final private Feat[] feats;
	final private ArrayList<String> equipment;
	final private String skillProf;
	private int lvl;

	/**
	 * Class() 8-arg constructor
	 * @param n: name of the class
	 * @param h: starting health at level 1
	 * @param f: array of Feat objects
	 * @param l: character class level
	 * @param p: proficiencies
	 * @param sv: saving throws
	 * @param e: equipment
	 * @param sp: skill proficiencies
	 */
	public Class(String n, int h, Feat[] f, int l, String[] p, String[] sv, ArrayList<String> e, String sp) {
		name = n;
		health = h;
		feats = f;
		prof = p;
		SV = sv;
		equipment = e;
		skillProf = sp;
		lvl = l;
	}

  /**
	 * getName
	 * @return name: name of the class
	 */
	public String getName() {
		return name;
	}

	/**
	 * Health provided by Class
	 * @return User's health provided my class
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * Class's Proficiencies
	 * @return Class's provided proficiencies
	 */
	public String[] getProf() {
		return prof;
	}

	/**
	 * Class's Saving Throws
	 * @return Class's provided saving throws
	 */
	public String[] getSV() {
		return SV;
	}

	/**
	 * a class's provided abilities
	 * @return feats: array of abilties
	 */
	public Feat[] getFeat() {
		return feats;
	}

	/**
	 * get a Class's provided ability
	 * @param index: index of feat to be returned
	 * @return Feat object at provided index
	 */
	public Feat getFeat(int index) {
		return feats[index];
	}

	/**
	 * Class's skill proficiencies
	 * @return Class's provided skill proficiencies
	 */
	public String getSkillProf() {
		return skillProf;
	}


}
