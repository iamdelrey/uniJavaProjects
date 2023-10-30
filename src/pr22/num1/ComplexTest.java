package pr22.num1;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex complex1 = factory.createComplex();
        Complex complex2 = factory.CreateComplex(3, 8);

        System.out.println("Complex 1: " + complex1);
        System.out.println("Complex 2: " + complex2);

        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);
        Complex conjugate = complex2.conjugate();

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Conjugate of Complex 2: " + conjugate);
    }
}