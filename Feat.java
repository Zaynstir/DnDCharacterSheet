
public class Feat {
	final private String name;
	final private String desc;
	final private String prereq;
	final private String[] features;
	
	public Feat(String n, String d, String p, String[] f) {
		name = n;
		desc = d;
		prereq = p;
		features = f;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getPrereq() {
		return prereq;
	}
	
	public String[] getFeatures(){
		return features;
	}
	
	public String getFeatures(int index) {
		return features[index];
	}
}
