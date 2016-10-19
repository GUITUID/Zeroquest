package com.zeroquest.ZeroquestState;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.OrderedMap;
import com.badlogic.gdx.files.FileHandle;

public class Profile {
	
	public interface Serializable {
		  void write (Json json);
		  void read (Json json, OrderedMap<String, Object> jsonData);
		}
	
    public void read(Json json, OrderedMap<String,Object> jsonData ){
        /*playerProfile = json.readValue( "currentLevelId", Integer.class, jsonData );
        credits = json.readValue( "credits", Integer.class, jsonData );

        // libgdx handles the keys of JSON formatted HashMaps as Strings, but we
        // want it to be integers instead (because the levelIds are integers)
        Map<String,Integer> highScores = json.readValue( "highScores", HashMap.class,
            Integer.class, jsonData );
        for( String levelIdAsString : highScores.keySet() ) {
            int levelId = Integer.valueOf( levelIdAsString );
            Integer highScore = highScores.get( levelIdAsString);
            this.highScores.put( levelId, highScore );
        }*/
    }

    public static void write(String values ) {
    	FileHandle file = Gdx.files.internal("D:/Perso/Developpement/Java/Workspaces/Zeroquest/Project/Hero_Quest/datas/player.json");
    	System.out.println(values);
    	file.writeString(values, true);
    }

	
}
