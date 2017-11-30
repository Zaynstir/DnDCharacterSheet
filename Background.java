/**
 * Background.java
 * Used for defining the Background of a chracater and what stats come with that background
 */
public class Background {
	final private String name;
	final private String[] skillProf;
	final private String[] toolProf;
	final private Item[] equipment;
	final private Feat[] features;
	final private String languages;
	
	public Background(String n, String[] sp, String[] tp, Item[] e, Feat[] f, String l){
		name = n;
		skillProf = sp;
		toolProf = tp;
		equipment = e;
		features = f;
		languages = l;
	}
	
	public String getName() {
		return name;
	}
	
	
	
}