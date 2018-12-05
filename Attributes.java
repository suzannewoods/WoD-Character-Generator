package finalProject;

/**
 * A class to create and store attributes for your character.
 * @author Suzanne Woods
 *
 */
public class Attributes 
{
	/**
	 * Intelligence Points: 1 - 5
	 */
	private int intelligence;
	/**
	 * Wits Points: 1 - 5
	 */
	private int wits;
	/**
	 * Resolve Points: 1 - 5
	 */
	private int resolve;
	/**
	 * Strength Points: 1 - 5
	 */
	private int strength;
	/**
	 * Dexterity Points: 1 - 5
	 */
	private int dexterity;
	/**
	 * Stamina Points: 1 - 5
	 */
	private int stamina;
	/**
	 * Presence Points: 1 - 5
	 */
	private int presence;
	/**
	 * Manipulation Points: 1 - 5
	 */
	private int manipulation;
	/**
	 * Composure Points: 1 - 5
	 */
	private int composure;	
	
	/**
	 * Create a set of attributes based on user selection.
	 * @param i Intelligence
	 * @param w Wits
	 * @param r Resolve
	 * @param s Strength
	 * @param d Dexterity
	 * @param st Stamina
	 * @param p Presence
	 * @param m Manipulation
	 * @param c Composure
	 */
	public Attributes(int i, int w, int r, int s, int d, int st, int p, int m, int c)
	{
		this.intelligence = i;
		this.wits = w;
		this.resolve = r;
		this.strength = s;
		this.dexterity = d;
		this.stamina = st;
		this.presence = p;
		this.manipulation = m;
		this.composure = c;
	}	
	
	/**
	 * A method to get points for Intelligence
	 * @return Intelligence Points
	 */
	public int getIntelligence() {
		return intelligence;
	}
	/**
	 * A method to set Intelligence Points
	 * @param intelligence
	 */
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	/**
	 * A method to get points for Wits
	 * @return Wits Points
	 */
	public int getWits() {
		return wits;
	}
	/**
	 * A method to set Wits Points
	 * @param wits
	 */
	public void setWits(int wits) {
		this.wits = wits;
	}
	/**
	 * A method to get points for Resolve
	 * @return Resolve Points
	 */
	public int getResolve() {
		return resolve;
	}
	/**
	 * A method to set Resolve Points
	 * @param resolve
	 */
	public void setResolve(int resolve) {
		this.resolve = resolve;
	}
	/**
	 * A method to get points for Strength
	 * @return Strength Points
	 */
	public int getStrength() {
		return strength;
	}
	/**
	 * A method to set Strength Points
	 * @param strength
	 */
	public void setStrength(int strength) {
		this.strength = strength;
	}
	/**
	 * A method to get points for Dexterity
	 * @return Dexterity Points
	 */
	public int getDexterity() {
		return dexterity;
	}
	/**
	 * A method to set Dexterity Points
	 * @param dexterity
	 */
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	/**
	 * A method to get points for Stamina
	 * @return Stamina Points
	 */
	public int getStamina() {
		return stamina;
	}
	/**
	 * A method to set Stamina Points
	 * @param stamina
	 */
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	/**
	 * A method to get points for Presence
	 * @return Presence Points
	 */
	public int getPresence() {
		return presence;
	}
	/**
	 * A method to set Presence Points
	 * @param presence
	 */
	public void setPresence(int presence) {
		this.presence = presence;
	}
	/**
	 * A method to get points for Manipulation
	 * @return Manipulation Points
	 */
	public int getManipulation() {
		return manipulation;
	}
	/**
	 * A method to set Manipulation Points
	 * @param manipulation
	 */
	public void setManipulation(int manipulation) {
		this.manipulation = manipulation;
	}
	/**
	 * A method to get points for Composure
	 * @return Composure Points
	 */
	public int getComposure() {
		return composure;
	}
	/**
	 * A method to set Composure Points
	 * @param composure
	 */
	public void setComposure(int composure) {
		this.composure = composure;
	}

	@Override
	public String toString() {
		return String.format(
				"Attributes: %nIntelligence = %s%nWits = %s%nResolve = %s%nStrength = %s%nDexterity = %s%nStamina = %s%nPresence = %s%nManipulation = %s%nComposure = %s",
				intelligence, wits, resolve, strength, dexterity, stamina, presence, manipulation, composure);
	}
	
	

}
