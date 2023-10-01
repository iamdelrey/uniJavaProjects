package pr7;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueHand implements Hand {
    private Queue<Integer> queue;

    public QueueHand(int[] initialHand) {
        queue = new ArrayDeque<>();
    }

    @Override
    public void setHand(int[] hand) {

        for (int item : hand) {
            queue.add(item);
        }
    }

    @Override
    public Integer popTopCard() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.poll();
    }

    @Override
    public void pushCapturedCard(int value) {
        queue.add(value);
    }

    @Override
    public Integer[] getHand() {
        return queue.toArray(new Integer[0]);
    }
}