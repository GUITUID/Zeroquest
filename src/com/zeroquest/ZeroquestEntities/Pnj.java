package com.zeroquest.ZeroquestEntities;
import java.util.Random;

public class Pnj extends CommonEntity {

//player defense method
int pnjDef(Pnj pnj)
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
