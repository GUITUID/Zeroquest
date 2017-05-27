package com.zeroquest.ZeroquestMenu;

import static java.lang.System.out;

import java.util.Random;
import java.util.Scanner;

import com.zeroquest.ZeroquestActions.Actions;
import com.zeroquest.ZeroquestEntities.EntityPlayer;
import com.zeroquest.ZeroquestHelpers.Constants;

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
		 
		if(classChoice==10){
			classChoice=new Random().nextInt(9);
		}

		//TODO check input from user
		EntityPlayer player = new EntityPlayer();
		player.setEntityName(pseudoChoice);
		player.setEntityRace(raceChoice-1);
		player.setEntityClass(classChoice-1);
		player.setEntityCurrentHealth(player.getEntityTotalHealthFromClass(classChoice-1));
		player.setEntityTotalHealth(player.getEntityTotalHealthFromClass(classChoice-1));
		player.setEntityAttack(player.getEntityAttackFromClass(classChoice-1));
		player.setEntityDefense(player.getEntityDefenseFromClass(classChoice-1));
		player.setEntityLevel(1);
		player.setEntityCurrentXp(0);
		player.setEntityTotalXp(100);
		int randomGold = new Random().nextInt(10);
		player.setEntityGold(randomGold);
		player.setEntityStartingCity(player.getEntityRace());
		
		// TODO find a way to save all the player datas in a JSON file even if the EntityPlayer class extends EntityCommon
		// Saving datas to another class and put it all in a new JSON file
		player.entityPlayerDatasToSave(player);

		//TODO write on a json file and next push to Rethinkdb database

		out.println("\n--------------------------------------------------------------------------");
		out.println("|        CONGRATULATION YOUR CHARACTER WAS SUCCESSFULY CREATED           |");
		out.println("--------------------------------------------------------------------------\n");
		out.println("Here are your character information:\n"
				+ "\n\t[Pseudo: " + player.getEntityName()+"]"
				//+ "\nRace:" + p.getERace()//p.getERaceName(getERace())
				+ "\n\t[Race: " + player.getEntityRaceName(player.getEntityRace())+"]"
				//+ "\nClass:" + p.getEClass()//p.getEClassName(getEClass())
				+ "\n\t[Class: " + player.getEntityClassName(player.getEntityClass())+"]"
				+ "\n\n\tStats:"
				+ "\n\t[Level: " + player.getEntityLevel()+"]"	
				+ "\n\t[Xp: " + player.getEntityCurrentXp()+"/" +player.getEntityTotalXp()+"]"
				+ "\n\t[Attack:" + player.getEntityAttack()+"]"	
				+ "\n\t[Defense:" + player.getEntityDefense()+"]"
				+ "\n\t[Health:" + player.getEntityCurrentHealth()+"/" +player.getEntityTotalHealth()+"]"
				+ "\n\t[Gold:" + player.getEntityGold()+"]\n");

		out.println(player.getEntityCitySpeech(raceChoice-1));

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
		
		//Calling action
		Actions.pActions();

	}
}
