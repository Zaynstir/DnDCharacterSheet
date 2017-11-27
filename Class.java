
public class Class {
	final private int strMod;
	final private int dexMod;
	final private int conMod;
	final private int intMod;
	final private int wisMod;
	final private int chaMod;
	final private Feat[] feats;
	final private int lvl;
	
	public Class(int s, int d, int c, int i, int w, int ch, Feat f, int l) {
		strMod = s;
		dexMod = d;
		conMod = c;
		intMod = i;
		wisMod = w;
		chaMod = ch;
		feats[] = f;
		lvl = l;
	}
	
	public int getStrMod() {
		return strMod;
	}
	
	public int getDexMod() {
		return dexMod;
	}
	
	public int getConMod() {
		return conMod;
	}
	
	public int getIntMod() {
		return intMod;
	}
	
	public int getWisMod() {
		return wisMod;
	}
	
	public int getChaMod() {
		return chaMod;
	}
	
	public Feat[] getFeat() {
		return feats;
	}
	
	public Feat getFeat(int index) {
		return feats[index];
	}
	
	public void setLevel(int l){
		lvl = l;
	}
}
