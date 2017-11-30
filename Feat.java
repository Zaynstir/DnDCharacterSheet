/**
 * Feat.java
 * Used for defining a feat used by a D&D character
 */
public class Feat {
	final private String name;
	final private String desc;
	final private String prereq;
	final private String[] features;

	/**
	 * Feat() 4-arg Constructor
	 * @param n: name of feat
	 * @param d: description of feat
	 * @param p: prerequisites for this feat
	 * @param f: array of featrues of this feat
	 */
	public Feat(String n, String d, String p, String[] f) {
		name = n;
		desc = d;
		prereq = p;
		features = f;
	}

	/**
	 * getName
	 * @return name: the name of the feat
	 */
	public String getName() {
		return name;
	}

	/**
	 * getDesc
	 * @return desc: the description of the feat
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * getPrereq
	 * @return prereq: the prerequisite to have this feat
	 */
	public String getPrereq() {
		return prereq;
	}

	/**
	 * getFeatures
	 * @return features: String[] of features that this feat contains
	 */
	public String[] getFeatures(){
		return features;
	}

	/**
	 * getFeatures
	 * @param index: index of feature you want
	 * @return features[index]
	 */
	public String getFeatures(int index) {
		return features[index];
	}
}
