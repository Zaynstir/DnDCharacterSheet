/**
 * Used to store the different Races
 * @author Zayin Brunson, Weston Chan, Matt Link, Gabriel Maddex
 * @version CIS200Final
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
	 * Strength Modifier
	 * @return strMod: strength modifier
	 */
	public int getStrMod() {
		return strMod;
	}

	/**
	 * Dexterity Modifier
	 * @return dexMod: dexterity modifier
	 */
	public int getDexMod() {
		return dexMod;
	}

	/**
	 * Constitution Modifier
	 * @return conMod: constituion modifier
	 */
	public int getConMod() {
		return conMod;
	}

	/**
	 * Intelligence Modifier
	 * @return intMod: intelligence modifier
	 */
	public int getIntMod() {
		return intMod;
	}

	/**
	 * Wisdom Modifier
	 * @return wisMod: wisdom modifier
	 */
	public int getWisMod() {
		return wisMod;
	}

	/**
	 * Charisma Modifier
	 * @return chaMod: charisma modifier
	 */
	public int getChaMod() {
		return chaMod;
	}

	/**
	 * All abilities of the Race
	 * @return feats: array of Feat objects
	 */
	public Feat[] getFeat() {
		return feats;
	}

	/**
	 * Certain ability of the Race
	 * @param index: index of feat that you want
	 * @return feats[index]: The feat at a certain index
	 */
	public Feat getFeat(int index) {
		return feats[index];
	}
	
	/**
	 * Race's Walking Speed
	 * @return speed: The Race's walking speed
	 */
	public int getSpeed() {
		return speed;
	}
	
	/**
	 * Return Race's Subraces
	 * @return subRace: The Race's Subraces
	 */
	public Race[] getSubRace() {
		return subRace;
	}
	
	/**
	 * Return Race's Languages
	 * @return languages: Race's languages
	 */
	public String[] getLanguage() {
		return languages;
	}
}
