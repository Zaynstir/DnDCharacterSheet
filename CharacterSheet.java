/**
 * Represents a Character sheet by having the fields required to make a character sheet
 * @author Zayin Brunson, Weston Chan, Matthew Link, Gabriel Maddex
 * @version CIS 200 Final
 */
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

	/**
	 * Constructs a new Character Sheet
	 * @param n Name of the character
	 * @param r The race of the character
	 * @param c The class of the character
	 * @param s The spells that the character can use
	 * @param f The feats that the character can use
	 * @param i The items that the character have
	 * @param exp The amount of experience the character has
	 * @param l The current level of the character
	 * @param str The Strength modifier of the character
	 * @param dex The Dexterity modifier of the character
	 * @param con The Constitution modifier of the character
	 * @param inte The Intelligence modifier of the character
	 * @param wis The Wisdom modifier of the character
	 * @param cha The Charisma modifier of the character
	 * @param max The maximum health the character has
	 */
	public CharacterSheet(String n, Race r, Background b, Class[] c, Spell[] s, Feat[] f, ArrayList<Item> i, int exp, int l, int str, int dex, int con, int inte, int wis, int cha, int max) {
		name = n;
		race = r;
		background = b;
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
		maxHealth = classes[0].getHealth();
	}

	/**
	 * Constructs a character sheet but rolls for ability modifiers for the user
	 * @param n Name of the character
	 * @param r Race of the character
	 * @param c Class of the character
	 * @param s Spells that the character can use
	 * @param f Feats that the character has
	 * @param i Items that the character has
	 */
	public CharacterSheet(String n, Race r, Class[] c, Spell[] s, Feat[] f, ArrayList<Item> i, Background bg) {
		name = n;
		race = r;
		background = bg;
		classes = c;
		spells = s;
		feats = new Feat[race.getFeat().length + background.getFeatures().length + 
		                 classes[0].getFeat().length + feats.length];
		int index = 0;
		for(int j = 0; j < race.getFeat().length; j++, index++)
			feats[index] = race.getFeat()[j];
		for(int j = 0; j < background.getFeatures().length; j++, index++)
			feats[index] = background.getFeatures()[j];
		for(int j = 0; j < classes[0].getFeat().length; j++, index++)
			feats[index] = classes[0].getFeat()[j];
		for(int j = 0; j < feats.length; j++, index++)
			feats[index] = feats[j];
		items = i;
		exp = 0;
		lvl = 1;
		Dice d = new Dice();
		str = d.roll("3d6") + race.getStrMod();
		dex = d.roll("3d6") + race.getDexMod();
		con = d.roll("3d6") + race.getConMod();
		intelligence = d.roll("3d6") + race.getIntMod();
		wis = d.roll("3d6") + race.getWisMod();
		cha = d.roll("3d6") + race.getChaMod();
		maxHealth = classes[0].getHealth() + con;
	}

	/**
	 * Returns the name of the character
	 * @return The name of the character
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the character
	 * @param n The name of the character
	 */
	public void setName(String n) {
		name = n;
	}

	/**
	 * Returns the race of the character
	 * @return The race of the character
	 */
	public Race getRace() {
		return race;
	}

	/**
	 * Sets the race of the character
	 * @param r The race of the character
	 */
	public void setRace(Race r) {
		race = r;
	}

	/**
	 * Returns the background of the character
	 * @return The background of the character
	 */
	public Background getBackground() {
		return background;
	}

	/**
	 * Sets the background of the character
	 * @param b The background of the character
	 */
	public void setBackground(Background b) {
		background = b;
	}

	/**
	 * Returns the class of the character
	 * @return The class of the character
	 */
	public Class[] getClasses() {
		return classes;
	}

	/**
	 * Sets the class of the character
	 * @param c The class of the character
	 */
	public void setClasses(Class[] c) {
		classes = c;
	}

	/**
	 * Returns the spells the character can cast
	 * @return The spells the character can cast
	 */
	public Spell[] getSpells() {
		return spells;
	}

	/**
	 * Returns the spells the character can cast
	 * @param s The spells the character can cast
	 */
	public void setSpells(Spell[] s) {
		spells = s;
	}

	/**
	 * Returns the feats the character has
	 * @return The feats the character has
	 */
	public Feat[] getFeats() {
		return feats;
	}

	/**
	 * Sets the feats the character has
	 * @param f The feats the character has
	 */
	public void setFeats(Feat[] f) {
		feats = f;
	}

	/**
	 * Returns the items the character has
	 * @return The items the character has
	 */
	public ArrayList<Item> getItems(){
		return items;
	}

	/**
	 * Sets the items the character has
	 * @param i The items the character has
	 */
	public void setItems(ArrayList<Item> i) {
		items = i;
	}

	/**
	 * Adds an additional item the character has
	 * @param i the new item the character has
	 */
	public void addItem(Item i) {
		items.add(i);
	}

	/**
	 * Removes an item the character has
	 * @param i An item the character has
	 */
	public void removeItem(Item i) {
		for(int k = 0; k < items.size(); k++) {
			if(items.get(k).getName() == i.getName()) {
				items.remove(k);
				break;
			}
		}
	}

	/**
	 * Returns the amount of experience the character has
	 * @return The amount of experience the character has
	 */
	public int getExp() {
		return exp;
	}

	/**
	 * Sets the amount of experience the character has
	 * @param e The amount of experience the character has
	 */
	public void setExp(int e) {
		exp = e;
	}

	/**
	 * Returns the level of the character
	 * @return The level of the character
	 */
	public int getLvl() {
		return lvl;
	}

	/**
	 * Sets the level of the character
	 * @param l The level of the character
	 */
	public void setLvl(int l) {
		lvl = l;
	}

	/**
	 * Returns the strength modifier of the character
	 * @return The strength modifier of the character
	 */
	public int getStr() {
		return str;
	}

	/**
	 * Sets the strength modifier of the character
	 * @param str The strength modifier of the character
	 */
	public void setStr(int str) {
		this.str = str;
	}

	/**
	 * Returns the dexterity modifier of the character
	 * @return The dexterity modifier of the character
	 */
	public int getDex() {
		return dex;
	}

	/**
	 * Sets the dexterity modifier of the character
	 * @param dex The dexterity modifier of the character
	 */
	public void setDex(int dex) {
		this.dex = dex;
	}

	/**
	 * Returns the constitution modifier of the character
	 * @return The constitution modifier of the character
	 */
	public int getCon() {
		return con;
	}

	/**
	 * Sets the constitution modifier of the character
	 * @param con The constitution modifier of the character
	 */
	public void setCon(int con) {
		this.con = con;
	}

	/**
	 * Returns the intelligence modifier of the character
	 * @return The intelligence modifier of the character
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * Sets the intelligence modifier of the character
	 * @param intelligence The intelligence modifier of the character
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	/**
	 * Returns the wisdom modifier of the character
	 * @return The wisdom modifier of the character
	 */
	public int getWis() {
		return wis;
	}

	/**
	 * Sets the wisdom modifier of the character
	 * @param wis The wisdom modifier of the character
	 */
	public void setWis(int wis) {
		this.wis = wis;
	}

	/**
	 * Returns the charisma modifier of the character
	 * @return The charisma modifier of the character
	 */
	public int getCha() {
		return cha;
	}

	/**
	 * Sets the charisma modifier of the character
	 * @param cha The charisma modifier of the character
	 */
	public void setCha(int cha) {
		this.cha = cha;
	}

	/**
	 * Returns the maximum health of the character
	 * @return The maximum health of the character
	 */
	public int getMaxHealth() {
		return maxHealth;
	}
}
//
//
//import java.util.ArrayList;
//
//public class CharacterSheet {
//
//	private String name;
//	private Race race;
//	private Background background;
//	private Class[] classes;
//	private Spell[] spells;
//	private Feat[] feats;
//	private ArrayList<Item> items;
//	private int maxHealth;
//	private int exp;
//	private int lvl;
//	private int str;
//	private int dex;
//	private int con;
//	private int intelligence;
//	private int wis;
//	private int cha;
//
//	/**
//	 * CharacterSheet() 15-arg constructor
//	 * @param n: name of the CharacterSheet
//	 * @param r: Race object of the CharacterSheet
//	 * @param c: array of Class objects for the CharacterSheet
//	 * @param s: array of Spell objects to include
//	 * @param f: array of Feat objects to include
//	 * @param i: ArrayList of Item objects for the character
//	 * @param exp: amount of experience to start with
//	 * @param l: level to start with
//	 * @param str: amount of strenth to start with
//	 * @param dex: amount of dexterity to start with
//	 * @param con: amount of constituion to start with
//	 * @param inte: amount of intellegence to start with
//	 * @param wis: amount of wisdom to start with
//	 * @param cha: amount of charisma to start with
//	 * @param max: the max health that the character has to start with
//	 */
//	public CharacterSheet(String n, Race r, Class[] c, Spell[] s, Feat[] f, ArrayList<Item> i, int exp, int l, int str, int dex, int con, int inte, int wis, int cha, int max) {
//		name = n;
//		race = r;
//		classes = c;
//		spells = s;
//		feats = f;
//		items = i;
//		this.exp = exp;
//		lvl = l;
//		this.str = str;
//		this.dex = dex;
//		this.con = con;
//		intelligence = inte;
//		this.wis = wis;
//		this.cha = cha;
//		maxHealth = max;
//	}
//
//	/**
//	 * CharacterSheet() 7-arg constructor
//	 * @param n: name of the character
//	 * @param r: Race object for the character
//	 * @param c: array of Class objects that the CharacterSheet has
//	 * @param f: array of Feat objects that the user starts with
//	 * @param i: ArrayList of Item objects that the CharacterSheet starts with
//	 * @param max: amount of max health the character starts with
//	 * Rest of stats are generated by simulated dice rolls.
//	 */
//	public CharacterSheet(String n, Race r, Class[] c, Spell[] s, Feat[] f, ArrayList<Item> i, int max) {
//		name = n;
//		race = r;
//		classes = c;
//		spells = s;
//		feats = f;
//		items = i;
//		exp = 0;
//		lvl = 1;
//		Dice d = new Dice();
//		str = d.roll("3d6") + race.getStrMod() + classes[0].getStrMod();
//		dex = d.roll("3d6") + race.getDexMod() + classes[0].getDexMod();
//		con = d.roll("3d6") + race.getConMod() + classes[0].getConMod();
//		intelligence = d.roll("3d6") + race.getIntMod() + classes[0].getIntMod();
//		wis = d.roll("3d6") + race.getWisMod() + classes[0].getWisMod();
//		cha = d.roll("3d6") + race.getChaMod() + classes[0].getChaMod();
//		maxHealth = max;
//	}
//
//	/**
//	 * getName
//	 * @return name: the name of the character
//	 */
//	public String getName() {
//		return name;
//	}
//
//	/**
//	 * setName
//	 * @param n: string to set the name property to
//	 */
//	public void setName(String n) {
//		name = n;
//	}
//
//	/**
//	 * getRace
//	 * @return race: the Race object of this character
//	 */
//	public Race getRace() {
//		return race;
//	}
//
//	/**
//	 * setRace
//	 * @param r: Race object to set the characters race to
//	 */
//	public void setRace(Race r) {
//		race = r;
//	}
//
//	/**
//	 * getBackground
//	 * @return background: the Background object of the character
//	 */
//	public Background getBackground() {
//		return background;
//	}
//
//	/**
//	 * setBackground
//	 * @param b: the Background object to set the property to
//	 */
//	public void setBackground(Background b) {
//		background = b;
//	}
//
//	/**
//	 * getClasses
//	 * @return classes: array of Class objects
//	 */
//	public Class[] getClasses() {
//		return classes;
//	}
//
//	/**
//	 * setClasses
//	 * @param c: array of class Objects to set as the classes variable
//	 */
//	public void setClasses(Class[] c) {
//		classes = c;
//	}
//
//	/**
//	 * getFeat
//	 * @return feats: array of Feat objects
//	 */
//	public Feat[] getFeat() {
//		return feats;
//	}
//
//	/**
//	 * setFeat
//	 * @param f: array of Feat objects to set as the feats variable
//	 */
//	public void setFeat(Feat[] f) {
//		feats = f;
//	}
//
//	/**
//	 * getItems
//	 * @return items: ArrayList of Item objets
//	 */
//	public ArrayList<Item> getItems(){
//		return items;
//	}
//
//	/**
//	 * setItems
//	 * @param i: ArrayList of Item objects to set as the item variable
//	 */
//	public void setItems(ArrayList<Item> i) {
//		items = i;
//	}
//
//	/**
//	 * addItem
//	 * @param i: Item object to add to the items ArrayList
//	 */
//	public void addItem(Item i) {
//		items.add(i);
//	}
//
//	/**
//	 * removeItem
//	 * @param i: Item object to remove from the ArrayList
//	 */
//	public void removeItem(Item i) {
//		for(int k = 0; k < items.size(); k++) {
//			if(items.get(k).getName() == i.getName()) {
//				items.remove(k);
//				break;
//			}
//		}
//	}
//
//	/**
//	 * getExp
//	 * @return exp: amount of experience the character has
//	 */
//	public int getExp() {
//		return exp;
//	}
//
//	/**
//	 * setExp
//	 * @param e: amount of experience to set as the experience variable
//	 */
//	public void setExp(int e) {
//		exp = e;
//	}
//
//	/**
//	 * getLvl
//	 @return lvl: the level of the character
//	 */
//	public int getLvl() {
//		return lvl;
//	}
//
//	/**
//	 * setLvl
//	 * @param l: level to set as the lvl variable for the character
//	 */
//	public void setLvl(int l) {
//		lvl = l;
//	}
//
//}
//
