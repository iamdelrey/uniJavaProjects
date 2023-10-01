package pr7;

import java.util.ArrayDeque;

public class DequeHand implements Hand {
    private ArrayDeque<Integer> deque;

    public DequeHand() {
        deque = new ArrayDeque<>();
    }


    @Override
    public void setHand(int[] hand) {
        deque.clear();
        for (int item : hand) {
            deque.add(item);
        }
    }

    @Override
    public Integer popTopCard() {
        if (deque.size() == 0) {
            return null;
        }
        return deque.pollFirst();
    }

    @Override
    public void pushCapturedCard(int value) {
        deque.addLast(value);
    }

    @Override
    public Integer[] getHand() {
        return deque.toArray(new Integer[]{});
    }
}