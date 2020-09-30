import java.util.Scanner;

public class PutIntegerInMatrix implements Runnable {

    public PutIntegerInMatrix(Scanner scanner, int[][] matrix, int r) {

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public void run() {
    }
}