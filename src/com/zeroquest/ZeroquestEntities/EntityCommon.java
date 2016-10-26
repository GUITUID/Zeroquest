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

import com.zeroquest.ZeroquestHelpers.Constants;

import static java.lang.System.out;

public class EntityCommon {

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
	//Entity Map, map where the entity is
	private String entityMap;
	//Entity City, city where the entity is
	private String entityCity;
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
	//Entity Starting City
	private int entityStartingCity;



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
	//retunr entity race name
	public String getEntityRaceName(int entityRace)
	{
		return Constants.entityRaceNames[entityRace];
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
	//retunr entity class name
	public String getEntityClassName(int entityClass)
	{	
		return Constants.entityClassNames[entityClass];
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

	public void setEntityMap(String entityMapIn)
	{
		entityMap = entityMapIn;
	}
	public String getEntityMap()
	{
		return entityMap;
	}

	public void setEntityCity(String entityCityIn)
	{
		entityCity = entityCityIn;
	}
	public String getEntityCity()
	{
		return entityCity;
	}

	//Entity defense & attack
	public void setEntityAttack(int entityAttackIn)
	{
		
		//entityAttack = classStatistics[0][entityAttackIn];
	}
	public int getEntityAttackValue()
	{
		return entityAttack;
	}

	public void setEntityDefense(int entityDefenseIn)
	{
		//entityDefense = classStatistics[1][entityDefenseIn];
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
		//entityCurrentHealth = classStatistics[2][entityCurrentHealthIn];
	}
	public int getEntityCurrentHealth()
	{
		return entityCurrentHealth;
	}

	public void setEntityTotalHealth(int entityTotalHealthIn)
	{
		//entityTotalHealth = classStatistics[2][entityTotalHealthIn];
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

	//Entity Gold
	public void setEntityGold(int entityGoldIn)
	{
		entityGold = entityGoldIn;
	}
	public int getEntityGold()
	{
		return entityGold;
	}

	//Entity Starting City
	public void setEntityStartingCity(EntityPlayer p)
	{	
		entityStartingCity=p.getEntityRace();

	}
	//Entity Starting City
	public int getEntityStartingCity()
	{	
		return entityStartingCity;

	}
	//return starting city speech
	public void getEntityCitySpeech(int entityCity)
	{
		//return entityStartingCity[entityCity];
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
	 * <table>
	 * <tl>
	 * <td>Shield</td><td>Shield</td><td>Skull</td><td>Skull</td><td>Ennemy Shield</td><td>Skull</td></tl>
	 * <tl><td>0</td><td>1</td><td>2</td><td>3</td><td>4</td><td>5</td>
	 * </tl>
	 * </table>
	 */
	protected static String [] heroquestDiceType = 
		{
				"Shield", "Shield", "Skull", "Skull", "Ennemy Shield", "Skull"
		};

	/**
	 * Method that set the health lost during a battde or an event <br/>
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