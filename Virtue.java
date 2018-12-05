package finalProject;

/**
 * A enum class for Virtue Options
 * @author Suzanne Woods
 *
 */
public enum Virtue 
{
	Empty
	{
		@Override
		public String toString()
		{
			return "";
		}
	},
	Charity	,
	Faith ,
	Fortitude,
	Hope,
	Justice,
	Prudence,
	Temperance;
	
	/**
	 * A string to hold the description of each enum.
	 */
	private String description;
	
	/**
	 * Descriptions for each enum.
	 */
	static
	{
		Charity.description = "True Charity comes from sharing gifts with others, be it money or possessions"
				+ ", or simply giving time to help another in need. A charitable character is guided by her "
				+ "compassion to share what she has in order to improve the plight of those around her. "
				+ "Charitable individuals are guided by the principle of treating others as they would be treated"
				+ " themselves. By sharing gifts and taking on the role of the Samaritan, they hope to cultivate"
				+ " goodwill in others, and the gifts they give will eventually return to them in their hour of"
				+ " need. \n\nYour character regains all spent Willpower points whenever she helps another at "
				+ "the risk of loss or harm to herself. It isn't enough to share what your character has in "
				+ "abundance. She must make a real sacrifice in terms of time, possessions or energy, or she "
				+ "must risk life and limb to help another.";
		
		Faith.description = "Those with Faith know that the universe is not random, meaningless chaos, but "
				+ "ordered by a higher power. No matter how horrifying the world might be, everything has its "
				+ "place in the Plan and ultimately serves that Purpose. This Virtue does not necessarily involve "
				+ "belief in a personified deity. It might involve belief in a Grand Unified Theory whereby the "
				+ "seeming randomness of the universe is ultimately an expression of mathematical precision. Or it "
				+ "might be a view that everything is One and that even evil is indistinguishable from good when all "
				+ "discriminating illusions are overcome. \n\nYour character regains all spent Willower points whenever "
				+ "he is able to forge meaning from chaos and tragedy.";
		
		Fortitude.description = "A person's ideals are meaningless unless they're tested. When it seems as though "
				+ "the entire world is arrayed against him because of his beliefs, a person possessing Fortitude "
				+ "weathers the storm and emerges with his convictions intact. Fortitude is about standing up for "
				+ "one's beliefs and holding the course no matter how tempting it may be to relent or give up. By "
				+ "staying the course, regardless of the cost, he proves the worth of his ideals.\n\nYour character "
				+ "regains all spent Willpower points whenever he withstands overwhleming or tempting pressure to "
				+ "alter his goals. This does not include temporary distractions from his course of action, only "
				+ "pressure that might cause him to abandon or change his goals altogether.";
		
		Hope.description = "Being hopeful means believing that evil and misfortune cannot prevail, no matter how "
				+ "grim things become. Not only do the hopeful believe in the ultimate triumph of morality and decency"
				+ " over malevolence, they maintain steadfast belief in a greater sense of cosmic justice, whether "
				+ "it's Karma or the idea of an all-knowing, all-seeing God who waits to punish the wicked. All will "
				+ "turn out right in the end, and the hopeful mean to be around when it happens. \n\nYour character "
				+ "regains all spent Willpower points whenever she refuses to let others give in to despair, even "
				+ "though doing so risks harming her own goals or wellbeing. This is similar to Fortitude except that"
				+ " your character tries to prevent others from losing hope in their goals. She need not share those"
				+ " goals herself or even be successful in upholding them, but there must be a risk involved.";
		
		Justice.description = "Wrongs cannot go unpunished. This is the central tenet of the just, who believe that "
				+ "protecting the innocent and confronting inequity is the responsibility of every decent person, even "
				+ "in the face of great personal danger. The just believe that evil cannot prosper so long as one good "
				+ "person strives to do what is right, regardless of the consequences. \n\nYour character regains all "
				+ "spent Willpower points whenever he does the right thing at risk of peronsal loss or setback. The "
				+ "right thing can be defined by the letter or spirit of a particular code of conduct, whether it be "
				+ "the United Stated penal code or a biblical Commandment.";
		
		Prudence.description = "The Virtue of Prudence places wisdom and restraint above rash action and thoughtless "
				+ "behavior. One maintains integrity and principles by moderating actions and avoiding unnecessary "
				+ "risks. While that means a prudent person might never take big gambles that bring huge rewards, "
				+ "neither is his life ruined by a bad roll of the dice. By choosing wisely and avoiding the easy road"
				+ " he prospers slowly but surely.\n\nYour character regains all spent Willpower points whenever he "
				+ "refuses a tempting course of action by which he could gain significantly. The temptation must "
				+ "involve some reward that, by refusing it, might cose him later on.";
		
		Temperance.description = "Moderation in all things is the secret to happiness, so says the doctrine of "
				+ "Temperance. It's all about balance. Everything has its place in a person's life, from anger to "
				+ "forgiveness, lust to chastity. The temperate do not believe in denying their urges, as none of it "
				+ "is unnatural or unholy. The trouble comes when things are taken to excess, whether it's a noble "
				+ "or base impulse. Too much righteousness can be just as bad as too much wickedness. \n\nYour character"
				+ " regains all spent Willpower when he resists a temptation to indulge in an excess of any behavior, "
				+ "whether good or bad, despite the obvious rewards it might offer.";
		
	}
	/**
	 * A method to return the description for each enum.
	 * @return description
	 */
	public String virtueDescription()
	{
		return description;
	}	
}
