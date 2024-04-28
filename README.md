# BlackJack
 
This project is a simulation of the game of Blackjack, where it models the card, deck, hand, and player classes, and includes tests for single player games and odds calculation for different scenarios in a dealer vs player setup.

When you run BlackJackBasicTest, it simulates a single player game of Blackjack where the player plays until they reach a stand value of 17. The output will display the player’s hand and their score. There is no user interaction in this class as it’s a simulation.

When you run BlackJackOdds, it simulates a game of Blackjack between a player and a dealer. It runs multiple scenarios with different stand values and hard/soft stands for both the player and the dealer. It repeats each scenario 5000 times and calculates the win percentages for the dealer, player, and no winner scenarios.

When you run BlackJackInteract, it simulates a game of Blackjack where the user can play a game of Blackjack against the computer. The user is prompted to hit or stand until they bust or choose to stand. Then, the dealer plays until they reach a score of 17 or higher. The winner is determined based on who has the highest score without busting.
