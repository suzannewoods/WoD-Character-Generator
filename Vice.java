package finalProject;

/**
 * A enum class for Vice options
 * @author Suzanne Woods
 *
 */
public enum Vice 
{
	Empty
	{
		@Override
		public String toString()
		{
			return "";
		}
	},
	Envy,
	Gluttony,
	Greed,
	Lust,
	Pride,
	Sloth,
	Wrath;
	
	/**
	 * A string to hold the description of each enum.
	 */
	private String description;
	
	/**
	 * Descriptions for each enum.
	 */
	static
	{
		Envy.description = "An envious person is never satisfied with what she has. No matter her wealth,"
				+ " status or accomplishments, there is always someone else who seems to have more, and "
				+ "it's coveted. Envious characters are never secure or content with their place in life. "
				+ "They always measure themselves against their rivals and look for ways to get what they deserve."
				+ " They might be considered paranoid or just consumed by a self loathing that they project onto "
				+ "others. \n\nYour character regains one Willpower point whenever she gains something important "
				+ "from a rival or has a hand in harming that rival's wellbeing.";
		
		Gluttony.description = "Gluttony is about indulging appetites to the exclusion of everything else. It's "
				+ "about dedicating oneself to sensual pleasures or chasing the next high. A glutton makes any sacrifice"
				+ " to feed his insatiable appetite for pleasure, regardless of the cost to himself or those around"
				+ " him. He might be considered a junky or even a kleptomaniac. \n\nYour character regains one spent"
				+ " Willpower point whenever he indulges in his addiction or appetites at some risk to himself or a loved one.";
		
		Greed.description = "Like the envious, the greedy ar never satisfied with what they have. They want more. More"
				+ " money, a bigger house, more status or influence. No matter what they may already have more than "
				+ "they can possibly handle. Everything is taken to excess. To the greedy, there is no such thng as "
				+ "having too much. If that means snatching someone else's hard-earned reward just to feather one's "
				+ "own nest, well, that's the way it goes. \n\nYour character regains one Willpower point whenever he"
				+ " acquires something at the expense of another. Gaining it must come at some potential risk.";
		
		Lust.description = "The Vice of Lust is the sin of uncontrolled desire. A lusty individual is driven by a "
				+ "passion for something(usually sex, but it can be a craving for virtually any experience or activity) "
				+ "that he acts upon without consideration for the needs or feelings of others. A lusty individual uses"
				+ " any means at his disposal to indulge his desires, from deception to manipulation to acts of violence."
				+ "\n\nYour character is consumed by a passion for something. He regains one Willpower point whenever "
				+ "he satisfies his lust or compulsion in a way that victimizes others.";
		
		Pride.description = "Pride is the Vice of self-confidence run amok. It is the belief that one's every action "
				+ "is inherently right, even when it should be obvious that it is anything but. A prideful person refuses"
				+ " to back down when his decision or reputation is called into question, even when the evidence is clear"
				+ " that he is in the wrong. His ego does not accept any outcome that suggests fallibility, and he is "
				+ "willing to see others suffer rather than admit that he's wrong.\n\nYour character regains one Willpower"
				+ " point whenever he exerts his own wants (not needs) over others at some potential risk to himself. "
				+ "This is most commonly the desire for adulation, but it could be the desire to make others do as he commands.";
		
		Sloth.description = "The Vice of Sloth is about avoiding work until someone else has to step in to get the job done. "
				+ "Rather than put in the effort, and possibly risk failure, in a difficult situation, the slothful person "
				+ "simply refuses to do anything, knowing that someone else will step in and fix the problem sooner or later."
				+ " The fact that people might needlessly suffer while the slothful person sits on his thumbs doesn't matter "
				+ "one bit. \n\nYour character regains one Willpower point whenever he successfully avoids a difficult task "
				+ "but achieves the same goal nonetheless.";
		
		Wrath.description = "The Vice of Wrath is the sin of uncontrolled anger. The wrathful look for ways to vent their "
				+ "anger and frustration on people of objects at the slightest provocation. In most cases the reaction is "
				+ "far out of proportion to the perceived slight. A wrathful person cut off on the freway might try to force"
				+ " another dirver off the road, or a wrathful cop might delight in beating each and every person he arrests,"
				+ " regardless of the offense. \n\nYour character regains one spent Willpower point whenever he unleashes his"
				+ " anger in a situation where doing so is dangerous. If the fight has already begun, no Willpower points are"
				+ " regained. It must take place in a situation where anger is unwarranted or inappropriate.";
		
		
	}
	/**
	 * A method to return the description for each enum. 
	 * @return description
	 */
	public String viceDescription()
	{
		return description;
	}
}
