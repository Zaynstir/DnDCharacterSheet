
/**
 * Feat.java
 * Used for defining a feat used by a D&D character
 */
public class Feat {
	final private String name;
	final private String prereq;
	final private String[] features;
	final private String[] req;
	
	/**
	 * Feat() 4-arg Constructor
	 * @param n: name of feat
	 * @param p: prerequisites needed to get the feat
	 * @param f: String[] of features that this feat contains (what it does)
	 * @param r: origin of feat (comes forom class, race, background, etc...)
	 */
	public Feat(String n, String p, String[] f, String[] r) {
		name = n;
		prereq = p;
		features = f;
		req = r;
	}

	/**
	 * getName
	 * @return name: the name of the feat
	 */
	public String getName() {
		return name;
	}

  /**
	 * getPrereq
	 * @return Requisites: the origin of the feature (class, race, background, etc...)
	 */
	public String getPrereq() {
		return prereq;
	}

	/**
	 * getFeatures
	 * @return features: String[] of features that this feat contains (what it does)
	 */
	public String[] getFeatures(){
		return features;
	}

	/**
	 * getReq
	 * @return the origin of the feature (class, race, background, etc...)
	 */
	public String[] getReq() {
		return req;
	}
}
