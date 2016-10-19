package com.zeroquest.ZeroquestEntities;
import static java.lang.System.out;

import java.util.Random;

public class Player extends CommonEntity 
    {
	
    //Actions a player can do
    static String [] playerActions =
	{
		"\nWhat do you want to do ?", "1) Fight", "2) Flee", "3) Look at", "4) Eat", "5) Drink", "6) Search for loot", "7) Sleep"
    };

    //Speech when player hits
    static String [] playerHitSpeech =
	{
     		"You deserved it!", "Take that in your face!", "You seem to be tired...", "Tu fais moins le malin là , non ?",
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
	public int playerDefense(Player player)
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

    }
