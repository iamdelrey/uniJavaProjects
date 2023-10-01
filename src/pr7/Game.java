package pr7;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
    public Hand cpuHand;
    public Hand userHand;

    public Game(int size, Hand cpuHand, Hand userHand) {
        this.cpuHand = cpuHand;
        this.userHand = userHand;
        var hands = splitCards(size);
        this.cpuHand.setHand(hands[0]);
        this.userHand.setHand(hands[1]);
    }

    private int[][] splitCards(int size) {
        var pool = new ArrayList<Integer>(size);

        for (int i = 1; i <= size; i++) {
            pool.add(i);
        }

        Collections.shuffle(pool);

        var firstHand = new int[size / 2];
        var secondHand = new int[size / 2];
        for (int i = 0; i < size / 2; i++) {
            firstHand[i] = pool.get(i);
        }
        for (int i = size / 2; i < size; i++) {
            secondHand[i - size / 2] = pool.get(i);
        }
        return new int[][]{firstHand, secondHand};
    }

    private void printState() {
        Integer[] hand = userHand.getHand();
        System.out.format("Your hand (%d): ", hand.length);
        for (Integer item : hand) {
            System.out.format("%d ", item);
        }
        System.out.println();
        System.out.format("CPU has %d cards\n", cpuHand.getHand().length);
    }

    private boolean step() {
        var cpuCard = cpuHand.popTopCard();
        var userCard = userHand.popTopCard();
        if (cpuCard == null || userCard == null) {
            return false;
        }
        if (cpuCard > userCard) {
            System.out.println("CPU card won");
            cpuHand.pushCapturedCard(userCard);
            cpuHand.pushCapturedCard(cpuCard);
        } else {
            System.out.println("Yours card won");
            userHand.pushCapturedCard(cpuCard);
            userHand.pushCapturedCard(userCard);
        }
        return true;
    }

    private void run() {
        int count = 0;
        boolean gameEnded = false;
        while (!gameEnded && count < 106) {
            System.out.format("#%d\n", count);
            printState();
            gameEnded = !step();
            if (gameEnded) {
                if (cpuHand.popTopCard() == null) {
                    System.out.println("You won");
                } else {
                    System.out.println("CPU won");
                }
            }
            count++;
        }
        if (count == 106) {
            if (cpuHand.getHand().length > userHand.getHand().length) {

                System.out.println("CPU won");
            } else {
                System.out.println("You won");
            }
        }
    }

    public static void main(String[] args) {
        new Game(36, new ListHand(), new ListHand()).run();
    }
}