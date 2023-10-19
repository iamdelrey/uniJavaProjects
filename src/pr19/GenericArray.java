package pr19;

public class GenericArray<T> {
    private T[] array;

    public GenericArray(int size) {
        array = (T[]) new Object[size];
    }

    public void set(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Индекс находится вне допустимого диапазона.");
        }
    }

    public int length() {
        return array.length;
    }

    public static void main(String[] args) {
        GenericArray<Integer> intArray = new GenericArray<>(5);
        intArray.set(0, 1);
        intArray.set(1, 91);
        intArray.set(2, 51);
        intArray.set(3, 801);
        intArray.set(4, 35);

        System.out.print("Integer Array: [" );
        for (int i = 0; i < intArray.length(); i++) {
            if(i == intArray.length() - 1){
                System.out.print(intArray.get(i));
            }
            else {
                System.out.print(intArray.get(i) + ", ");
            }
        }
        System.out.print("]" );

        GenericArray<String> stringArray = new GenericArray<>(3);
        stringArray.set(0, "Hello");
        stringArray.set(1, "World");
        stringArray.set(2, "!");


        System.out.print("\n\nString Array: [" );
        for (int i = 0; i < stringArray.length(); i++) {
            if(i == stringArray.length() - 1){
                System.out.print(stringArray.get(i));
            }
            else {
                System.out.print(stringArray.get(i) + ", ");
            }
        }
        System.out.print("]\n\n" );

        int elementAtIndex2 = intArray.get(2);
        System.out.println("Элемент целочисленного массива с индексом 2: " + elementAtIndex2);
    }
}