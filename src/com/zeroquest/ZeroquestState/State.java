package com.zeroquest.ZeroquestState;

import com.zeroquest.ZeroquestMenu.Menu;

public class State {
	
	public static void intro() {
		/*out.println("--------------------------------------------------------------------------\n"
		+ "||||||| |||||  ||||||    ||||     ||||     ||   || ||||||  ||||| ||||||||\n"
		+ "     || ||     ||   || ||    || ||    ||   ||   || ||     ||        ||\n"
		+ "  |||   ||||   |||||   ||    || ||    ||   ||   || ||||     ||      ||\n"
		+ "||      ||     ||  ||  ||    || ||   |||   ||   || ||         ||    ||\n"
		+ "||||||| |||||  ||   ||   ||||     ||||||    |||||  |||||| |||||     ||\n"
		+ "--------------------------------------------------------------------------"
		+ ""
		+ "An O'nun'kawa production
		+ ""
		
		
		);*/
		
	
	}
	
	/**
	 * Starts the game
	 */
	public static void titleScreen() {
		intro();
		Menu.menu();
	}	
	
	/**
	 * Pause the game
	 */
	public static void pause() {
		
	}
	
	/**
	 * Close the game, saving all datas before exit
	 */
	public static void quit() {
		//TODO save all files before exit
		System.exit(0);
	}
}
