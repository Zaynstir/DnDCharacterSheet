/**
 * Item.java
 * Used for defining an Item object to be used by characters in a game of DND
 */
public class Item {
	final private String name;
	final private String description;

	/**
	 * Item() 2-arg constructor
	 * @param n: name of the item
	 * @param desc: description of the item
	 */
	public Item(String n, String desc) {
		name = n;
		description = desc;
	}

	/**
	 * getName
	 * @return name: name of the item
	 */
	public String getName() {
		return name;
	}

	/**
	 * getDescription
	 * @return description: the desc of the item
	 */
	public String getDescription() {
		return description;
	}
}
