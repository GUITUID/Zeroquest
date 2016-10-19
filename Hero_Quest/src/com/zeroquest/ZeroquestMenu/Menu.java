package com.zeroquest.ZeroquestMenu;

import static java.lang.System.out;

import java.util.Scanner;

import com.zeroquest.ZeroquestState.State;
/**
 * Stores the menu options and actions to do when one option is selected <br/>
 * @author Zadwarf
 *
 */
public class Menu {
	
	public static void menu() {
		
		out.println("--------------------------------------------------------------------------");
		out.println("|                              MENU                                      |");
		out.println("--------------------------------------------------------------------------");
		
		out.println("\n1)New game \n2)Load Game \n3)Multiplayer \n4)Options \n5)Quit");
		Scanner scanner = new Scanner(System.in);
		int menuChoice = scanner.nextInt();
		
		switch (menuChoice)
    	{
		//If we chose a New Game we will create a new character
    	case 1:
    		NewGame.createCharacter();
    		break;
    	case 2:
    		out.println("Not implemented yet\n");
    		
    		//out.println("Please select a saved game:\n");
    		break;
    	case 3:
    		out.println("No options for this game yet\n");
    		
    		break;
    	case 4:
    		out.println("Coming as soon as possible\n");
    		break;
    	case 5:
    		State.quit();
    		System.exit(0);
    		break;
    	}
		
		scanner.close();
	}
}
