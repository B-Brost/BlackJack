package HW2;

import java.util.Scanner;
// This program allows the user to play a game of Blackjack against the computer. 
// The user is prompted to hit or stand until they bust or choose to stand.
//Then, the dealer plays until they reach a score of 17 or higher.
// The winner is determined based on who has the highest score without busting.
public class BlackJackInteract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffle();

        Player player = new Player(17, true);
        Player dealer = new Player(17, true);

        // Initial deal
        player.play(deck);
        dealer.play(deck);

        System.out.println("Your hand: " + player);
        System.out.println("Dealer's first card: " + dealer);

        while (true) {
            System.out.println("Do you want to hit or stand? (Enter 'h' for hit, 's' for stand)");
            String action = scanner.nextLine().toLowerCase();

            if (action.equals("h")) {
                player.play(deck);
                System.out.println("Your hand: " + player);
                if (player.isBust()) {
                    System.out.println("You busted! Dealer wins.");
                    break;
                }
            } else if (action.equals("s")) {
                System.out.println("You chose to stand. Dealer's turn.");
                while (dealer.getScore() < 17) {
                    dealer.play(deck);
                    System.out.println("Dealer's hand: " + dealer);
                    if (dealer.isBust()) {
                        System.out.println("Dealer busted! You win.");
                        break;
                    }
                }
                if (dealer.getScore() >= player.getScore() && dealer.getScore() <= 21) {
                    System.out.println("Dealer wins!");
                } else {
                    System.out.println("You win!");
                }
                break;
            } else {
                System.out.println("Invalid input. Please enter 'h' for hit or 's' for stand.");
            }
        }
        scanner.close();
    }
}
