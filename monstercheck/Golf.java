import static java.lang.System.*;

import java.util.List;
import java.util.Scanner;

public class Golf {
    // Add Player instance Variables
    private Player player1;
    private Player player2;

    // Add Dealer instance Variables
    private Deck deck;

    public Golf() {
        player1 = new Player();
        player2 = new Player();
        deck = new Deck();
    }

    public void playGame() {
        Scanner keyboard = new Scanner(in);
        char choice = 0;
        deck.shuffle();
        do {
            // Everyone gets 4 cards - 1 card at a time
            player1.resetHand();
            player2.resetHand();
            for (int i = 0; i < 4; i++) {
                player1.addCardToHand(deck.nextCard());
                player2.addCardToHand(deck.nextCard());
            }
            
            // Print out each player's hand value & cards
            // Loop 2 times for each player
            //      if the player wants to swap a card, then swap it
            out.println("\nPLAYER 1");
            out.println("Hand Value >>> " + player1.getHandValue());
            out.println("You can swap two cards if you want!");
            for (int i = 0; i < 2; i++) {
                out.println("Cards >>> " + player1.getHand());
                int index = player1.swapCards();
                if (index != -1) {
                    List<Card> hand = player1.getHand();
                    hand.set(index, deck.nextCard());
                }
            }
            
            out.println("\nPLAYER 2");
            out.println("Hand Value >>> " + player2.getHandValue());
            out.println("You can swap two cards if you want!");
            for (int i = 0; i < 2; i++) {
                out.println("Cards >>> " + player2.getHand());
                int index = player2.swapCards();
                if (index != -1) {
                    List<Card> hand = player2.getHand();
                    hand.set(index, deck.nextCard());
                }
            }
            
            // Determine the winner
            // Update the win count
            if (player1.getHandValue() < player2.getHandValue()) {
                out.println("Player 1 wins!");
                player1.setWinCount(player1.getWinCount() + 1);
            } else if (player1.getHandValue() > player2.getHandValue()) {
                out.println("Player 2 wins!");
                player2.setWinCount(player2.getWinCount() + 1);
            } else {
                out.println("Tie!");
            }
            
            out.println("Player 1 hand value >>> " + player1.getHandValue());
            out.println("Player 2 hand value >>> " + player2.getHandValue());
            
            out.println("\nPlayer 1 has won " + player1.getWinCount() + " times.");
            out.println("Player 2 has won " + player2.getWinCount() + " times.");
            
            // Shuffle the deck if needed
            if (deck.numCardsLeft() < 10) {
                deck.shuffle();
            }
            
            out.print("Do you want to play another game? [Y,y,N,n] >>> ");
            choice = keyboard.next().charAt(0);
            
        } while (choice == 'y' || choice == 'Y');
    }

    public static void main(String[] args) {
        Golf game = new Golf();
        game.playGame();
    }
}
