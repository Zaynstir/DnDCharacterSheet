
public class Feat{
	final private String name;
	final private String prereq;
	final private String[] features;
	final private String[] req;
	
	
	public Feat(String n, String p, String[] f, String[] r) {
		name = n;
		prereq = p;
		features = f;
		req = r;
	}
	
	public String getName() {
		return name;
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
	
	public String getReq() {
		return req;
	}
}
