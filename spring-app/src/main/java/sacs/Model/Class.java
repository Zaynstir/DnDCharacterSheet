/**
 * Class.java
 * Used for defining the Class of a D&D character
 */
import java.util.ArrayList;

public class Class{
	final private String name;
	final private int strMod;
	final private int dexMod;
	final private int conMod;
	final private int intMod;
	final private int wisMod;
	final private int chaMod;
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
	public Class(String n, int s, int d, int c, int i, int w, int ch, Feat[] f, int l, String[] p, String[] sv, ArrayList<String> e, String sp) {
		name = n;
		strMod = s;
		dexMod = d;
		conMod = c;
		intMod = i;
		wisMod = w;
		chaMod = ch;
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
	 * getStrMod
	 * @return strMod: strength modifier
	 */
	public int getStrMod() {
		return strMod;
	}

	/**
	 * getDexMod
	 * @return dexMod: dexterity modifier
	 */
	public int getDexMod() {
		return dexMod;
	}

	/**
	 * getConMod
	 * @return conMod: constituion modifier
	 */
	public int getConMod() {
		return conMod;
	}

	/**
	 * getIntMod
	 * @return intMod: intelligence modifier
	 */
	public int getIntMod() {
		return intMod;
	}

	/**
	 * getWisMod
	 * @return wisMod: wisdom modifier
	 */
	public int getWisMod() {
		return wisMod;
	}

	/**
	 * getChaMod
	 * @return chaMod: charisma modifier
	 */
	public int getChaMod() {
		return chaMod;
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
}
