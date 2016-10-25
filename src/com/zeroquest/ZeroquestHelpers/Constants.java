package com.zeroquest.ZeroquestHelpers;

public class Constants {

	/**
	 * Names of races
	 */
	public static String [] entityRaceNames =
		{
				"Human", "Dwarf", "Elf"
				//, "Barbarian", "Ork", "Goblin", "Pygmee", "Fishman", "Undead"
		};

	/**
	 * Names of classes
	 */
	public static String [] entityClassNames =
		{
				"Warrior", "Paladin", "Barbarian", "Thief", "Archer", "Mage", "Priest", "Monk", "Ninja", 
		};

	/**
	 * List of classes stats
	 */
	protected static int[][] classStatistics = 
		{
				{ //Attack dices 0
					3,2,4,4,5,2,5,4,4
				},
				{ //Defense dices 1
					3,5,2,2,2,3,1,2,2
				},
				{ //Health points 2
					10,12,4,6,12,8,6,6,6
				}
		};

	/**
	 *Cities speech
	 */
	String [] entityStartingCity =
		{
				"\nWelcome to Pellarian: capital city of humans, you’re one of those stupid peasant that destroy nature wherever they goes and also if you’re a paladin a thief or a mage. \nThis city is well known for well… horse poop, smelly fish, thieves, tramps, guards corruption… But they sell good horses, heavy armors and quite good weapons.", 
				"\nWelcome to Kalhazdan:  capital city of dwarves, this city is well known for it’s beer, dwarven weapons and protections, jewelry and it's population of all those little grumpy bastards with a beard and a axe…", 
				"\nWelcome to Ellïanär: capital city of elven, you’re one of those salad eater… this city is well known for it’s salad, little ponies, unicorns that poop rainbows and butterflies… \nand also bows a weapon for tards… full of those tall pointy ears salad eaters…"
		
		};
}
