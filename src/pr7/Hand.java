package pr7;

public interface Hand {
    void setHand(int[] hand);

    Integer popTopCard();

    void pushCapturedCard(int value);

    Integer[] getHand();
}