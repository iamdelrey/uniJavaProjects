package pr22.num2;

import java.util.Scanner;

public class TestChair {
    public static void main(String[] args) {
        AbstractChairFactory chairFactory = new ChairFactory();

        VictorianChair victorianChair = chairFactory.createVictorianChair(50);
        MagicChair magicChair = chairFactory.createMagicanChair();
        FunctionalChair functionalChair = chairFactory.createFunctionalChair();

        Client client = new Client();

        client.setChair(victorianChair);
        client.sit();
        System.out.println("Возраст викторианского стула: " + victorianChair.getAge());
        System.out.println();

        client.setChair(magicChair);
        client.sit();
        magicChair.doMagic();
        System.out.println();

        client.setChair(functionalChair);
        client.sit();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение a: ");
        int a = sc.nextInt();
        System.out.print("Введите значение b: ");
        int b = sc.nextInt();
        System.out.println("Функционал стула: результат суммы чисел " + a + " и " + b + " равен " + functionalChair.sum(a, b));

        sc.close();
    }
}