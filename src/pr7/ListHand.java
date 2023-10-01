package pr7;

import java.util.LinkedList;

public class ListHand implements Hand {
    private LinkedList<Integer> list;


    public ListHand() {
        list = new LinkedList<>();
    }


    @Override
    public void setHand(int[] hand) {
        list.clear();
        for (int item : hand) {
            list.add(item);
        }
    }

    @Override
    public Integer popTopCard() {
        if (list.size() == 0) {
            return null;
        }
        return list.pollFirst();
    }

    @Override
    public void pushCapturedCard(int value) {
        list.addLast(value);
    }

    @Override
    public Integer[] getHand() {
        return list.toArray(new Integer[]{});
    }
}