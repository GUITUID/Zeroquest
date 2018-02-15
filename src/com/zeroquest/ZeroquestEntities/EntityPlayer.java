package com.zeroquest.ZeroquestEntities;
import static java.lang.System.out;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonWriter.OutputType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.zeroquest.ZeroquestState.SaveGame;

public class EntityPlayer extends EntityCommon 
{
	//Starting city depending on players race choice
	static int startingCity;

	//Actions a player can do
	static String [] playerActions =
		{
				"\nWhat do you want to do ?", "1) Fight", "2) Flee", "3) Look at", "4) Eat", "5) Drink", "6) Search for loot", "7) Sleep"
		};

	//Speech when player hits
	static String [] playerHitSpeech =
		{
				"You deserved it!", "Take that in your face!", "You seem to be tired...", "Aint' no more laughing did ya ?",
				"That's how you do it!", "That'll teach you no to piss me off!"
		};

	//Speech when player kills
	static String [] playerKillSpeech =
		{
				" are loosers", " sucks", " are poop"
		};

	//Player hit speech method
	public void playerHitSpeech()
	{
		int randomSpeech = new Random().nextInt(6);
		out.println(playerHitSpeech[randomSpeech]);
	}

	//Player hit speech method
	public void playerVictorySpeech()
	{
		int randomSpeech = new Random().nextInt(4);
		out.println(playerKillSpeech[randomSpeech]);
	}

	//player defense method
	public int playerDefense(EntityPlayer player)
	{
		int playerDefense = 0;
		for(int i=0; i!=player.getEntityDefense(); i++)
		{
			int randomDice = new Random().nextInt(6);
			if(heroquestDiceType[randomDice]=="Shield")
			{
				playerDefense++;
			}
		}
		return playerDefense;
	}
	
	public void entityPlayerDatasToSave(EntityPlayer player){
		PlayerDatas entityDatasToSave = new PlayerDatas();
		
		// Datas for identifying the player
		entityDatasToSave.setplayerDataToSaveName(player.getEntityName());
		entityDatasToSave.setplayerDataToSaveClass(player.getEntityClass());
		entityDatasToSave.setplayerDataToSaveRace(player.getEntityRace());
		entityDatasToSave.setplayerDataToSavePortrait(player.getEntityPortrait());
		entityDatasToSave.setplayerDataToSaveLevel(player.getEntityLevel());
		
		// Datas for checking if the player is drunk or not
		entityDatasToSave.setplayerDataToSaveAlcoholLevel(player.getEntityAlcoholLevel());
		entityDatasToSave.setplayerDataToSaveAlcoholResistance(player.getEntityAlcoholResistance());
		
		// Datas for positionning the player in the game world
		entityDatasToSave.setplayerDataToSaveMap(player.getEntityMap());
		entityDatasToSave.setplayerDataToSaveXPosition(player.getEntityXPosition());
		entityDatasToSave.setplayerDataToSaveYPosition(player.getEntityYPosition());
		
		// Datas for battle
		entityDatasToSave.setplayerDataToSaveAttack(player.getEntityAttack());
		entityDatasToSave.setplayerDataToSaveDefense(player.getEntityDefense());
		entityDatasToSave.setplayerDataToSaveCurrentHealth(player.getEntityCurrentHealth());
		entityDatasToSave.setplayerDataToSaveTotalHealth(player.getEntityTotalHealth());
		
		// Datas for experience status
		entityDatasToSave.setplayerDataToSaveCurrentXp(player.getEntityCurrentXp());
		entityDatasToSave.setplayerDataToSaveTotalXp(player.getEntityTotalXp());
		
		entityDatasToSave.setplayerDataToSaveGold(player.getEntityGold());
		
		// Data to get the player state (Drunk, sleeping...)
		entityDatasToSave.setplayerDataToSaveState(player.getEntityState());
		
		// --------------------------------------------------------------
        // | The method in comment below will only save non empty datas |
        // --------------------------------------------------------------
		// [START]
        //Gson gson = new GsonBuilder().setPrettyPrinting().create();
		//String jsonToSave = json.prettyPrint(entityDatasToSave);
		// [END]

        // ----------------------------------------------------------------------------------------
        // | The method in comment below will save all datas from a character even the empty ones |
        // ----------------------------------------------------------------------------------------
		// [START]
        Gson gson = new Gson();
        String jsonToSave = gson.toJson(entityDatasToSave);
        // [END]   
        
        Json json = new Json();
    	json.setOutputType(OutputType.json);
		
		// saving datas in a new JSON file with the name of the player character
			try {
				SaveGame.saveFile(entityDatasToSave.getplayerDataToSaveName(), jsonToSave, "character");
			} catch (IOException e) {
				System.out.println("Error: error when creating character file");
				e.printStackTrace();
			}
		
	}
	
	// TODO implement method to load a saving profile
	
	public void entityPlayerDatasToLoad(){
		
	}

}
