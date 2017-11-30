
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
	
	public Race(String n, int s, int d, int c, int i, int w, int ch, Feat[] f, Race[] sr, int spe, String[] l) {
		name = n;
		strMod = s;
		dexMod = d;
		conMod = c;
		intMod = i;
		wisMod = w;
		chaMod = ch;
		feats = f;
		speed = spe;
		subRace = sr;
		languages = l;
	}
	
	public String getName() {
		return name;
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
