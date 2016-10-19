package com.zeroquest.ZeroquestState;

import static java.lang.System.out;

import com.zeroquest.ZeroquestEntities.Monster;
import com.zeroquest.ZeroquestEntities.Player;

public class Battle {

	public static void entitiesBattle(Player player, Monster monster)
	{
		out.println(monster.getEntityName()+" attack "+player.getEntityName());

		while(player.getEntityCurrentHealth()>0||monster.getEntityCurrentHealth()>0)
		{
			int monsterAttack=monster.entityAttack();
			int playerDefense=player.playerDefense(player);
			int playerGetHitXTimes=monsterAttack-playerDefense;

			if(playerGetHitXTimes>0)
			{
				out.println(monster.getEntityName() +" attack "+ monsterAttack +" times.");
				out.println(player.getEntityName() +" defend "+ playerDefense +" times.");
				out.println(player.getEntityName() +" is hit "+ playerGetHitXTimes +" times.");
				player.entityLoseHealth(playerGetHitXTimes);

				if(player.getEntityCurrentHealth()<=0)
				{
					out.println(player.getEntityName() + " is dead.");
					out.println("----------------------------");
					out.print("GM says:"
							+ " You suck...");
					break;
				}
			}
			else
			{
				out.println(player.getEntityName() +" parried the attack.");
			}

			out.println("----------------------------");

			int playerAttack=player.entityAttack();
			int monsterDefense=monster.monsterDefense(monster);
			int monsterGetHitXTimes=playerAttack-monsterDefense;

			if(monsterGetHitXTimes>0)
			{
				out.println(player.getEntityName() +" attack "+ playerAttack +" times.");
				out.println(monster.getEntityName() +" defend "+ monsterDefense +" times.");
				out.println(monster.getEntityName() + " is hit "+ monsterGetHitXTimes +" times.");
				out.print(player.getEntityName() + " says: ");
				player.playerHitSpeech();
				monster.entityLoseHealth(monsterGetHitXTimes);

				if(monster.getEntityCurrentHealth()<=0)
				{
					out.println("----------------------------");
					out.println(monster.getEntityName() + " is dead.");
					out.print(player.getEntityName() + " says: " +monster.getEntityName()+"s");player.playerVictorySpeech();

					break;
				}
			}
			else
			{
				out.println(monster.getEntityName() + " parried the attack.");
			}

			out.println("----------------------------");

		}

	}
}