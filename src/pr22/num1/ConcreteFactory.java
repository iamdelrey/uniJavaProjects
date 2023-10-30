package pr22.num1;

public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex CreateComplex(int real, int imaginary) {
        return new Complex(real, imaginary);
    }
}
