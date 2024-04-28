package HW2;

public class BlackJackOdds 
{
//	player plays blackjack against dealer
	public static void main(String[] args) 
	{
//		init variables
		int playerScore=0, dealerScore=0, noWinner=0;
		boolean dBool = true, pBool = true;
		String dHard, pHard;
//		repeat 4x for TT TF FT FF
		for (int q=0;q<4;q++)
		{
			if(q<2)
			{
				dBool=true;
				dHard="hard";
			}
			else
			{
				dBool=false;
				dHard="soft";
			}
			if (q%2==0)
			{
				pBool=true;
				pHard="hard";
			}
			else
			{
				pBool=false;
				pHard="soft";
			}
//			repeat 3x for 16,17,18 for player
			for (int j=0;j<3;j++)
			{
				int n;
				n=16+j;
//				repeat 3x for 16,17,18 for dealer
				for (int l=0; l<3;l++)
				{
					int m;
					m=16+l;
//					repeat 5000x because was told to do that
					for (int i=0;i<5000; i++)
					{
//						new deck and shuffle
						Deck deck = new Deck();
						deck.shuffle();
//						player plays and then dealer plays
						Player player = new Player(n,pBool);
						player.play(deck);
						Player dealer = new Player(m,dBool);
						dealer.play(deck);
//						add point to who won or nowinner
						if (player.getScore()>dealer.getScore())
						{
							playerScore++;
						}
						else if (player.getScore()<dealer.getScore())
						{
							dealerScore++;
						}
						else
						{
							noWinner++;
						}
					}
//					returns printed stuff giving percentage of games won, does this for all 5billion scenarios
					System.out.println("dealer " + m + "("+dHard+")"+" vs player " +n+ "("+pHard+")");
					System.out.println("Dealer won: " + dealerScore*100/5000.0);
					System.out.println("Player won: " + playerScore*100/5000.0);
					System.out.println("No winner: " + noWinner*100/5000.0);
//					reset the scores to zero for the next set of games, who knows if it is actually necessary lol, nvm it is necessary just tested it without and it goes off
					playerScore=0;
					dealerScore=0;
					noWinner=0;
				}
			}
			
		}
	}
}
