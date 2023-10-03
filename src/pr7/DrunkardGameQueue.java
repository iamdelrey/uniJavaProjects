package pr7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DrunkardGameQueue {
    private Queue<Integer> player1Deck;
    private Queue<Integer> player2Deck;

    public DrunkardGameQueue() {
        player1Deck = new LinkedList<>();
        player2Deck = new LinkedList<>();
    }

    public void initializeDecks(String player1Cards, String player2Cards) {
        // Раздаем карты игрокам
        for (int i = 0; i < player1Cards.length(); i++) {
            player1Deck.offer(Character.getNumericValue(player1Cards.charAt(i)));
            player2Deck.offer(Character.getNumericValue(player2Cards.charAt(i)));
        }
    }

    public void playGame() {
        int turnCount = 0;

        while (!player1Deck.isEmpty() && !player2Deck.isEmpty() && turnCount < 106) {
            int player1Card = player1Deck.poll();
            int player2Card = player2Deck.poll();

            if (player1Card > player2Card) {
                player1Deck.offer(player1Card);
                player1Deck.offer(player2Card);
            } else {
                player2Deck.offer(player1Card);
                player2Deck.offer(player2Card);
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

        DrunkardGameQueue game = new DrunkardGameQueue();
        game.initializeDecks(player1Cards, player2Cards);
        game.playGame();
    }
}