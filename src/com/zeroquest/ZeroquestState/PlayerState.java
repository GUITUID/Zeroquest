package com.zeroquest.ZeroquestState;
import static java.lang.System.out;

import com.zeroquest.ZeroquestEntities.EntityMonster;
import com.zeroquest.ZeroquestEntities.EntityObject;
import com.zeroquest.ZeroquestEntities.EntityPlayer;
import com.zeroquest.ZeroquestWorld.Place;

public class PlayerState {

	

	public static void flee(EntityPlayer player) {
		player.setEntityState("flee.");
	}

	public static void eat(EntityPlayer player, EntityObject object) {
		player.setEntityState("eat" + object.getObjectName());
	}
	
	public static void drink(EntityPlayer player, EntityObject object)
	{
		if(player.getEntityAlcoholResistance()<player.getEntityAlcoholLevel()){
			getDrunk(player);
		}else{
			player.setEntityState("drink" + object.getObjectName());
			player.setEntityAlcoholLevel(player.getEntityAlcoholLevel()+object.OAlcStat());
		}
	}
	
	public static void getDrunk(EntityPlayer player)
	{
		player.setEntityState("is totally drunk.");
	}
	
	public static void dead(EntityPlayer player)
	{
		player.setEntityState("is dead.");
	}
	
	public static void look(EntityPlayer player, EntityObject object, Place place)
	{
		if(object!=null){
			player.setEntityState("look at" + object.getObjectName());
		}else if (place!=null){
			player.setEntityState("look at" + place.getPlaceName());
		}
	}
	
	public static void sleep(EntityPlayer player, Place place)
	{
		player.setEntityState("is asleep");
	}
	
	public static void deepsleep(EntityPlayer player, Place place)
	{
		player.setEntityState("is deeply asleep");
	}
	
	public static void poisoned(EntityPlayer player)
	{
		player.setEntityState("is poisoned");
	}
	
	public static void sick(EntityPlayer player)
	{
		player.setEntityState("is sick");
	}
	
	/**
	 * 
	 * @param playerState
	 */
	static void playerState(int playerState)
	{
		for(int i=0; i!=6; i++){
			//out.println(pactions[i]);
		}
	}

	//Player actions method
	//static int nActions()
	//{
	//return pactions.length;
	//}


	//Player actions method
	static void playerActions()
	{
		//for(int i=0; i!=nActions(); i++){
		//out.println(pactions[i]);
		//}
	}
	
	public void playerChoseToFight(EntityPlayer player, EntityMonster monster)
	{
		out.println(player.getEntityName()+" face a "+monster.getEntityName());

		playerActions();
		out.println("----------------------------");
	}
		
}
