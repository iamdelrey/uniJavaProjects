package pr9.num1;

public class Main {
    public static void main(String[] args) {
        Nameable earth = new Planet("Mars");
        Nameable car = new Car("BMW");
        Nameable lion = new Animal("Dog");

        System.out.println("Название планеты: " + earth.getName());
        System.out.println("Название машины: " + car.getName());
        System.out.println("Название животного: " + lion.getName());
    }
}