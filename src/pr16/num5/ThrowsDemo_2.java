package pr16.num5;

public class ThrowsDemo_2 {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThrowsDemo_2 demo = new ThrowsDemo_2();
        demo.getDetails(null);
    }
}