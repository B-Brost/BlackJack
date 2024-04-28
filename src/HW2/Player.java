package HW2;


public class Player 
{
//	init variables
	Hand player = new Hand();
	int standValue=0;
	boolean isHardStand=true;
//	constructor
	Player(int standValue, boolean isHardStand)
	{
		this.standValue=standValue;
		this.player=new Hand();
		this.isHardStand = isHardStand;
	}
	
	public String toString()
	{
//		return players hand
		return player.toString();
	}
	
	public void play(Deck deck)
	{
//		deals card if score is under stand value depending on whether stand is hard or soft
		if (this.isHardStand == false) 
		{
			 while (player.getScore() < standValue)
			 {
				 player.addCard(deck.deal());
			 }
		}
		else 
		{
			if (player.getIsHard() == true) 
			{
				 while (player.getScore() < standValue)
				 {
					 player.addCard(deck.deal());
				 }
			}
			else {
				player.addCard(deck.deal());
			}
		}
	}
	
	public Boolean isBust()
	{
//		checks if player has busted
		if (player.getScore()>21)
		{
			return true;
		}
		return false;
	}
	
	public int compareScores(Player that)
	{
//		compares player and other scores
		return this.player.getScore() - that.player.getScore();
	}
	
	public int getScore()
	{
//		gets score
		return player.getScore();
	}
}

