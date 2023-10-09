package pr9.num2;

public class Main {
    public static void main(String[] args) {
        Priceable tShirt = new Clothes("Levi's", 35.99);
        Priceable sportsCar = new Car("Porsche gt3 rs", 320000.00);

        System.out.println("Цена футболки: $" + tShirt.getPrice());
        System.out.println("Цена автомобиля: $" + sportsCar.getPrice());
    }
}