package pr18.num5;

public class Main {
    public static void main(String[] args) {
        Integer[][] data1 = {{1, 2}, {3, 4}};
        Matrix<Integer> matrix1 = new Matrix<>(data1);

        Integer[][] data2 = {{5, 6}, {7, 8}};
        Matrix<Integer> matrix2 = new Matrix<>(data2);

        matrix1.add(matrix2);
        matrix1.subtract(matrix2);

        Integer[][] data3 = {{3, 7}, {2, 5}};
        Matrix<Integer> matrix3 = new Matrix<>(data3);

        matrix1.multiply(matrix3);

        System.out.println(matrix1);
    }
}