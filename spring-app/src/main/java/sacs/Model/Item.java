/**
 * Item.java
 * Used for defining an Item object to be used by characters in a game of DND
 */
public class Item {
	final private String name;
	final private String desc;
	
	/**
	 * Item() 2-arg constructor
	 * @param n: name of the item
	 * @param d: description of the item
	 */
	public Item(String n, String d) {
		name = n;
		desc = d;
	}

	/**
	 * getName
	 * @return name: name of the item
	 */
	public String getName() {
		return name;
	}
	/**
	 * getDesc
	 * @return desc: the desc of the item
	 */
	public String getDesc() {
		return desc;
	}
}
