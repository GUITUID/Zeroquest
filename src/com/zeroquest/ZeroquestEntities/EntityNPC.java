package com.zeroquest.ZeroquestEntities;
import java.util.Random;

public class EntityNPC extends EntityCommon {

//player defense method
int pnjDef(EntityNPC pnj)
    {
	    int a = 0;
		for(int i=0; i!=pnj.getEntityDefense(); i++)
	            {
	                int randomDice = new Random().nextInt(6);
	                if(heroquestDiceType[randomDice]=="Shield")
			            {
			                a++;
						}
	            }
		return a;
    }

	}
