/**
 * --------------------------------------------------------------------------
 * ||||||| |||||  ||||||    ||||     ||||     ||   || ||||||  ||||| ||||||||
 *      || ||     ||   || ||    || ||    ||   ||   || ||     ||        ||
 *   |||   ||||   |||||   ||    || ||    ||   ||   || ||||     ||      ||
 * ||      ||     ||  ||  ||    || ||   |||   ||   || ||         ||    ||
 * ||||||| |||||  ||   ||   ||||     ||||||    |||||  |||||| |||||     || 
 * --------------------------------------------------------------------------
 * 
 * Author: MrZadwarf - http://monsieurzad.blogspot.fr/
 * Description: Heroquest like textual game, it will be updated with graphics contents to become a rogue like game.
 * This project will be used as a tutorial for creating a video game in Java from a to z.
 * 
 * Years: 2014-2016 
 *
 * Version: dev.13102016 
 *  
 */
package com.zeroquest.ZeroquestEntities;
import java.util.Random;

import static java.lang.System.out;

public class CommonEntity {

	//----------------------------------------
	//|       VARIABLES & CONSTANTS          |
	//----------------------------------------	
	//Entity name
	private String entityName;
	//Entity class
	private int entityRace;
	//Entity class
	private int entityClass;
	//Entity level
	private int entityLevel;
	//Entity current experience points
	private int entityCurrentXp;
	//Entity total experience points
	private int entityTotalXp;
	//Entity horizontal position
	private int entityXPosition;
	//Entity vertical position
	private int entityYPosition;
	//Entity attack dice
	private int entityAttack;
	//Entity defense dice
	private int entityDefense;
	//Entity alcohol level
	private int entityAlcoholLevel;
	//Entity alcohol resistance
	private int entityAlcoholResistance;
	//Entity current health points
	private int entityCurrentHealth;
	//Entity total health points
	private int entityTotalHealth;
	//Entity State
	private static String entityState;
	//Entity Portrait
	private String entityPortrait;
	//Entity Token
	private String entityToken;
	//Entity Gold
		private int entityGold;

	//List of classes stats
	protected static int[][] classStatistics = 
		{
				{ //Attack dices 0
					3,2,5
				},
				{ //Defense dices 1
					3,5,2
				},
				{ //Health points 2
					10,12,12
				}
		};

	//----------------------------------------
	//|         GET & SET METHODS            |
	//----------------------------------------	
	//Entity name
	public void setEntityName(String entityNameIn)
	{
		entityName = entityNameIn;
	}
	public String getEntityName()
	{
		return entityName;
	}

	//Entity race
	public void setEntityRace(int entityRaceIn) {
		if(entityRaceIn!=9){
			entityRace = entityRaceIn;
		}else if(entityRaceIn==9){
			int randomRace = new Random().nextInt(3);
			entityRace = randomRace;
		}

	}
	public int getEntityRace() {
		return entityRace;
	}
	public String getEntityRaceName(Player p)
	{
		String [] entityRaceNames =
			{
					"Human", "Dwarf", "Elf"
			};

		return entityRaceNames[p.getEntityRace()];
	}

	//Entity class
	public void setEntityClass(int entityClassIn)
	{
		if(entityClassIn!=9){
			entityClass = entityClassIn;
		}else if(entityClassIn==9){
			int randomClass = new Random().nextInt(3);
			entityClass = randomClass;
		}
	}
	public int getEntityClass()
	{
		return entityClass;
	}
	public String getEntityClassName(Player p)
	{
		//Names of classes
		String [] entityClassNames =
			{
					"Warrior", "Paladin", "Barbarian"
			};

		return entityClassNames[p.getEntityClass()];
	}

	//Entity level
	public void setEntityLevel(int entityLevelIn)
	{
		entityLevel = entityLevelIn;
	}
	public int getEntityLevel()
	{
		return entityLevel;
	}

	//Entity experience
	public void setEntityCurrentXp(int entityCurrentXpIn)
	{
		entityCurrentXp = entityCurrentXpIn;
	}
	public int getEntityCurrentXp()
	{
		return entityCurrentXp;
	}

	public void setEntityTotalXp(int entityTotalXpIn)
	{
		entityTotalXp = entityTotalXpIn;
	}
	public int getEntityTotalXp()
	{
		return entityTotalXp;
	}

	//Entity position
	public void setEntityXPosition(int entityXPositionIn)
	{
		entityXPosition = entityXPositionIn;
	}
	public int getEntityXPosition()
	{
		return entityXPosition;
	}

	public void setEntityYPosition(int entityYPositionIn)
	{
		entityYPosition = entityYPositionIn;
	}
	public int getEntityYPosition()
	{
		return entityYPosition;
	}

	//Entity defense & attack
	public void setEntityAttack(int entityAttackIn)
	{

		entityAttack = classStatistics[0][entityAttackIn];
	}
	public int getEntityAttackValue()
	{
		return entityAttack;
	}

	public void setEntityDefense(int entityDefenseIn)
	{
		entityDefense = classStatistics[1][entityDefenseIn];
	}
	public int getEntityDefense()
	{
		return entityDefense;
	}

	//Entity alcohol system points
	public int getEntityAlcoholLevel() {
		return entityAlcoholLevel;
	}
	public void setEntityAlcoholLevel(int entityAlcoholLevelIn) {
		entityAlcoholLevel = entityAlcoholLevelIn;
	}

	public int getEntityAlcoholResistance() {
		return entityAlcoholResistance;
	}

	public void setEntityAlcoholResistance(int entityAlcoholResistanceIn) {
		entityAlcoholResistance = entityAlcoholResistanceIn;
	}
	//Entity health points
	public void setEntityCurrentHealth(int entityCurrentHealthIn)
	{	

		entityCurrentHealth = classStatistics[2][entityCurrentHealthIn];
	}
	public int getEntityCurrentHealth()
	{
		return entityCurrentHealth;
	}

	public void setEntityTotalHealth(int entityTotalHealthIn)
	{
		entityTotalHealth = classStatistics[2][entityTotalHealthIn];
	}
	public int getEntityTotalHealth()
	{
		return entityTotalHealth;
	}

	public String getEntityState() {
		return entityState;
	}   
	public void setEntityState(String entityStateIn) {
		entityState = entityStateIn;
	}

	//Entity portrait
	public void setEntityPortrait(String entityPortraitIn)
	{
		entityPortrait = entityPortraitIn;
	}
	public String getEntityPortrait()
	{
		return entityPortrait;
	}
	
	
	
	//Entity level
		public void setEntityGold(int entityGoldIn)
		{
			entityGold = entityGoldIn;
		}
		public int getEntityGold()
		{
			return entityGold;
		}

	/**
	 * Method that sets the entity token path, depending on class and race chosen by the player<br/>
	 * @param entityTokenIn
	 */
	public void setEntityToken(String entityTokenIn)
	{
		entityToken = entityTokenIn;
	}
	/**
	 * Method that return the path of the entity token <br/>
	 * @return entityToken
	 */
	public String getEntityToken()
	{
		return entityToken;
	}


	//----------------------------------------
	//|           OTHER METHODS              |
	//----------------------------------------

	/**
	 * Heroquest dice type:<br/> 
	 * "Shield", "Shield", "Skull", "Skull", "Ennemy Shield", "Skull"
	 */
	protected static String [] heroquestDiceType = 
		{
				"Shield", "Shield", "Skull", "Skull", "Ennemy Shield", "Skull"
		};

	/**
	 * Method that set the health lost during a battle or an event <br/>
	 * @param healthLost
	 */
	public void entityLoseHealth(int healthLost)
	{
		setEntityCurrentHealth(getEntityCurrentHealth()-healthLost);
		out.println(getEntityName()+" "+getEntityCurrentHealth()+"/"+getEntityTotalHealth());
	}

	/**
	 * Method that return the attack score of an entity <br/>
	 * @return numberOfAttackDice
	 */
	public int entityAttack()
	{
		int numberOfAttackDice = 0;

		for(int i=0; i!=getEntityAttackValue(); i++)
		{
			int randomDice = new Random().nextInt(6);
			if(heroquestDiceType[randomDice]=="Skull")
			{
				numberOfAttackDice++;
			}
		}
		return numberOfAttackDice;
	}
	
}