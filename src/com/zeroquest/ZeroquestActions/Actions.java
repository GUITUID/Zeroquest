package com.zeroquest.ZeroquestActions;

import static java.lang.System.out;

import com.zeroquest.ZeroquestEntities.EntityMonster;
import com.zeroquest.ZeroquestEntities.EntityPlayer;
import com.zeroquest.ZeroquestHelpers.Constants;
import com.zeroquest.ZeroquestState.PlayerState;
//TODO better action system
public class Actions {    
	
	//Player actions method
    public static void pActions()
    {
        for(int i=0; i!=Constants.pactionsCity.length; i++){
<<<<<<< HEAD
        	 out.print(""+i+")");
        	 out.println(Constants.pactionsCity[i]);
=======
        	 out.print("\n\t"+i+")\n");
        	 out.println(Constants.pactionsCity[i]);
        	 //out.println("\n\t");
>>>>>>> branch 'develop' of https://github.com/MonsieurZad/Zeroquest.git
        }
    }
    
  //environment actions method depending on the player choice
    public static void eActions(int nAction, EntityPlayer p, EntityMonster m)
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
