package HW2;

public class Card 
{
		private int rank ;

		private char suit;
		
		public Card(int rank, char suit)
		{
//			inits some things i think
			this.rank=rank;
			this.suit=suit;
		}
		
	public String toString()
	{
//		print the card value after making sure that the ones that need to be letters are letters
		if (rank>=11)
		{
			String printRank = null;
			if (rank==11)
			{
				printRank="J";
			}
			if (rank==12)
			{
				printRank="Q";
			}
			if (rank==13)
			{
				printRank="K";
			}
			if (rank==14)
			{
				printRank="A";
			}
			return "Card: " + printRank + suit;
		}
		return "Card: " + rank + suit;
	}
	
	public Card(Card that)
	{
//		copy constructor
		this.suit=that.suit;
		this.rank=that.rank;
	}
	
	public boolean equals(Object obj)
	{
//		objects equals class that overrides the old equals class

		if (this == obj) 
		{
			return true;
		}
		
		if (!(obj instanceof Card)) 
		{
			return false;
		}
		
		Card that = (Card)obj;
		
		return this.rank == that.rank && this.suit == that.suit;
	}
	public int getScore(Object obj)
	{
//		returns worth of card
		int printScore = 1000;
		if (rank>=11)
		{
			if (rank==11)
			{
				printScore = 10;
			}
			if (rank==12)
			{
				printScore = 10;
			}
			if (rank==13)
			{
				printScore = 10;
			}
			if (rank==14)
			{
				printScore = 11;
			}
			return printScore;
		}
		if (rank<11)
		{
			printScore = rank;
			return printScore;
		}
		return printScore;
	}
	
}
