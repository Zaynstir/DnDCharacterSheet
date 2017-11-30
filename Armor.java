
public class Armor extends Item{
	final private char type;
	final private int AC;
	final private int max;
	
	public Armor(String n, String desc, char t, int ac, int m) {
		super(n, desc);
		type = t;
		AC = ac;
		max = m;
	}
	
	public char getType() {
		return type;
	}
	
	public int getMax() {
		return max;
	}
	
	public int getAC() {
		return AC;
	}
}
