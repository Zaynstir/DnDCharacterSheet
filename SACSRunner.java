import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class SACSRunner {
	static ArrayList<Race> raceRay = new ArrayList<Race>();
	static ArrayList<Class> classRay = new ArrayList<Class>();
	static ArrayList<Feat> featRay = new ArrayList<Feat>();
	static ArrayList<Item> itemRay = new ArrayList<Item>();
	static ArrayList<Background> backgroundRay = new ArrayList<Background>();
	static CharacterSheet cs;
	static Dice dice = new Dice();
	
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
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner raceFile = new Scanner(new FileReader("Race.txt"));
		Scanner classFile = new Scanner(new FileReader("Class.txt"));
		Scanner featFile = new Scanner(new FileReader("Feats.txt"));
		Scanner itemFile = new Scanner(new FileReader("Item.txt"));
		Scanner backgroundFile = new Scanner(new FileReader("Background.txt"));
		Scanner weaponFile = new Scanner(new FileReader("Weapon.txt"));
		Scanner armorFile = new Scanner(new FileReader("Armor.txt"));
		
		itemFile.nextLine();
		itemFile.nextLine();
		itemFile.nextLine();
		while(itemFile.hasNextLine()) {
			String name = itemFile.nextLine();
			String desc = "";
			itemFile.nextLine();
			itemFile.nextLine();
			//itemFile.nextLine();
			itemRay.add(new Item(name, desc));
		}
		
		weaponFile.nextLine();
		weaponFile.nextLine();
		weaponFile.nextLine();
		weaponFile.nextLine();
		while(weaponFile.hasNextLine()) {
			String name = weaponFile.nextLine();
			String[] wt = weaponFile.nextLine().split(",");
			String temp = weaponFile.nextLine();
			String dmg = temp.substring(0,temp.length()-2);
			char at = temp.charAt(temp.length()-1);
			weaponFile.nextLine();
			itemRay.add(new Weapon(name, at, wt, dmg));
		}
		
		armorFile.nextLine();
		armorFile.nextLine();
		armorFile.nextLine();
		armorFile.nextLine();
		armorFile.nextLine();
		armorFile.nextLine();
		while(armorFile.hasNextLine()) {
			String name = armorFile.nextLine();
			char t = armorFile.nextLine().charAt(0);
			int AC = Integer.parseInt(armorFile.nextLine());
			int max = Integer.parseInt(armorFile.nextLine());
			String desc = armorFile.nextLine();
			armorFile.nextLine();
			itemRay.add(new Armor(name, desc, t, AC, max));
		}
		while(featFile.hasNextLine()) {
			String name = featFile.nextLine();
			String prereq = featFile.nextLine();
			String[] features = featFile.nextLine().split(",");
			String[] req = featFile.nextLine().split(",");
			featRay.add(new Feat(name, prereq, features, req));
			featFile.nextLine();
			//System.out.println(line);
		}
		while(raceFile.hasNextLine()) {
			String name = raceFile.nextLine();
			int str = Integer.parseInt(raceFile.nextLine());
			int dex = Integer.parseInt(raceFile.nextLine());
			int con = Integer.parseInt(raceFile.nextLine());
			int nt = Integer.parseInt(raceFile.nextLine());
			int wis = Integer.parseInt(raceFile.nextLine());
			int cha = Integer.parseInt(raceFile.nextLine());
			int speed = Integer.parseInt(raceFile.nextLine());
			String[] languages = raceFile.nextLine().split(",");
			String[] f = raceFile.nextLine().split(",");
			Feat[] feat = new Feat[f.length];
			for(int i = 0; i < f.length; i++) {
				feat[i] = findFeat(f[i]);
			}
			String[] sr = raceFile.nextLine().split(",");
			Race[] race = new Race[sr.length];
			for(int i = 0; i < sr.length; i++) {
				race[i] = findRace(sr[i]);
			}
			raceRay.add(new Race(name, str, dex, con, nt, wis, cha, feat, race, speed, languages));
			raceFile.nextLine();
			
		}
		while(classFile.hasNextLine()) {
			String name = classFile.nextLine();
			int health = Integer.parseInt(classFile.nextLine());
			String[] prof = classFile.nextLine().split(",");
			String[] sv = classFile.nextLine().split(",");
			String sp = classFile.nextLine();
			ArrayList<String> equipment = new ArrayList<String>();
			String curLine = classFile.nextLine();
			while(curLine.charAt(0) == '-') {
				equipment.add(curLine.substring(1));
				curLine = classFile.nextLine();
			}
			//System.out.println(classFile.nextLine());
			String[] f = curLine.split(",");
			Feat[] feat = new Feat[f.length];
			for(int i = 0; i < f.length; i++) {
				feat[i] = findFeat(f[i]);
			}
			classFile.nextLine();
			classRay.add(new Class(name, health, feat, -1, prof, sv, equipment, sp));
		}
		while(backgroundFile.hasNextLine()) {
			String name = backgroundFile.nextLine();
			String[] sp = backgroundFile.nextLine().split(",");
			String[] tp = backgroundFile.nextLine().split(",");
			String[] temp = backgroundFile.nextLine().split(",");
			Item[] item = new Item[temp.length];
			for(int i = 0; i < temp.length; i++) {
				item[i] = (findItem(temp[i]) == null ? new Item(temp[i],"") : findItem(temp[i]));
			}
			String[] f = backgroundFile.nextLine().split(",");
			Feat[] feat = new Feat[f.length];
			for(int i = 0; i < f.length; i++) {
				feat[i] = findFeat(f[i]);
			}
			String languages = backgroundFile.nextLine();
			backgroundFile.nextLine();
			backgroundRay.add(new Background(name, sp, tp, item, feat, languages));
		}
		for(Feat f : featRay) {
			System.out.println("FEAT:: "+f.getName());
		}
		for(Race f : raceRay) {
			System.out.println("RACE:: "+f.getName());
		}
		for(Class f : classRay) {
			System.out.println("CLASS:: "+f.getName());
		}
		for(Background f : backgroundRay) {
			System.out.println("Background:: "+f.getName());
		}
		for(Item f : itemRay) {
			System.out.println("ITEM:: "+f.getName());
		}
		
	}
	
	static public Feat findFeat(String name) {
		for(Feat i : featRay) {
			if (i.getName().equals(name))
				return i;
		}
		return null;
	}
	
	static public Race findRace(String name) {
		for(Race i : raceRay) {
			if (i.getName().equals(name))
				return i;
		}
		return null;
	}
	
	static public Item findItem(String name) {
		for(Item i : itemRay) {
			if (i.getName().equals(name))
				return i;
		}
		return null;
	}
	
	static public Class findClass(String name) {
		for(Class i : classRay) {
			if (i.getName().equals(name))
				return i;
		}
		return null;
	}
	
	public static Dice getDice() {
		return dice;
	}

	public static void setDice(Dice dice) {
		SACSRunner.dice = dice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public Background getBackground() {
		return background;
	}

	public void setBackground(Background background) {
		this.background = background;
	}

	public Class[] getClasses() {
		return classes;
	}

	public void setClasses(Class[] classes) {
		this.classes = classes;
	}

	public Spell[] getSpells() {
		return spells;
	}

	public void setSpells(Spell[] spells) {
		this.spells = spells;
	}

	public Feat[] getFeats() {
		return feats;
	}

	public void setFeats(Feat[] feats) {
		this.feats = feats;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLvl() {
		return lvl;
	}

	public void setLvl(int lvl) {
		this.lvl = lvl;
	}

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getCon() {
		return con;
	}

	public void setCon(int con) {
		this.con = con;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getWis() {
		return wis;
	}

	public void setWis(int wis) {
		this.wis = wis;
	}

	public int getCha() {
		return cha;
	}

	public void setCha(int cha) {
		this.cha = cha;
	}
	
	public void setCS() {

		cs = new CharacterSheet(name, race, classes, spells, feats, items, exp, lvl, str, dex, con, intelligence, wis, cha, 10);
	}
}
