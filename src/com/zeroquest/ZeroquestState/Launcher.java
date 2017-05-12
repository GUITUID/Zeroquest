package com.zeroquest.ZeroquestState;

import static java.lang.System.out;

import javax.swing.JOptionPane;

import com.zeroquest.ZeroquestMenu.Menu;
/**
 * Launcher first call the intro (splashscreen) and then call the menu 
 * @author Zadwarf
 * @version 0.28102016
 * 
 */
public class Launcher {
	/**
	 * Launch the intro (splashscreen) and menu
	 */
	public void start()
	{
		// Standard UI design
		//JOptionPane.showMessageDialog(null,"Welcome to Zeroquest");
		
		// Console UI
		out.println("\n--------------------------------------------------------------------------");
		out.println("|                      ~~ WELCOME TO ZEROQUEST ~~                        |");
		out.println("--------------------------------------------------------------------------\n");
		//Calling Splashscreen
		State.intro();
		//Calling Menu
		Menu.menu();
	}

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String args [])
	{
		Launcher launcher=new Launcher();
		launcher.start();
	}
	
}
