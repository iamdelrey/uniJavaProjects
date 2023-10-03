package pr7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DrunkardGameDequeue {
    private Deque<Integer> player1Deck;
    private Deque<Integer> player2Deck;

    public DrunkardGameDequeue() {
        player1Deck = new ArrayDeque<>();
        player2Deck = new ArrayDeque<>();
    }

    public void initializeDecks(String player1Cards, String player2Cards) {
        // Раздаем карты игрокам
        for (int i = 0; i < player1Cards.length(); i++) {
            player1Deck.offerLast(Character.getNumericValue(player1Cards.charAt(i)));
            player2Deck.offerLast(Character.getNumericValue(player2Cards.charAt(i)));
        }
    }

    public void playGame() {
        int turnCount = 0;

        while (!player1Deck.isEmpty() && !player2Deck.isEmpty() && turnCount < 106) {
            int player1Card = player1Deck.pollFirst();
            int player2Card = player2Deck.pollFirst();

            if (player1Card > player2Card) {
                player1Deck.offerLast(player1Card);
                player1Deck.offerLast(player2Card);
            } else {
                player2Deck.offerLast(player1Card);
                player2Deck.offerLast(player2Card);
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

        DrunkardGameDequeue game = new DrunkardGameDequeue();
        game.initializeDecks(player1Cards, player2Cards);
        game.playGame();
    }
}