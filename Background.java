/**
 * Background.java
 * Used for defining the Background of a chracater and what stats come with that background
 */
public class Background {
	final private int strMod;
	final private int dexMod;
	final private int conMod;
	final private int intMod;
	final private int wisMod;
	final private int chaMod;
	final private Feat[] feats;

	/**
	 * Race() 7-arg constructor
	 * @param s: strength modifier
	 * @param d: dexterity modifier
	 * @param c: constituion modifier
	 * @param i: intelligence modifier
	 * @param w: wisdom modifier
	 * @param ch: charisma modifier
	 * @param f: array of Feat objects
	 */
	public Background(int s, int d, int c, int i, int w, int ch, Feat[] f) {
		strMod = s;
		dexMod = d;
		conMod = c;
		intMod = i;
		wisMod = w;
		chaMod = ch;
		feats = f;
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
}
