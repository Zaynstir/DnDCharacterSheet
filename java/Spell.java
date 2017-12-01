/**
 * Spell.java
 * Used to define Spell objects that can be used by the character
 */
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

	/**
	 * Spell() 9-arg constructor
	 * @param n: name of the spell
	 * @param a: ability of the spell
	 * @param dmg: amount of damage that this spell can do
	 * @param dur: duration of the spell i.e. how many turns the spell is active
	 * @param rad: radius of the spell, effective area of the spell
	 * @param dc: the DC value of the spell
	 * @param con: boolean for if this spell requires concentration
	 * @param conDC: the DC value for the spell while concentrating
	 * @param l: level that the user must be to use the spell
	 */
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

	/**
	 * getName
	 * @return name: the name of the spell
	 */
	public String getName() {
		return name;
	}

	/**
	 * getAbility
	 * @return ability: the ability attribute of the spell
	 */
	public String getAbility() {
		return ability;
	}

	/**
	 * getDamage
	 * @return damage: the amount of damage that this spell can do
	 */
	public int getDamgage() {
		return damage;
	}

	/**
	 * getDuration
	 * @return duration: the duration of the spell, how many turns it lasts
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * getRadius
	 * @return radius: how many board units this spell is allowed to reach
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * getDC
	 * @return DC: the DC value of the spell
	 */
	public int getDC() {
		return DC;
	}

	/**
	 * getConcentration
	 * @return concentration: whether or not the spell requires concentration
	 */
	public boolean getConcentration() {
		return concentration;
	}

	/**
	 * getConcentrationDC
	 * @return concentrationDC: the DC value for the spell when concentrating
	 */
	public int getConcentrationDC() {
		return concentrationDC;
	}

	/**
	 * getLvl
	 * @return lvl: the level required to use this spell
	 */
	public int getLvl() {
		return lvl;
	}
}
