package pr18.num5;

public class Matrix<T> {
    private int rows;
    private int cols;
    private T[][] data;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = (T[][]) new Object[rows][cols];
    }

    public Matrix(T[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = data;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public T get(int row, int col) {
        return data[row][col];
    }

    public void set(int row, int col, T value) {
        data[row][col] = value;
    }

    public void add(Matrix<T> other) {
        if (rows != other.getRows() || cols != other.getCols()) {
            throw new IllegalArgumentException("Matrix dimensions must match for addition");
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                T sum = addElements(data[i][j], other.get(i, j));
                data[i][j] = sum;
            }
        }
    }

    public void subtract(Matrix<T> other) {
        if (rows != other.getRows() || cols != other.getCols()) {
            throw new IllegalArgumentException("Matrix dimensions must match for subtraction");
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                T diff = subtractElements(data[i][j], other.get(i, j));
                data[i][j] = diff;
            }
        }
    }

    public void multiply(Matrix<T> other) {
        if (cols != other.getRows()) {
            throw new IllegalArgumentException("Matrix dimensions are not suitable for multiplication");
        }

        T[][] result = (T[][]) new Object[rows][other.getCols()];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.getCols(); j++) {
                T sum = null;
                for (int k = 0; k < cols; k++) {
                    T product = multiplyElements(data[i][k], other.get(k, j));
                    if (sum == null) {
                        sum = product;
                    } else {
                        sum = addElements(sum, product);
                    }
                }
                result[i][j] = sum;
            }
        }

        data = result;
        cols = other.getCols();
    }

    private T addElements(T a, T b) {
        if (a instanceof Integer) {
            return (T) (Integer) ((Integer) a + (Integer) b);
        } else if (a instanceof Double) {
            return (T) (Double) ((Double) a + (Double) b);
        }
        return null;
    }

    private T subtractElements(T a, T b) {
        if (a instanceof Integer) {
            return (T) (Integer) ((Integer) a - (Integer) b);
        } else if (a instanceof Double) {
            return (T) (Double) ((Double) a - (Double) b);
        }
        return null;
    }

    private T multiplyElements(T a, T b) {
        if (a instanceof Integer) {
            return (T) (Integer) ((Integer) a * (Integer) b);
        } else if (a instanceof Double) {
            return (T) (Double) ((Double) a * (Double) b);
        }
        return null;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(data[i][j]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}