package pr22.num2;

public class FunctionalChair implements Chair{
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void sitOn() {
        System.out.println("Вы сели на функциональный стул");
    }

    @Override
    public void getUp() {
        System.out.println("Вы встали с функционального стула");
    }
}