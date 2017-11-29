
public class Spell {
	final private String name;
	final private String ability;
	final private int damage;
	final private int duration;
	final private int radius;
	final private int DC;
	final private boolean concentration;
	final private int concentrationDC;
	final private int lvl;
	
	public Spell(String n, String a, int dmg, int dur, int rad, int dc, boolean con, int conDC, int l) {
		name = n;
		ability = a;
		damage = dmg;
		duration = dur;
		radius = rad;
		DC = dc;
		concentration = con;
		concentrationDC = conDC;
		lvl = l;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAbility() {
		return ability;
	}
	
	public int getDamgage() {
		return damage;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public int getDC() {
		return DC;
	}
	
	public boolean getConcentration() {
		return concentration;
	}
	
	public int getConcentrationDC() {
		return concentrationDC;
	}
	
	public int getLvl() {
		return lvl;
	}
}
