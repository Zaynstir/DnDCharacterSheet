
public class Weapon extends Item{
	private static char attackType;
	private String[] weaponType;
	final private String damage;
	
	public Weapon(String n, char at, String[] wt, String d) {
		super(n, "");
		weaponType = wt;
		attackType = at;
		damage = d;
	}
	
	public char attackType() {
		return attackType;
	}
	
	public String[] getWeaponType() {
		return weaponType;
	}
	
	public String getWeaponType(int index) {
		return weaponType[index];
	}
	
	public String getDamage() {
		return damage;
	}
}
