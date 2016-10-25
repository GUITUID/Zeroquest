package com.zeroquest.ZeroquestActions;

import static java.lang.System.out;

import com.zeroquest.ZeroquestEntities.EntityMonster;
import com.zeroquest.ZeroquestEntities.EntityPlayer;
import com.zeroquest.ZeroquestState.PlayerState;
//TODO better action system
public class Actions {

	//Actions a player can do
    static String [] pactions =
	{
		"\nWhat's your plan?"
		+"1) Find a quest"	
		+"2) Fight"
		+"3) Flee"
		+"4) Take a look"
		+"5) Eat"
		+"6) Drink"
		+"7) Get drunk"
		+"8) Sleep"    
	};
    
  //Player actions method
    static int nActions()
    {
        return pactions.length;
    }
    
	
	//Player actions method
    static void pActions()
    {
        for(int i=0; i!=nActions(); i++){
        	 out.println(pactions[i]);
        }
    }
    
  //environment actions method depending on the player choice
    static void eActions(int nAction, EntityPlayer p, EntityMonster m)
    {	
    	switch (nAction)
    	{
    	case 1:Battle.entitiesBattle(p, m);
    	//Flee from battle
    	case 2:PlayerState.flee(p);
    	//Look at the battle
    	case 3:PlayerState.look(p, null, null);
    	//Eat and recover some health points
    	case 4:PlayerState.eat(p, null);
    	//Drink and recover some mana points
    	case 5:PlayerState.drink(p, null);
    	//Get drunk: provoke a random event
    	case 6:PlayerState.getDrunk(p);
    	//Sleep and recover some health and mana points
    	case 7:PlayerState.sleep(p, null);
    	}
    }
	
}
