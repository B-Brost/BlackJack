package HW2;

import java.util.ArrayList;
import java.util.Collections;

public class Deck 
{
//	inits variables
	ArrayList<Card> deck= new ArrayList<Card>();
	{
		this.deck=new ArrayList<Card>();
	}
	char [] suits= {'c','s','h','d'};			 
	public Deck()
	{
//	create deck	
		for (int j=2;j<15;j++) 
		{
			for (int i=0;i < suits.length;i++)
			{
				Card c = new Card (j,suits[i]);
				deck.add(c);
			}
		}
	}
	
	public String toString()
	{
//		returns the cards in the hand
		ArrayList<Object> printArray =new ArrayList<Object>();
		
		for (int i=0; i<deck.size();i++)
		{
			Card card = deck.get(i);
			printArray.add(card.toString());
		}
		return String.format("Deck: "+printArray);
	}
	
	public Card deal()
	{
//		removes the cards from the top of the deck
		return deck.remove(0);		
	}
	
	public void shuffle()
	{
//		shuffles deck by swapping two random cards
		for (int i=0;i<100;i++)
		{
			int k=(int) Math.round(Math.random()*(deck.size()-1));
			int l=(int) Math.round(Math.random()*(deck.size()-1));
			Collections.swap(deck, k, l);
		}
	}
	
	public void stack()
	{
//		puts all the A at the beginning
		int j=0;
		for (int i=0;i<deck.size();i++)
		{
			if (deck.get(i).toString().contains("A"))
			{
				Collections.swap(deck, i, j);
				j+=1;
			}
		}
	}
}
