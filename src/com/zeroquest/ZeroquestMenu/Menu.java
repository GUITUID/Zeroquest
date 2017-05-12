package com.zeroquest.ZeroquestMenu;

import static java.lang.System.out;

import java.util.Scanner;

import javax.swing.JOptionPane;

import com.zeroquest.ZeroquestState.State;
/**
 * Stores the menu options and actions to do when one option is selected <br/>
 * @author Zadwarf
 *
 */
public class Menu {
	
	public static void menu() {
		
			// Standard UI design
		    //String[] options = new String[] {"New game", "Load Game", "Multiplayer", "Quit"};
		    //int menuChoice = JOptionPane.showOptionDialog(null, "Menu", "Menu",
		            //JOptionPane.PLAIN_MESSAGE, 0, null, options, options[0]);

		    // Where response == 0 for Yes, 1 for No, 2 for Maybe and -1 or 3 for Escape/Cancel.

		
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
    		LoadGame.loadCharacter();
    		
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
