package com.zeroquest.ZeroquestActions;

import static java.lang.System.out;

import com.zeroquest.ZeroquestEntities.EntityMonster;
import com.zeroquest.ZeroquestEntities.EntityPlayer;
import com.zeroquest.ZeroquestHelpers.Constants;
import com.zeroquest.ZeroquestState.PlayerState;
//TODO better action system
public class Actions {    
	
	//Displays player actions available in cities
	/*
	 * "Find a quest", "Flee","Take a look around","Wait"
	 */
    public static void pShowActionsCity()
    {
        for(int i=0; i!=Constants.pactionsCity.length; i++){

        	 out.print("\n\t"+(i)+")");
        	 out.print(" "+Constants.pactionsCity[i]);
        	 //out.println("\n\t");

        }
    }
    
	//Sets player actions available in cities
    public static void pActionsCity(int nAction, EntityPlayer player)
    {
        	switch (nAction)
        	{
        	//Find a quest
        	//case 0:Battle.entitiesBattle(p, m);
        	//Flee from battle
        	case 1:PlayerState.flee(player);
        	break;
        	//Look at the battle
        	case 2:PlayerState.look(player, null, null);
        	break;
        	//Eat and recover some health points
        	case 3:PlayerState.wait(player);
        	break;
        	//default
        	default:PlayerState.wait(player);
        	break;
        	}
        } 
    
  //Displays player actions available in nature
    public static void pShowActionsNature()
    {
        for(int i=0; i!=Constants.pactionsNature.length; i++){

        	 out.print("\n\t"+(i)+")");
        	 out.print(" "+Constants.pactionsNature[i]);
        	 //out.println("\n\t");

        }
    }
    
  //Displays player actions available in nature
    public static void pShowActionsTavern()
    {
        for(int i=0; i!=Constants.pactionsTavern.length; i++){

        	 out.print("\n\t"+(i+1)+")");
        	 out.print(" "+Constants.pactionsTavern[i]);
        	 //out.println("\n\t");

        }
    }
    
  //Displays player actions available in nature
    public static void pShowActionsBattle()
    {
        for(int i=0; i!=Constants.pactionsBattle.length; i++){

        	 out.print("\n\t"+(i)+")");
        	 out.print(" "+Constants.pactionsBattle[i]);
        	 //out.println("\n\t");

        }
    }
    
  //Displays player actions available in nature
    public static void pShowActionsMovement()
    {
        for(int i=0; i!=Constants.pactionsMovement.length; i++){

        	 out.print("\n\t"+(i)+")");
        	 out.print(" "+Constants.pactionsMovement[i]);
        	 //out.println("\n\t");

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
