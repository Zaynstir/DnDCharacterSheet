import java.util.ArrayList;

public class CharacterSheet {

	private String name;
	private Race race;
	private Background background;
	private Class[] classes;
	private Spell[] spells;
	private Feat[] feats;
	private ArrayList<Item> items;
	private int maxHealth;
	private int exp;
	private int lvl;
	private int str;
	private int dex;
	private int con;
	private int intelligence;
	private int wis;
	private int cha;

	public CharacterSheet(String n, Race r, Class[] c, Spell[] s, Feat[] f, ArrayList<Item> i, int exp, int l, int str, int dex, int con, int inte, int wis, int cha, int max) {
		name = n;
		race = r;
		classes = c;
		spells = s;
		feats = f;
		items = i;
		this.exp = exp;
		lvl = l;
		this.str = str;
		this.dex = dex;
		this.con = con;
		intelligence = inte;
		this.wis = wis;
		this.cha = cha;
		maxHealth = max;
	}

	public CharacterSheet(String n, Race r, Class[] c, Spell[] s, Feat[] f, ArrayList<Item> i, int max) {
		name = n;
		race = r;
		classes = c;
		spells = s;
		feats = f;
		items = i;
		exp = 0;
		lvl = 1;
		Dice d = new Dice();
		str = d.roll("3d6") + race.getStrMod() + classes[0].getStrMod();
		dex = d.roll("3d6") + race.getDexMod() + classes[0].getDexMod();
		con = d.roll("3d6") + race.getConMod() + classes[0].getConMod();
		intelligence = d.roll("3d6") + race.getIntMod() + classes[0].getIntMod();
		wis = d.roll("3d6") + race.getWisMod() + classes[0].getWisMod();
		cha = d.roll("3d6") + race.getChaMod() + classes[0].getChaMod();
		maxHealth = max;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race r) {
		race = r;
	}

	public Background getBackground() {
		return background;
	}

	public void setBackground(Background b) {
		background = b;
	}

	public Class[] getClasses() {
		return classes;
	}

	public void setClasses(Class[] c) {
		classes = c;
	}

	public Feat[] getFeat() {
		return feats;
	}

	public void setFeat(Feat[] f) {
		feats = f;
	}

	public ArrayList<Item> getItems(){
		return items;
	}

	public void setItems(ArrayList<Item> i) {
		items = i;
	}

	public void addItem(Item i) {
		items.add(i);
	}

	public void removeItem(Item i) {
		for(int k = 0; k < items.size(); k++) {
			if(items.get(k).getName() == i.getName()) {
				items.remove(k);
				break;
			}
		}
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int e) {
		exp = e;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int l) {
		lvl = l;
	}

}
