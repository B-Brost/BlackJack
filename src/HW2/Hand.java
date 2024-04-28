package HW2;

import java.util.ArrayList;

public class Hand 
{
//	init hand arraylist
	ArrayList<Card> hand= new ArrayList<Card>();
	{
		this.hand=new ArrayList<Card>();
	}
	private int score=0;
	private boolean isHard=true;
	
	public String toString()
	{
//		returns the cards in the hand
		ArrayList<Object> printArray =new ArrayList<Object>();
		
		for (int i=0; i<hand.size();i++)
		{
			Card card = hand.get(i);
			printArray.add(card.toString());
		}
		return String.format("Hand: "+printArray +" Score: " +score + " isHard: " + getIsHard());
	}
	
	public void addCard(Card card)
	{
//		add card to hand
		hand.add(card);
		updateScore(card);
	}	
	
	public void updateScore(Card card)
	{
//		checks if card is A and if is and score + 11 is less than 21 add to score as 11 then sets the hand as soft
//		else just adds one
		if (card.toString().contains("A"))
		{
			if ( this.score+card.getScore(card)<=21)
			{
				this.score+=card.getScore(card);
				isHard=false;
			}
			else
			{
				this.score++;
			}
		}
		else
		{
//			if it is normal card it just adds the score of the card
			this.score+=card.getScore(card);
		}
		if (this.score > 21 && isHard == false) {
			this.score = 0;
			for(Card c : hand) {
				if (c.toString().contains("A")) {
					this.score ++;
				}
				else {
					this.score += c.getScore(c);
				}
			}
			isHard = true;
		}
	}
	
//	public void removeCard(Card card)
//	{
////		remove card from hand
//		hand.remove(card);
//	}	
	
	public int getScore()
	{
//		gets score
		return score;
	}
	
	public boolean getIsHard()
	{
//		returns true or false if hand is hard or not
		return this.isHard;
	}
}
