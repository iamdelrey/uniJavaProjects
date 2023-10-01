package pr7;

import java.util.Stack;

public class StackHand implements Hand {
    private Stack<Integer> stack;

    public StackHand(int[] initialHand) {
        stack = new Stack<>();
        for (int i = initialHand.length - 1; i >= 0; i--) {
            stack.push(initialHand[i]);
        }
    }

    @Override
    public void setHand(int[] hand) {

    }

    @Override
    public Integer popTopCard() {
        if (stack.empty()) {
            return null;
        }
        return stack.pop();
    }

    @Override
    public void pushCapturedCard(int value) {
        Stack<Integer> newStack = new Stack<>();

        newStack.push(value);
        for (int item : stack.toArray(new Integer[]{})) {
            newStack.push(item);
        }
        stack = newStack;
    }

    @Override
    public Integer[] getHand() {
        return stack.toArray(new Integer[]{});
    }
}