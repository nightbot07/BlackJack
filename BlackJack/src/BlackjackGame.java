

import java.util.Scanner;

public class BlackjackGame {
    private Deck deck;
    private Hand playerHand;
    private Hand dealerHand;

    public BlackjackGame() {
        deck = new Deck();
        playerHand = new Hand();
        dealerHand = new Hand();
    }

    public void startGame() {
        System.out.println("Welcome to Blackjack!");

        playerHand.addCard(deck.dealCard());
        playerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());

        playerTurn();
        if (playerHand.calculateValue() <= 21) {
            dealerTurn();
        }

        showResult();
    }

    private void playerTurn() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Your hand: " + playerHand + " (value: " + playerHand.calculateValue() + ")");
            System.out.println("Dealer's visible card: " + dealerHand.toString().split(",")[0]);

            if (playerHand.calculateValue() > 21) {
                System.out.println("You busted!");
                return;
            }

            System.out.print("Hit or stand? (h/s): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("h")) {
                playerHand.addCard(deck.dealCard());
            } else if (choice.equalsIgnoreCase("s")) {
                break;
            } else {
                System.out.println("Invalid input, try again.");
            }
        }
    }

    private void dealerTurn() {
        System.out.println("Dealer's hand: " + dealerHand + " (value: " + dealerHand.calculateValue() + ")");
        while (dealerHand.calculateValue() < 17) {
            System.out.println("Dealer hits.");
            dealerHand.addCard(deck.dealCard());
            System.out.println("Dealer's hand: " + dealerHand + " (value: " + dealerHand.calculateValue() + ")");
        }

        if (dealerHand.calculateValue() > 21) {
            System.out.println("Dealer busted!");
        } else {
            System.out.println("Dealer stands.");
        }
    }

    private void showResult() {
        int playerValue = playerHand.calculateValue();
        int dealerValue = dealerHand.calculateValue();

        System.out.println("\nFinal Hands:");
        System.out.println("Your hand: " + playerHand + " (value: " + playerValue + ")");
        System.out.println("Dealer's hand: " + dealerHand + " (value: " + dealerValue + ")");

        if (playerValue > 21) {
            System.out.println("You lose!");
        } else if (dealerValue > 21 || playerValue > dealerValue) {
            System.out.println("You win!");
        } else if (playerValue < dealerValue) {
            System.out.println("You lose!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    public static void main(String[] args) {
        BlackjackGame game = new BlackjackGame();
        game.startGame();
    }
}
