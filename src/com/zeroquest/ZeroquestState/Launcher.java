package com.zeroquest.ZeroquestState;

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
