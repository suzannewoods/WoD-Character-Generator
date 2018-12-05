package finalProject;

/**
 * A class to create Character based on user selection
 * @author Suzanne Woods
 *
 */
public class Character 
{
	/**
	 * Character Name
	 */
	private String name;
	/**
	 * Character Age
	 */
	private int age;
	/**
	 * Player Name
	 */
	private String player;
	/**
	 * Size: Always 5 for starting character
	 */
	private int size = 5;
	/**
	 * Morality: Always 7 for starting character.
	 */
	private int morality = 7;
	/**
	 * Speed: Strength + Dexterity + 5
	 */
	private int speed;
	/**
	 * Initiative Moderator: Dexterity + Composure
	 */
	private int initMod;
	/**
	 * Defense: The lowest of Dexterity or Wits
	 */
	private int defense;
	/**
	 * Health: Stamina + Size
	 */
	private int health;
	/**
	 * Willpower: Resolve + Composure
	 */
	private int willpower;
	/**
	 * Virtue
	 */
	private String virtue;
	/**
	 * Vice
	 */
	private String vice;	
	
	/**
	 * Constructor to create character based on user input
	 * @param n Character Name
	 * @param a Character Age
	 * @param p Player Name
	 */
	public Character (String n, int a, String p)
	{
		this.name = n;
		this.age = a;
		this.player = p;		
	}
	
	/**
	 * A method to calculate natural stats based on Attributes
	 * @param a Attributes
	 */
	public void calculateNatStats(Attributes a)
	{
		if (a.getDexterity() < a.getWits()) defense = a.getDexterity();
		else defense = a.getWits();
		
		health = a.getStamina() + size;
		initMod = a.getDexterity() + a.getComposure();
		speed = a.getStrength() + a.getDexterity() + 5;
		willpower = (a.getResolve() + a.getComposure());		
	}	
	
	/**
	 * A method to set Character Name
	 * @param name Character Name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * A method to set Character Age
	 * @param age Character Age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * A method to set Player Name
	 * @param player Player Name
	 */
	public void setPlayer(String player) {
		this.player = player;
	}
	/**
	 * A method to set Size
	 * @param size
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * A method to set Morality Points
	 * @param morality
	 */
	public void setMorality(int morality) {
		this.morality = morality;
	}
	/**
	 * A method to set Speed
	 * @param speed
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	 * A method to set Initiative Modifier
	 * @param initMod
	 */
	public void setInitMod(int initMod) {
		this.initMod = initMod;
	}
	/**
	 * A method to set Defense Points
	 * @param defense
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}
	/**
	 * A method to set Health
	 * @param health
	 */
	public void setHealth(int health) {
		this.health = health;
	}
	/**
	 * A method to set Willpower Points
	 * @param willpower
	 */
	public void setWillpower(int willpower) {
		this.willpower = willpower;
	}
	/**
	 * A method to get Virtue chosen
	 * @return Virtue
	 */
	public String getVirtue() {
		return virtue;
	}
	/**
	 * A method to set Virtue 
	 * @param virtue
	 */
	public void setVirtue(String virtue) {
		this.virtue = virtue;
	}
	/**
	 * A method to get Vice.
	 * @return Vice
	 */
	public String getVice() {
		return vice;
	}
	/**
	 * A method to set Vice
	 * @param vice
	 */
	public void setVice(String vice) {
		this.vice = vice;
	}
	/**
	 * A method to get Character Name
	 * @return Character Name
	 */
	public String getName() {
		return name;
	}
	/**
	 * A method to get Character Age
	 * @return Character Age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * A method to get Player Name
	 * @return Player Name
	 */
	public String getPlayer() {
		return player;
	}
	/**
	 * A method to get Size
	 * @return Size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * A method to get Morality
	 * @return Morality
	 */
	public int getMorality() {
		return morality;
	}
	/**
	 * A method to get Speed
	 * @return Speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * A method to get Initiative Modifier
	 * @return Initiative Modifier
	 */
	public int getInitMod() {
		return initMod;
	}
	/**
	 * A method to get Defense
	 * @return Defense
	 */
	public int getDefense() {
		return defense;
	}
	/**
	 * A method to get Health
	 * @return Health
	 */
	public int getHealth() {
		return health;
	}
	/**
	 * A method to get Willpower
	 * @return
	 */
	public int getWillpower() {
		return willpower;
	}
	/**
	 * A method to get Natural Stats
	 * @return Natural Stats
	 */
	public String natStats()
	{
		return String.format("Natural Advantages and Traits:%nSize: %d%nMorality: %d%nSpeed:"
				+ " %d%nIniative Modifier: %d%nDefense: %d%nHealth: %d%nWillPower: %d", 
				getSize(), getMorality(), getSpeed(), getInitMod(), getDefense(), getHealth(),
				getWillpower());
	}

	@Override
	public String toString() {
		return String.format("Character Name: %s%nCharacter Age: %d%nPlayer "
				+ "Name: %s%n%nNatural Stats%nSize: %d%nMorality: %d%nSpeed: %d%nInitiative "
				+ "Modifier: %d%nDefense: %d%nHealth: %d%nWillpower: %d%n", 
				name, age, player, size, morality, speed, initMod, defense, health, willpower);
				
	}

	
}
