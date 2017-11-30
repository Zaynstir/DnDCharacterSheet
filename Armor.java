
public class Armor extends Item{
	final char[] types;
	final int AC;
	final int maxDex;
	
	public Armor(String n, String desc, char[] p, char[] t, int ac, int max) {
		super(n, desc);
		types = t;
		AC = ac;
		maxDex = max;
	}
	
	public char[] getTypes() {
		return types;
	}
	
	public char getTypes(int index) {
		return types[index];
	}
	
	public int getAC() {
		return AC;
	}
	
	public int getMaxDex() {
		return maxDex;
	}
	
}
