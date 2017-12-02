/**
 * Imports objects such as classes and feats and more from a text file based off of the Player's Handbook
 * @author Zayin Brunson, Weston Chan, Matthew Link, Gabriel Maddex
 * @version CIS 200 Final
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class SACSRunner {
	static ArrayList<Spell> spellRay = new ArrayList<Spell>();
	static ArrayList<Race> raceRay = new ArrayList<Race>();
	static ArrayList<Class> classRay = new ArrayList<Class>();
	static ArrayList<Feat> featRay = new ArrayList<Feat>();
	static ArrayList<Item> itemRay = new ArrayList<Item>();
	static ArrayList<Background> backgroundRay = new ArrayList<Background>();
	static CharacterSheet cs;
	static Dice dice = new Dice();	
	
	/**
	 * Imports objects from specially formatted text files and puts them into ArrayLists
	 * @param args Argument from the command line - not used
	 * @throws FileNotFoundException Needed to compile
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner raceFile = new Scanner(new FileReader("Race.txt"));
		Scanner classFile = new Scanner(new FileReader("Class.txt"));
		Scanner featFile = new Scanner(new FileReader("Feats.txt"));
		Scanner itemFile = new Scanner(new FileReader("Item.txt"));
		Scanner backgroundFile = new Scanner(new FileReader("Background.txt"));
		Scanner weaponFile = new Scanner(new FileReader("Weapon.txt"));
		Scanner armorFile = new Scanner(new FileReader("Armor.txt"));
		Scanner spellFile = new Scanner(new FileReader("Spell.txt"));
		
		spellFile.nextLine();
		spellFile.nextLine();
		spellFile.nextLine();
		spellFile.nextLine();
		spellFile.nextLine();
		spellFile.nextLine();
		spellFile.nextLine();
		spellFile.nextLine();
		while(spellFile.hasNextLine()) {
			String name = spellFile.nextLine();
			int lvl = Integer.parseInt(spellFile.nextLine());
			String action = spellFile.nextLine();
			String range = spellFile.nextLine();
			String[] comp = spellFile.nextLine().split(",");
			String duration = spellFile.nextLine();
			String[] sl = spellFile.nextLine().split(",");
			spellFile.nextLine();
			spellRay.add(new Spell(name, lvl, action, range, comp, duration,sl));
		}
		
		
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
		for(Spell f : spellRay) {
			System.out.println("Spell:: "+f.getName());
		}
	}
	
	/**
	 * Finds a feat in the Feats ArrayList and returns it
	 * @param name The name of the feat
	 * @return A feat in the Feats ArrayList and returns it
	 */
	static public Feat findFeat(String name) {
		for(Feat i : featRay) {
			if (i.getName().equals(name))
				return i;
		}
		return null;
	}
	
	/**
	 * Finds a race in the Race ArrayList and returns it
	 * @param name The name of the race
	 * @return A race in the Race ArrayList and returns it
	 */
	static public Race findRace(String name) {
		for(Race i : raceRay) {
			if (i.getName().equals(name))
				return i;
		}
		return null;
	}
	
	/**
	 * Finds an item in the Items ArrayList and returns it
	 * @param name The name of the Item
	 * @return An item in the Items ArrayList and returns it
	 */
	static public Item findItem(String name) {
		for(Item i : itemRay) {
			if (i.getName().equals(name))
				return i;
		}
		return null;
	}
	
	/**
	 * Finds a class in the Class ArrayList and returns it
	 * @param name The name of the class
	 * @return A class in the Class ArrayList and returns it
	 */
	static public Class findClass(String name) {
		for(Class i : classRay) {
			if (i.getName().equals(name))
				return i;
		}
		return null;
	}
	
	/**
	 * Finds a background in the Backgrounds ArrayList and returns it
	 * @param name The name of the background
	 * @return A background in the Backgrounds ArrayList and returns it
	 */
	static public Background findBackground(String name) {
		for(Background i : backgroundRay) {
			if (i.getName().equals(name))
				return i;
		}
		return null;
	}
	
	/**
	 * Finds a spell in the Spells ArrayList and returns it
	 * @param name The name of the spell
	 * @return A spell in the Spells ArrayList and returns it
	 */
	static public Spell findSpell(String name) {
		for(Spell i : spellRay) {
			if (i.getName().equals(name))
				return i;
		}
		return null;
	}
}
