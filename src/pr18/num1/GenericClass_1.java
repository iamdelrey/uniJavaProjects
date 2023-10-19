package pr18.num1;

public class GenericClass_1<T, V, K> {
    private T t;
    private V v;
    private K k;

    public GenericClass_1(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public V getV() {
        return v;
    }

    public K getK() {
        return k;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setV(V v) {
        this.v = v;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void printValues() {
        System.out.println("T: " + t);
        System.out.println("V: " + v);
        System.out.println("K: " + k);
    }

    public static void main(String[] args) {
        GenericClass_1<Integer, String, Double> myInstance = new GenericClass_1<>(253, "Test string", 26.15532);
        myInstance.printValues();
    }
}