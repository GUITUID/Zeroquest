package com.zeroquest.ZeroquestState;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Saving{
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
	public static void saveFile(String filename, String playerDatas, String datasToSaveType) 
	throws IOException
	{
		if(datasToSaveType.equals("character")){
			File file = new File ("D:/Perso/Developpement/Java/Workspaces/Zeroquest/Project/Hero_Quest/datas/Characters/"+filename+".json");
			BufferedWriter out = new BufferedWriter(new FileWriter(file)); 
			out.write(playerDatas);
			out.close();
		}else if(datasToSaveType.equals("configuration")){
			File file = new File ("D:/Perso/Developpement/Java/Workspaces/Zeroquest/Project/Hero_Quest/datas/Config/Config.json");
			BufferedWriter out = new BufferedWriter(new FileWriter(file)); 
			out.write(playerDatas);
			out.close();
		}
	}
}
