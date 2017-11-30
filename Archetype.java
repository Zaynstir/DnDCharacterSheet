
public class Archetype {
	final private String name;
	final private Feat[] feats;
	
	
	
	public Archetype (String n, Feat[] f) {
		name = n;
		feats = f;
	}
	
	public Feat[] getFeat() {
		return feats;
	}
	
	public Feat getFeat(int index) {
		return feats[index];
	}
	
	public String getName() {
		return name;
	}
}
