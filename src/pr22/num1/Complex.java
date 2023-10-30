package pr22.num1;

public class Complex {
    private int real;
    private int imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        int newReal = this.real + other.real;
        int newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex subtract(Complex other) {
        int newReal = this.real - other.real;
        int newImaginary = this.imaginary - other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex multiply(Complex other) {
        int newReal = this.real * other.real - this.imaginary * other.imaginary;
        int newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    public Complex conjugate() {
        return new Complex(this.real, -this.imaginary);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + (-imaginary) + "i";
        }
    }
}
