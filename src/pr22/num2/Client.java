package pr22.num2;

public class Client {
    public Chair chair;

    public void sit() {
        if (chair != null) {
            chair.sitOn();
        } else {
            System.out.println("Клиент не может сесть на стул");
        }
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
