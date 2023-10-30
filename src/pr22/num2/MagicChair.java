package pr22.num2;

import java.util.Scanner;

public class MagicChair implements Chair {
    public void doMagic() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите вариант действия: введите 'положить' (шорткат - п) либо 'воздержаться' (шорткат - в): ");
        System.out.print("> ");
        String choice = scanner.nextLine();

        switch (choice.toLowerCase()) {
            case "положить":
                System.out.print("Введите сумму, которую вы хотите положить: ");
                double amount = scanner.nextDouble();
                System.out.println("Магия! Ваши " + amount + "$ испарились!");
                break;
            case "п":
                System.out.print("Введите сумму, которую вы хотите положить: ");
                amount = scanner.nextDouble();
                System.out.println("Магия! Ваши " + amount + "$ испарились!");
                break;
            case "воздержаться":
                System.out.println("Зануда");
                break;
            case "в":
                System.out.println("Зануда");
                break;
            default:
                System.out.println("Недопустимый выбор. Выполнение магии отменено.");
                break;
        }
        //scanner.close();
    }

    @Override
    public void sitOn() {
        System.out.println("Вы сели на магический стул");
    }

    @Override
    public void getUp() {
        System.out.println("Вы встали с магического стула");
    }
}