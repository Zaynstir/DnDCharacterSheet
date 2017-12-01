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
	
	public int getHealth() {
		return health;
	}
	
	public String[] getProf() {
		return prof;
	}
	
	public String[] getSV() {
		return SV;
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
	
	public String getSkillProf() {
		return skillProf;
	}

	/**
	 * setLevel - this method sets the level variable
	 */
	public void setLevel(int l){
		lvl = l;
	}
	
	
}
