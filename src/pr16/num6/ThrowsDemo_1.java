package pr16.num6;

public class ThrowsDemo_1 {
    public void printMessage(String key) {
        String message = getDetails(key); System.out.println(
                message );
    }
    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException( "null key in getDetails" );
        }
        return "data for " +key;
    }

    public static void main(String[] args) {
        ThrowsDemo_1 demo = new ThrowsDemo_1();

        demo.printMessage("myKey");

        demo.printMessage(null);
    }
}