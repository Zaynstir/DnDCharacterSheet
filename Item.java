
public class Item {
	final private String name;
	final private String description;
	
	public Item(String n, String desc) {
		name = n;
		description = desc;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
}
