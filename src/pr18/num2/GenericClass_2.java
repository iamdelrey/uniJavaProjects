package pr18.num2;

public class GenericClass_2<T, V, K> {
    private T t;
    private V v;
    private K k;

    public GenericClass_2(T t, V v, K k) {
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

    public void printClassNames() {
        System.out.println("Class name of T: " + t.getClass().getName());
        System.out.println("Class name of V: " + v.getClass().getName());
        System.out.println("Class name of K: " + k.getClass().getName());
    }

    public static void main(String[] args) {
        GenericClass_2<Integer, String, Double> myInstance = new GenericClass_2<>(63462, "Hello, world!", 351.8);
        myInstance.printClassNames();
    }
}