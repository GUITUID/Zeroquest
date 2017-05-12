package com.zeroquest.ZeroquestEntities;

import java.util.Random;

import com.zeroquest.ZeroquestHelpers.Constants;

/**
 * 
 * This is a class we will use only for saving and loading player datas, 
 * all the parameters are set to public in order to be able to save them in a JSON file 
 * (it didn't works if the parameters are static or private)
 * 
 * @author Zadwarf
 */
public class PlayerDatas {
	
	//----------------------------------------
		//|       VARIABLES & CONSTANTS          |
		//----------------------------------------	
		//playerDataToSave name
		public  String playerDataToSaveName;
		//playerDataToSave class
		public  int playerDataToSaveRace;
		//playerDataToSave class
		public  int playerDataToSaveClass;
		//playerDataToSave level
		public  int playerDataToSaveLevel;
		//playerDataToSave current experience points
		public  int playerDataToSaveCurrentXp;
		//playerDataToSave total experience points
		public  int playerDataToSaveTotalXp;
		//playerDataToSave Map, map where the playerDataToSave is
		public  String playerDataToSaveMap;
		//playerDataToSave City, city where the playerDataToSave is
		public  int playerDataToSaveCity;
		//playerDataToSave horizontal position
		public  int playerDataToSaveXPosition;
		//playerDataToSave vertical position
		public  int playerDataToSaveYPosition;
		//playerDataToSave attack dice
		public  int playerDataToSaveAttack;
		//playerDataToSave defense dice
		public  int playerDataToSaveDefense;
		//playerDataToSave alcohol level
		public  int playerDataToSaveAlcoholLevel;
		//playerDataToSave alcohol resistance
		public  int playerDataToSaveAlcoholResistance;
		//playerDataToSave current health points
		public  int playerDataToSaveCurrentHealth;
		//playerDataToSave total health points
		public  int playerDataToSaveTotalHealth;
		//playerDataToSave State
		public  String playerDataToSaveState;
		//playerDataToSave Portrait
		public  String playerDataToSavePortrait;
		//playerDataToSave Token
		public  String playerDataToSaveToken;
		//playerDataToSave Gold
		public  int playerDataToSaveGold;
		//playerDataToSave Starting City
		public  int playerDataToSaveStartingCity;
		
		//----------------------------------------
		//|         GET & SET METHODS            |
		//----------------------------------------	
		//playerDataToSave name
		public void setplayerDataToSaveName(String playerDataToSaveNameIn)
		{
			playerDataToSaveName = playerDataToSaveNameIn;
		}
		public String getplayerDataToSaveName()
		{
			return playerDataToSaveName;
		}

		//playerDataToSave race
		public void setplayerDataToSaveRace(int playerDataToSaveRaceIn) {
			if(playerDataToSaveRaceIn!=9){
				playerDataToSaveRace = playerDataToSaveRaceIn;
			}else if(playerDataToSaveRaceIn==9){
				int randomRace = new Random().nextInt(3);
				playerDataToSaveRace = randomRace;
			}
		}
		public int getplayerDataToSaveRace() {
			return playerDataToSaveRace;
		}
		//return playerDataToSave race name
		public String getplayerDataToSaveRaceName(int playerDataToSaveRace)
		{
			return Constants.getEntityClassName(playerDataToSaveRace);
		}

		//playerDataToSave class
		public void setplayerDataToSaveClass(int playerDataToSaveClassIn)
		{
			if(playerDataToSaveClassIn!=9){
				playerDataToSaveClass = playerDataToSaveClassIn;
			}else if(playerDataToSaveClassIn==9){
				int randomClass = new Random().nextInt(3);
				playerDataToSaveClass = randomClass;
			}
		}
		public int getplayerDataToSaveClass()
		{
			return playerDataToSaveClass;
		}
		//retunr playerDataToSave class name
		public int getplayerDataToSaveClassName(int playerDataToSaveClass)
		{	
			return playerDataToSaveClass;
		}

		//playerDataToSave level
		public void setplayerDataToSaveLevel(int playerDataToSaveLevelIn)
		{
			playerDataToSaveLevel = playerDataToSaveLevelIn;
		}
		public int getplayerDataToSaveLevel()
		{
			return playerDataToSaveLevel;
		}

		//playerDataToSave experience
		public void setplayerDataToSaveCurrentXp(int playerDataToSaveCurrentXpIn)
		{
			playerDataToSaveCurrentXp = playerDataToSaveCurrentXpIn;
		}
		public int getplayerDataToSaveCurrentXp()
		{
			return playerDataToSaveCurrentXp;
		}

		public void setplayerDataToSaveTotalXp(int playerDataToSaveTotalXpIn)
		{
			playerDataToSaveTotalXp = playerDataToSaveTotalXpIn;
		}
		public int getplayerDataToSaveTotalXp()
		{
			return playerDataToSaveTotalXp;
		}

		//playerDataToSave position
		public void setplayerDataToSaveXPosition(int playerDataToSaveXPositionIn)
		{
			playerDataToSaveXPosition = playerDataToSaveXPositionIn;
		}
		public int getplayerDataToSaveXPosition()
		{
			return playerDataToSaveXPosition;
		}

		public void setplayerDataToSaveYPosition(int playerDataToSaveYPositionIn)
		{
			playerDataToSaveYPosition = playerDataToSaveYPositionIn;
		}
		public int getplayerDataToSaveYPosition()
		{
			return playerDataToSaveYPosition;
		}

		public void setplayerDataToSaveMap(String playerDataToSaveMapIn)
		{
			playerDataToSaveMap = playerDataToSaveMapIn;
		}
		public String getplayerDataToSaveMap()
		{
			return playerDataToSaveMap;
		}
		//playerDataToSave actual city
		public void setplayerDataToSaveCity(int playerDataToSaveCityIn)
		{
			playerDataToSaveCity = playerDataToSaveCityIn;
		}
		public int getplayerDataToSaveCity()
		{
			return playerDataToSaveCity;
		}
		//playerDataToSave starting city
		public void setplayerDataToSaveStartingCity(int playerDataToSaveStartingCityIn)
		{
			playerDataToSaveStartingCity = playerDataToSaveStartingCityIn;
		}
		public int getplayerDataToSaveStartingCity()
		{
			return playerDataToSaveStartingCity;
		}

		//playerDataToSave defense & attack
		public void setplayerDataToSaveAttack(int playerDataToSaveAttackIn)
		{
			playerDataToSaveAttack = playerDataToSaveAttackIn;
		}
		public int getplayerDataToSaveAttack()
		{
			return playerDataToSaveAttack;
		}
		public int getplayerDataToSaveAttackFromClass(int classNumber)
		{
			return classNumber;
		}

		public void setplayerDataToSaveDefense(int playerDataToSaveDefenseIn)
		{
			playerDataToSaveDefense = playerDataToSaveDefenseIn;
		}
		public int getplayerDataToSaveDefense()
		{
			return playerDataToSaveDefense;
		}
		public int getplayerDataToSaveDefenseFromClass(int classNumber)
		{
			return classNumber;
		}

		//playerDataToSave alcohol system points
		public int getplayerDataToSaveAlcoholLevel() {
			return playerDataToSaveAlcoholLevel;
		}
		public void setplayerDataToSaveAlcoholLevel(int playerDataToSaveAlcoholLevelIn) {
			playerDataToSaveAlcoholLevel = playerDataToSaveAlcoholLevelIn;
		}

		public int getplayerDataToSaveAlcoholResistance() {
			return playerDataToSaveAlcoholResistance;
		}

		public void setplayerDataToSaveAlcoholResistance(int playerDataToSaveAlcoholResistanceIn) {
			playerDataToSaveAlcoholResistance = playerDataToSaveAlcoholResistanceIn;
		}
		//playerDataToSave health points
		public void setplayerDataToSaveCurrentHealth(int playerDataToSaveCurrentHealthIn)
		{	
			playerDataToSaveCurrentHealth = playerDataToSaveCurrentHealthIn;
		}
		public int getplayerDataToSaveCurrentHealth()
		{
			return playerDataToSaveCurrentHealth;
		}


		public void setplayerDataToSaveTotalHealth(int playerDataToSaveTotalHealthIn)
		{
			playerDataToSaveTotalHealth = playerDataToSaveTotalHealthIn;
		}
		public int getplayerDataToSaveTotalHealth()
		{
			return playerDataToSaveTotalHealth;
		}
		public int getplayerDataToSaveTotalHealthFromClass(int classNumber)
		{
			return classNumber;
		}

		public String getplayerDataToSaveState() {
			return playerDataToSaveState;
		}   
		public void setplayerDataToSaveState(String playerDataToSaveStateIn) {
			playerDataToSaveState = playerDataToSaveStateIn;
		}

		//playerDataToSave portrait
		public void setplayerDataToSavePortrait(String playerDataToSavePortraitIn)
		{
			playerDataToSavePortrait = playerDataToSavePortraitIn;
		}
		public String getplayerDataToSavePortrait()
		{
			return playerDataToSavePortrait;
		}

		//playerDataToSave Gold
		public void setplayerDataToSaveGold(int playerDataToSaveGoldIn)
		{
			playerDataToSaveGold = playerDataToSaveGoldIn;
		}
		public int getplayerDataToSaveGold()
		{
			return playerDataToSaveGold;
		}

		/**
		 * Method that sets the playerDataToSave token path, depending on class and race chosen by the player<br/>
		 * @param playerDataToSaveTokenIn
		 */
		public void setplayerDataToSaveToken(String playerDataToSaveTokenIn)
		{
			playerDataToSaveToken = playerDataToSaveTokenIn;
		}
		/**
		 * Method that return the path of the playerDataToSave token <br/>
		 * @return playerDataToSaveToken
		 */
		public String getplayerDataToSaveToken()
		{
			return playerDataToSaveToken;
		}

}
