
public class Armor extends Item{
	private static char[] possibleTypes;
	final char[] types;
	final int AC;
	
	public Armor(String n, char[] p, char[] t, int ac) {
		super(n);
		possibleTypes = p;
		types = t;
		AC = ac;
	}
	
	public char[] getPossibleTypes() {
		return possibleTypes;
	}
	
	public char getPossibleTypes(int index) {
		return possibleTypes[index];
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
}
