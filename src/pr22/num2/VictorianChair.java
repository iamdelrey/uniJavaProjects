package pr22.num2;

public class VictorianChair implements Chair {
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void sitOn() {
        System.out.println("Вы сели на викторианский стул");
    }

    @Override
    public void getUp() {
        System.out.println("Вы встали с викторианского стула");
    }
}