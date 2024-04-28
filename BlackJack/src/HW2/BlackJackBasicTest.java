package HW2;

public class BlackJackBasicTest 
{
	public static void main(String[] args) 
	{
//		plays one person blackjack until stand value depending on whether
		Deck deck = new Deck();
		deck.shuffle();
		
		Player player = new Player(17,true);
		player.play(deck);
		System.out.println(player);
		}
}