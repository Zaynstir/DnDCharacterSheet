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
			int str = Integer.parseInt(classFile.nextLine());
			int dex = Integer.parseInt(classFile.nextLine());
			int con = Integer.parseInt(classFile.nextLine());
			int nt = Integer.parseInt(classFile.nextLine());
			int wis = Integer.parseInt(classFile.nextLine());
			int cha = Integer.parseInt(classFile.nextLine());
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
			classFile.nextLine();
			classRay.add(new Class(name, str, dex, con, nt, wis, cha, -1, prof, sv, equipment, sp));
		}
		while(backgroundFile.hasNextLine()) {
			String name = backgroundFile.nextLine();
			String[] sp = backgroundFile.nextLine().split(",");
			String[] tp = backgroundFile.nextLine().split(",");
			String[] temp = backgroundFile.nextLine().split(",");
			Item[] item = new Item[temp.length];
			for(int i = 0; i < temp.length; i++) {
				item[i] = findItem(temp[i]);
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
	
	static public Feat findFeat(String featName) {
		for(Feat i : featRay) {
			if (i.getName().equals(featName))
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

}
