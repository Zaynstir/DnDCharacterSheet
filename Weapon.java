
public class Weapon extends Item{
	final private int damage;
	final private boolean simple;
	final private boolean melee;
	
	public Weapon(String n, char[] p, int d, boolean s, boolean m) {
		super(n, "");
		damage = d;
		simple = s;
		melee = m;
	}
	
	public int getDamage() {
		return damage;
	}

	public boolean isSimple() {
		return simple;
	}

	public boolean isMelee() {
		return melee;
	}
}
