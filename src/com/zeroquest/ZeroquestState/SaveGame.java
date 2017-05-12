package com.zeroquest.ZeroquestState;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveGame{
	/**
	 * 
	 * Method to save the newly created character to a json file
	 * 
	 * @param filename: player pseudo 
	 * @param playerDatas: datas to save
	 * @param datasToSaveType: indicates type of datas to save (character or configuration)
	 * @return 
	 * @throws IOException
	 */

	/*
	 * How to use GSON
	 * Gson gson = new Gson();
	 Staff obj = new Staff();

	// 1. Java object to JSON, and save into a file
	gson.toJson(obj, new FileWriter("D:\\file.json"));

	// 2. Java object to JSON, and assign to a String
	String jsonInString = gson.toJson(obj);
	 */
	public static void saveFile(String filename, String playerDatasToSave, String datasToSaveType) 
			throws IOException
	{
		if(datasToSaveType.equals("character")){
			//saving newly created character in a json format
			try {
				File file = new File ("C:/Users/Zadwarf.ZADWARF-PC/git/Zeroquest/datas/characters/"+filename+".json");
				BufferedWriter out = new BufferedWriter(new FileWriter(file)); 
				out.write(playerDatasToSave);
				out.close();
			} catch (IOException e1) {
				System.out.println("Error: error when creating character file");
				e1.printStackTrace();
			}
		}else if(datasToSaveType.equals("configuration")){
			try {
				File file = new File ("C:/Perso/Developpement/Java/Workspaces/Zeroquest/Project/Hero_Quest/datas/Config/Config.json");
				BufferedWriter out = new BufferedWriter(new FileWriter(file)); 
				out.write(playerDatasToSave);
				out.close();
			} catch (IOException e1) {
				System.out.println("Error: error when creating configuration file");
				e1.printStackTrace();
			}
		}

	}
}
