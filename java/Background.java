/**
 * Used for defining the Background of a character and what stats come with that background
 * @author Zayin Brunson, Weston Chan, Matt Link, Gabriel Maddex
 * @version CIS200Final
 */
public class Background {
	final private String name;
	final private String[] skillProf;
	final private String[] toolProf;
	final private Item[] equipment;
	final private Feat[] features;
	final private String languages;

	/**
	 * Sets Class variables to the ones passed in.
	 * @param n Background's Name
	 * @param sp Background skill proficiencies
	 * @param tp Background tool proficiences
	 * @param e Background equipments
	 * @param f Background abilities
	 * @param l Background languages
	 */
	public Background(String n, String[] sp, String[] tp, Item[] e, Feat[] f, String l){
		name = n;
		skillProf = sp;
		toolProf = tp;
		equipment = e;
		features = f;
		languages = l;
	}

	/**
	 * Gets Background's name
	 * @return Background's Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Skill Proficiencies
	 * @return Background provided skill proficiencies
	 */
	public String[] getSkillProf() {
		return skillProf;
	}

	/**
	 * Tool Proficiencies
	 * @return Background provided tool proficiencies
	 */
	public String[] getToolProf() {
		return toolProf;
	}

	/**
	 * Equipment
	 * @return Background provided list of tools/weapons/equipment
	 */
	public Item[] getEquipment() {
		return equipment;
	}

	/**
	 * Background Features
	 * @return Background provided abilities
	 */
	public Feat[] getFeatures() {
		return features;
	}

	/**
	 * Skill Proficiencies
	 * @param index: Used to find a certain skill proficiency
	 * @return Background provided skill proficiencies
	 */
	public String getSkillProf(int index) {
		return skillProf[index];
	}

	/**
	 * Tool Proficiencies
	 * @param index: Used to find certain tool proficiencies
	 * @return Background provided tool proficiencies
	 */
	public String getToolProf(int index) {
		return toolProf[index];
	}

	/**
	 * Equipment
	 * @param index: used to find a certain Item
	 * @return Background provided list of tools/weapons/equipment
	 */
	public Item getEquipment(int index) {
		return equipment[index];
	}

	/**
	 * Background Features
	 * @param index: used to find a certain ability
	 * @return Background provided abilities
	 */
	public Feat getFeatures(int index) {
		return features[index];
	}

	/**
	 * Background Languages
	 * @return Background provided languages
	 */
	public String getLanguages() {
		return languages;
	}



}
