package com.zeroquest.ZeroquestMenu;

import static java.lang.System.out;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonWriter.OutputType;
import com.zeroquest.ZeroquestActions.Battle;
import com.zeroquest.ZeroquestEntities.EntityMonster;
import com.zeroquest.ZeroquestEntities.EntityPlayer;
import com.zeroquest.ZeroquestHelpers.Constants;
import com.zeroquest.ZeroquestState.Saving;

public class NewGame {
	/**
	 * Create a new character
	 */
	public static void createCharacter() {
	Scanner scanner = new Scanner(System.in);

		out.println("--------------------------------------------------------------------------");
		out.println("|                     ~~ CHARACTER CREATION ~~                           |");
		out.println("--------------------------------------------------------------------------");
		out.println("--------------------------------------------------------------------------");
		out.println("|                      CHOSE YOUR NICKNAME                               |");
		out.println("--------------------------------------------------------------------------");
		out.println("Please write your nickname:");
		//TODO test response
		String pseudoChoice = scanner.next();
		//TODO check input from user
		//out.println(RaceChoice);
		out.println("--------------------------------------------------------------------------");
		out.println("|                            PICK A RACE                                 |");
		out.println("--------------------------------------------------------------------------");
		out.println("Please pick a race:\n"
				+ "\n\t[Info: New races will be implemented later]\n");

		int currentRaceNumber=0;

		while(currentRaceNumber<Constants.getActualAvailableRaces()){
			out.println("\n\t"+(currentRaceNumber+1)+")"+ Constants.getEntityRaceName(currentRaceNumber) +"\n"
					+ "\t"+ Constants.getEntityRaceSpeech(currentRaceNumber) +"\n");
			currentRaceNumber=currentRaceNumber+1;
		}

		int raceChoice = scanner.nextInt();


		//TODO check input from user
		out.println("--------------------------------------------------------------------------");
		out.println("|                           PICK A CLASS                                 |");
		out.println("--------------------------------------------------------------------------");
		out.println("Please pick a class:\n"
				+ "\n\t[Info: New classes will be implemented later]\n");

		int currentClassNumber=0;

		while(currentClassNumber<Constants.getActualAvailableRaces()){
			out.println("\n\t"+(currentClassNumber+1)+")"+ Constants.getEntityClassName(currentClassNumber) +"\n"
					+ "\tAttack:"+ Constants.getEntityClassAttack(currentClassNumber)+"|Defense:"+ Constants.getEntityClassDefense(currentClassNumber)+"|Health:"+ Constants.getEntityClassHealthPoints(currentClassNumber) +"\n"
					+ "\t"+ Constants.getEntityClassSpeech(currentClassNumber) +"\n");
			currentClassNumber=currentClassNumber+1;
		}

		out.println( "\n\t10)Random\n");

		int classChoice = scanner.nextInt();
		//TODO check input from user

		EntityPlayer p = new EntityPlayer();
		p.setEntityName(pseudoChoice);
		p.setEntityRace(raceChoice-1);
		p.setEntityClass(classChoice-1);
		p.setEntityCurrentHealth(p.getEntityTotalHealthFromClass(classChoice-1));
		p.setEntityTotalHealth(p.getEntityTotalHealthFromClass(classChoice-1));
		p.setEntityAttack(p.getEntityAttackFromClass(classChoice-1));
		p.setEntityDefense(p.getEntityDefenseFromClass(classChoice-1));
		p.setEntityLevel(1);
		p.setEntityCurrentXp(0);
		p.setEntityTotalXp(100);
		int randomGold = new Random().nextInt(10);
		p.setEntityGold(randomGold);
		p.setEntityStartingCity(p.getEntityRace());

		//Create a new json file for saving character status
		Json playerDatas = new Json();
		playerDatas.setOutputType(OutputType.json);

		//saving newly created character in a json format
		try {
			Saving.saveFile(pseudoChoice, playerDatas.prettyPrint(p), "character");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			out.println("Error: error when creating character file");
			e1.printStackTrace();
		}

		//TODO write on a json file and next push to Rethinkdb database

		out.println("--------------------------------------------------------------------------");
		out.println("|        CONGRATULATION YOUR CHARACTER WAS SUCCESSFULY CREATED           |");
		out.println("--------------------------------------------------------------------------");
		out.println("Here are your character information:\n"
				+ "\n\t[Pseudo: " + p.getEntityName()+"]"
				//+ "\nRace:" + p.getERace()//p.getERaceName(getERace())
				+ "\n\t[Race: " + p.getEntityRaceName(p.getEntityRace())+"]"
				//+ "\nClass:" + p.getEClass()//p.getEClassName(getEClass())
				+ "\n\t[Class: " + p.getEntityClassName(p.getEntityClass())+"]"
				+ "\n\n\tStats:"
				+ "\n\t[Level: " + p.getEntityLevel()+"]"	
				+ "\n\t[Xp: " + p.getEntityCurrentXp()+"/" +p.getEntityTotalXp()+"]"
				+ "\n\t[Attack:" + p.getEntityAttack()+"]"	
				+ "\n\t[Defense:" + p.getEntityDefense()+"]"
				+ "\n\t[Health:" + p.getEntityCurrentHealth()+"/" +p.getEntityTotalHealth()+"]"
				+ "\n\t[Gold:" + p.getEntityGold()+"]\n");
		
		out.println(p.getEntityCitySpeech(raceChoice-1));

		//TODO implements the rest of newgame
		//Starting cities already implemented to link with actions system
		//out.println(Constants.getEntityStartingCitySpeech(p));
		//out.println("\nWhat's your plans ?");

		//Battle system works with these parameters 
		//EntityMonster monster = new EntityMonster();
		//out.println("A "+monster.getEntityName()+" appears on your way");
		

		//pchoice(player,m);

		//Battle.entitiesBattle(p,monster);

		scanner.close();

	}
}
