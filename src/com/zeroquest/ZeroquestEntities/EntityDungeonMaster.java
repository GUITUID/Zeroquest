package com.zeroquest.ZeroquestEntities;

public class EntityDungeonMaster {
	
	public String getDungeonMasterRank() {
		return dungeonMasterRank;
	}
	public void setDungeonMasterRank(String dungeonMasterRank) {
		this.dungeonMasterRank = dungeonMasterRank;
	}
	public int getDungeonMasterLevel() {
		return dungeonMasterLevel;
	}
	public void setDungeonMasterLevel(int dungeonMasterLevel) {
		this.dungeonMasterLevel = dungeonMasterLevel;
	}
	public int getDungeonMasterXp() {
		return dungeonMasterXp;
	}
	public void setDungeonMasterXp(int dungeonMasterXp) {
		this.dungeonMasterXp = dungeonMasterXp;
	}
	public int getDungeonMasterPoints() {
		return dungeonMasterPoints;
	}
	public void setDungeonMasterPoints(int dungeonMasterPoints) {
		this.dungeonMasterPoints = dungeonMasterPoints;
	}
	public EntityCard[] getDungeonMasterCardsHand() {
		return dungeonMasterCardsHand;
	}
	public void setDungeonMasterCardsHand(EntityCard[] dungeonMasterCardsHand) {
		this.dungeonMasterCardsHand = dungeonMasterCardsHand;
	}
	public int getDungeonMasterSelectedCardInHand() {
		return dungeonMasterSelectedCardInHand;
	}
	public void setDungeonMasterSelectedCardInHand(int dungeonMasterSelectedCardInHand) {
		this.dungeonMasterSelectedCardInHand = dungeonMasterSelectedCardInHand;
	}
	public EntityTile[] getDungeonMasterTilesHand() {
		return dungeonMasterTilesHand;
	}
	public void setDungeonMasterTilesHand(EntityTile[] dungeonMasterTilesHand) {
		this.dungeonMasterTilesHand = dungeonMasterTilesHand;
	}
	public int getDungeonMasterSelectedTileInHand() {
		return dungeonMasterSelectedTileInHand;
	}
	public void setDungeonMasterSelectedTileInHand(int dungeonMasterSelectedTileInHand) {
		this.dungeonMasterSelectedTileInHand = dungeonMasterSelectedTileInHand;
	}
	String dungeonMasterRank;
	int dungeonMasterLevel;
	int dungeonMasterXp;
	int dungeonMasterPoints;
	
	EntityCard[] dungeonMasterCardsHand;
	int dungeonMasterSelectedCardInHand;
	
	EntityTile[] dungeonMasterTilesHand;
	int dungeonMasterSelectedTileInHand;
	
	

}
