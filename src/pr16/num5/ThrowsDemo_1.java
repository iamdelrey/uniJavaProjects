package pr16.num5;

public class ThrowsDemo_1 {
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
    }

    public static void main(String[] args) {
        ThrowsDemo_1 demo = new ThrowsDemo_1();
        demo.getDetails(null);
    }
}