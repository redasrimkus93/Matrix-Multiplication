

public class Multiplication implements Runnable {

    public Multiplication(int[][] firstMatrix, int[][] secondMatrix, int[][] result, int r) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                for (int m = 0; m < r; m++) {
                    result[i][j] += firstMatrix[i][m] * secondMatrix[m][j];
                }
            }
        }
    }

    public void run() {
    }
}