/**
 * Class.java
 * Used for defining the Class of a D&D character
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
	 * @param s: strength modifier
	 * @param d: dexterity modifier
	 * @param c: constituion modifier
	 * @param i: intelligence modifier
	 * @param w: wisdom modifier
	 * @param ch: charisma modifier
	 * @param f: array of Feat objects
	 * @param l: character class level
	 * @param p: proficiencies
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
	 * getFeat
	 * @return feats: array of Feat objects
	 */
	public Feat[] getFeat() {
		return feats;
	}

	/**
	 * getFeat
	 * @param index: index of feat to be returned
	 * @return Feat object at provided index
	 */
	public Feat getFeat(int index) {
		return feats[index];
	}

	/**
	 * setLevel - this method sets the level variable
	 */
	public void setLevel(int l){
		lvl = l;
	}
	
	public int getHealth() {
		return health;
	}
}
