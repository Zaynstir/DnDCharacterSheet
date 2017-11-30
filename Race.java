/**
 * Race.java
 * Used for defining the attributes that a characters Race adds to their stats
 */
public class Race {
	final private String name;
	final private int strMod;
	final private int dexMod;
	final private int conMod;
	final private int intMod;
	final private int wisMod;
	final private int chaMod;
	final private int speed;
	final private String[] languages;
	final private Race[] subRace;
	final private Feat[] feats;
	/**
	 * Race() 7-arg constructor
   * @param n: name of the race
	 * @param s: strength modifier
	 * @param d: dexterity modifier
	 * @param c: constituion modifier
	 * @param i: intelligence modifier
	 * @param w: wisdom modifier
	 * @param ch: charisma modifier
   * @param f: array of Feat objects
	 * @param sr: subraces of this race
   * @param spe: natural speed of this race
   * @param l: languages the race naturally speaks
	 */
	public Race(String n, int s, int d, int c, int i, int w, int ch, Feat[] f, Race[] sr, int spe, String[] l) {
		name = n;
    strMod = s;
		dexMod = d;
		conMod = c;
		intMod = i;
		wisMod = w;
		chaMod = ch;
		feats = f;
    subRace = sr;
		speed = spe;
		languages = l;
}
	/**
  * getName
  * @return name: the name of the race
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
	 * @param index: index of feat that you want
	 * @return feats[index]
	 */
	public Feat getFeat(int index) {
		return feats[index];
	}
	 public int getSpeed() {
		 return speed;
	 }
	 
	 public Race getSubRace() {
		 return subRace;
	 }
	 public String[] getLanguage() {
		 return languages;
	 }
}
