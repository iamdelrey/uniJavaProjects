package pr7;

import java.util.Scanner;
import java.util.Stack;

public class DrunkardGameStack {
    private Stack<Integer> player1Deck;
    private Stack<Integer> player2Deck;

    public DrunkardGameStack() {
        player1Deck = new Stack<>();
        player2Deck = new Stack<>();
    }

    public void initializeDecks(String player1Cards, String player2Cards) {
        for (int i = player1Cards.length() - 1; i >= 0; i--) {
            player1Deck.push(Character.getNumericValue(player1Cards.charAt(i)));
            player2Deck.push(Character.getNumericValue(player2Cards.charAt(i)));
        }
    }

    public void playGame() {
        int turnCount = 0;

        while (!player1Deck.isEmpty() && !player2Deck.isEmpty() && turnCount < 106) {
            int player1Card = player1Deck.pop();
            int player2Card = player2Deck.pop();

            if (player1Card > player2Card) {
                player1Deck.add(0, player1Card);
                player1Deck.add(0, player2Card);
            } else {
                player2Deck.add(0, player1Card);
                player2Deck.add(0, player2Card);
            }

            turnCount++;
        }

        if (turnCount < 106) {
            if (player1Deck.isEmpty()) {
                System.out.println("Победитель: second " + turnCount);
            } else {
                System.out.println("Победитель: first " + turnCount);
            }
        } else {
            System.out.println("botva");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значения карт первого игрока: ");
        String player1Cards = scanner.next();
        System.out.print("Введите значения карт второго игрока: ");
        String player2Cards = scanner.next();

        DrunkardGameStack game = new DrunkardGameStack();
        game.initializeDecks(player1Cards, player2Cards);
        game.playGame();
    }
}