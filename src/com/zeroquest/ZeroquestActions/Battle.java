package com.zeroquest.ZeroquestActions;

import static java.lang.System.out;

import com.zeroquest.ZeroquestEntities.EntityMonster;
import com.zeroquest.ZeroquestEntities.EntityPlayer;

public class Battle {

	public static void entitiesBattle(EntityPlayer p, EntityMonster m)
	{
		out.println(m.getEntityName()+" attacks "+p.getEntityName());

		while(p.getEntityCurrentHealth()>0||m.getEntityCurrentHealth()>0)
		{
			int monsterAttack=m.entityAttack();
			int playerDefense=p.playerDefense(p);
			int playerGetHitXTimes=monsterAttack-playerDefense;

			if(playerGetHitXTimes>0)
			{
				out.println(m.getEntityName() +" attacks "+ monsterAttack +" times.");
				out.println(p.getEntityName() +" defends "+ playerDefense +" times.");
				out.println(p.getEntityName() +" is hit "+ playerGetHitXTimes +" times.");
				p.entityLoseHealth(playerGetHitXTimes);

				if(p.getEntityCurrentHealth()<=0)
				{
					out.println(p.getEntityName() + " is dead.");
					out.println("----------------------------");
					out.print("GM says:"
							+ " You suck...");
					break;
				}
			}
			else
			{
				out.println(p.getEntityName() +" parried the attack.");
			}

			out.println("----------------------------");

			int playerAttack=p.entityAttack();
			int monsterDefense=m.monsterDefense(m);
			int monsterGetHitXTimes=playerAttack-monsterDefense;

			if(monsterGetHitXTimes>0)
			{
				out.println(p.getEntityName() +" attacks "+ playerAttack +" times.");
				out.println(m.getEntityName() +" defends "+ monsterDefense +" times.");
				out.println(m.getEntityName() + " is hit "+ monsterGetHitXTimes +" times.");
				out.print(p.getEntityName() + " says: ");
				p.playerHitSpeech();
				m.entityLoseHealth(monsterGetHitXTimes);

				if(m.getEntityCurrentHealth()<=0)
				{
					out.println("----------------------------");
					out.println(m.getEntityName() + " is dead.");
					out.print(p.getEntityName() + " says: " +m.getEntityName()+"s");p.playerVictorySpeech();

					break;
				}
			}
			else
			{
				out.println(m.getEntityName() + " parried the attack.");
			}

			out.println("----------------------------");

		}

	}
}