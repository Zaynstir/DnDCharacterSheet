
public class Weapon extends Item{
	private static char[] possibleTypes;
	final private int damage;
	
	public Weapon(String n, char[] p, int d) {
		super(n);
		possibleTypes = p;
		damage = d;
	}
	
	public char[] getPossibleTypes() {
		return possibleTypes;
	}
	
	public char getPossibleTypes(int index) {
		return possibleTypes[index];
	}
	
	public int getDamage() {
		return damage;
	}
}
