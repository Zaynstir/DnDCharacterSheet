import java.util.ArrayList;

public class CharacterSheet {

	private String name;
	private Race race;
	private Background background;
	private Class[] classes;
	private Spell[] spells;
	private Feat[] feats;
	private ArrayList<Item> items;
	private int exp;
	private int lvl;
	private int str;
	private int dex;
	private int con;
	private int intelligence;
	private int wis;
	private int cha;
	
	public CharacterSheet() {
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
		item.add(i);
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
