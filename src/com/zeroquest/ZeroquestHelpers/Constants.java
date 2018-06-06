package com.zeroquest.ZeroquestHelpers;

import com.zeroquest.ZeroquestEntities.EntityPlayer;

public class Constants {
	
	/**
	 * Number of available Races
	 */
	private static int actualAvailableRaces=3;
	
	public static int getActualAvailableRaces(){
		return actualAvailableRaces;
	}
	
	/**
	 * Number of available Races
	 */
	private static int actualAvailableClasses=3;
	
	public static int getActualAvailableClasses(){
		return actualAvailableClasses;
	}

	/**
	 * Names of races
	 */
	private static String [][] entityRaceNamesAndPresentation =
		{
				{
					"Human", "Dwarf", "Elf"
					//, "Barbarian", "Ork", "Goblin", "Pygmee", "Fishman", "Undead"
				},{
					"Jack of all trade, master of none", "Treasure finder, heavy drinker", "Boulder..., vegetables eater..."
				}
		};
	
	public static String getEntityRaceName(int raceNumber){
		return entityRaceNamesAndPresentation[0][raceNumber];
	}
	
	public static String getEntityRaceSpeech(int raceNumber){
		return entityRaceNamesAndPresentation[1][raceNumber];
	}

	/**
	 * Names of classes
	 */
	private static String [][] entityClassNamesAndPresentation =
		{
				{
					"Warrior", "Paladin", "Barbarian"
					//, "Thief", "Archer", "Mage", "Priest", "Monk", "Ninja", 
				},
				{
					"A warrior is most of the time an ex soldier who fled with great glory from a battlefield, sometimes a peasant who think have fighting abilities... ahahah...",
					"An old warrior who gets hardly struck by a mass and now heard voices in his head, but since he gain healing powers it's ok if he seems a little bit mad...",
					"barbarians dislike magic, archery as these are for cowards only. They go in battle only wearing a leather pants, which is quite stupid."
				}
		};
	
	/*+ "\n\t1)"+ Constants.getEntityClassName(0) +"\n"
	+ "\t Attack: "+Constants.getEntityClassAttack(0)+"\t Defense: "+Constants.getEntityClassDefense(0)+"\t Health:"+Constants.getEntityClassHealthPoints(0)+"\n"
	+ "\tAn equilibrated class, good for starting\n"
	+ "\n\t2)"+ Constants.getEntityClassName(1) +"\n"
	+ "\t"+Constants.getEntityClassAttack(1)+"\t"+Constants.getEntityClassDefense(1)+"\t"+Constants.getEntityClassHealthPoints(1)+"\n"
	+ "\tA tanking class, good for taking damages\n"
	+ "\n\t3)"+ Constants.getEntityClassName(2) +"\n"
	+ "\t"+Constants.getEntityClassAttack(2)+"\t"+Constants.getEntityClassDefense(2)+"\t"+Constants.getEntityClassHealthPoints(2)+"\n"
	+ "\tA dps class, good for making damages\n"*/

	//New classes will be implemented later
	//+ "\n4)Thief\n"
	//+ "HP:6|Atk:4|Def:2\n"
	//+ "A dps class with extra damages if he hit ennemies from behind \n"
	//+ "\n5)Archer\n"
	//+ "HP:6|Atk:4|Def:2\n"
	//+ "A dps class with ability to shoot from distance\n"
	//+ "\n6)Mage\n"
	//+ "HP:4|Atk:4|Def:2\n"
	//+ "A dps class with powerful magic\n"
	//+ "\n7)Priest\n"
	//+ "HP:8|Atk:2|Def:3\n"
	//+ "A healing class, good for assist\n"
	//+ "\n8)[ELITE CLASS: Monk]\n"
	//+ "HP:6|Atk:5|Def:1\n"
	//+ "A dps class fighting only with hands\n"
	//+ "\n9)[ELITE CLASS: Ninja]\n"
	//+ "HP:6|Atk:4|Def:2\n"
	//+ "A dps class with powerful special habilities\n"
	
	public static String getEntityClassName(int classNumber){
		return entityClassNamesAndPresentation[0][classNumber];
	}
	
	public static String getEntityClassSpeech(int classNumber){
		return entityClassNamesAndPresentation[1][classNumber];
	}

	/**
	 * List of classes stats
	 */
	private static int[][] classStatistics = 
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
	
	public static int getEntityClassAttack(int classNumber){
		return classStatistics[0][classNumber];
	}
	public static int getEntityClassDefense(int classNumber){
		return classStatistics[1][classNumber];
	}
	public static int getEntityClassHealthPoints(int classNumber){
		return classStatistics[2][classNumber];
	}

	/**
	 *Cities speech
	 */
	private static String [] entityCitySpeech =
		{
				"\nWelcome to Pellarian: capital city of humans, you’re one of those stupid peasant that destroy nature wherever they goes. \nThis city is well known for well… horse poop, smelly fish, thieves, tramps, guards corruption… But they sell good horses, heavy armors and quite good weapons.", 
				"\nWelcome to Kalhazdan: capital city of dwarves, this city is well known for it’s beer, dwarven weapons and armors, jewelry and it's population of all those little grumpy bastards with a beard (even the female type...) and a axe…", 
				"\nWelcome to Ellïanär: capital city of elven, you’re one of those salad eater… this city is well known for it’s salad, little ponies, unicorns that poop rainbows and butterflies… \nand also bows, a weapon for tards… full of those tall pointy ears salad eaters…"
		
		};
	
	public static String getEntityCitySpeech(int cityNumber){
		return entityCitySpeech[cityNumber];
	}
	
	public static String getEntityCitySpeech(EntityPlayer p){
		return p.getEntityCitySpeech(p.getEntityCity());
	}
	
	public static String[][] entityStateAndDisplay = {
			{
				"1","2","3","4","5","6","7","8"
			},
			{
				"flee","","","","","","",""
			}
	};
	
	public static String [] pactionsTavern =
		{
			"Find a quest",	"Fight", "Flee","Take a look around","Eat",	"Drink","Get drunk","Rest",	"Wait"
		};
	
	public static String [] pactionsBattle =
		{
			"Find a quest",	"Fight", "Flee","Take a look around","Eat",	"Drink","Get drunk","Rest",	"Wait"
		};
	
	public static String [] pactionsCity =
		{
			"Find a quest", "Flee","Take a look around","Wait"
		};
	
	public static String [] pactionsNature =
		{
			"Take a look around","Eat",	"Drink","Get drunk","Rest",	"Wait", "hunt"
		};	
	public static String [] pactionsMovement =
		{
			"Go North",	"Go East", "Go West","Go South"	
		};
}
