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
	private ArrayList<String> equipment = new ArrayList<String>();
	//final private ArrayList<Item> equipment;
	final private String skillProf;
	private int lvl;
	
	public Class(String n, int s, int d, int c, int i, int w, int ch, int l, String[] p, String[] sv, ArrayList<String> e, String sp) {
		name = n;
		strMod = s;
		dexMod = d;
		conMod = c;
		intMod = i;
		wisMod = w;
		chaMod = ch;
		prof = p;
		SV = sv;
		equipment = e;
		skillProf = sp;
		lvl = l;
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
	
	public void setLevel(int l){
		lvl = l;
	}
}
