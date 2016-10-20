package com.zeroquest.ZeroquestEntities;

public class Cards {
	
	String cardName;
	int cardCost;
	boolean cardUnlocked;
	boolean cardIsInHand;
	
	void setcardCost(int cardCost){
		this.cardCost=cardCost;
	}
	
	public int getcardCost(){
		return cardCost;
	}
	
	void setcardUnlocked(boolean cardUnlocked){
		this.cardUnlocked=cardUnlocked;
	}
	
	public boolean getcardUnlocked(){
		return cardUnlocked;
	}

	void setcardIsInHand(boolean cardIsInHand){
		this.cardIsInHand=cardIsInHand;
	}
	
	public boolean getcardIsInHand(){
		return cardIsInHand;
	}
}
