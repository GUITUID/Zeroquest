package com.zeroquest.ZeroquestEntities;

import java.util.Random;

public class EntityMonster extends EntityCommon
	{
		/**
		 * Monster list:<br/>
		 * - monster name <br/>
		 * - monster level <br/>
		 * - monster attack <br/>
		 * - monster defense <br/>
		 * - monster health <br/>
		 * - amount of experience gained when defeated <br/>
		 */
		protected static String[][] monstersList = 
		{
	    	{ 
				"Gobelin", "Squelette", "Orc", "Ogre", "Troll", "Guerrier du chaos", "Liche", "Demon", "Zombie", "Loup garou", "Golem", "Troll des cavernes", "Chef Orc" 
			} ,
	    		{ //Level
				"1","1","2","3","4","5","4","6","10","1","6","10","6"
			},
	    		{ //Attack
				"1","2","2","3","4","3","5","6","2","5","6","6","4"
			},
	    		{ //Defense
				"2","1","2","2","3","3","2","5","1","3","6","3","3"
			},
	    		{ //Health points
				"1","1","1","3","6","2","3","6","1","4","4","6","3"
			},
				{ //Experience points acquired when defeated
				"5","5","10","15","20","25","20","30","50","25","30","50","30"
			},
		};

		/**
		 * Monster constructor
		 */
		public EntityMonster()
			{
				int randomMonster = new Random().nextInt(12);
				setEntityName(monstersList[0][randomMonster]);
				//parseInt pour prendre les valeurs du tableau comme des nombres entiers
				setEntityAttack(Integer.parseInt(monstersList[2][randomMonster]));
				setEntityDefense(Integer.parseInt(monstersList[3][randomMonster]));
				setEntityTotalHealth(Integer.parseInt(monstersList[4][randomMonster]));
				setEntityCurrentHealth(Integer.parseInt(monstersList[4][randomMonster]));          
			}
	
		/**
		 * Method that return the monster defense score<br/>
		 * @param monster
		 * @return monsterDefense
		 */
		public int monsterDefense(EntityMonster monster) 
			{
		    		int monsterDefense = 0;
		    		for(int i=0; i!=monster.getEntityDefense(); i++)
					{
		    				int randomDice = new Random().nextInt(6);
		   				if(heroquestDiceType[randomDice]=="Ennemy Shield")
							{
		        					monsterDefense++;
		    				}
		    		}
		    		return monsterDefense;
			}
}