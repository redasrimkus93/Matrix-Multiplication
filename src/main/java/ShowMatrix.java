public class ShowMatrix implements Runnable {

    public ShowMatrix(int[][] matrix, int r) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void run() {
    }
}