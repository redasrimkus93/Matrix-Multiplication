import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nHow many rows and columns are in both matrices ? \n");

        int r = scanner.nextInt();

        int[][] firstMatrix = new int[r][r];

        System.out.print("\nEnter integers of the first matrix: \n");

        Runnable putIntegerInFirstMatrix = new PutIntegerInMatrix(scanner, firstMatrix, r);
        new Thread(putIntegerInFirstMatrix).start();

        int[][] secondMatrix = new int[r][r];

        System.out.print("\nEnter integers of the second matrix: \n");

        Runnable putIntegerInSecondMatrix = new PutIntegerInMatrix(scanner, secondMatrix, r);
        new Thread(putIntegerInSecondMatrix).start();

        int[][] result = new int[r][r];

        long startTime = System.nanoTime();

        Runnable run = new Multiplication(firstMatrix, secondMatrix, result, r);
        new Thread(run).start();


        long endTime = System.nanoTime();

        System.out.print("\nFirst matrix: \n");

        Runnable showFirstMatrix = new ShowMatrix(firstMatrix, r);
        new Thread(showFirstMatrix).start();

        System.out.print("\nSecond matrix: \n");

        Runnable showSecondMatrix = new ShowMatrix(secondMatrix, r);
        new Thread(showSecondMatrix).start();

        System.out.print("\nMultiplication result: \n");

        Runnable showMultiplicationResult = new ShowMatrix(result, r);
        new Thread(showMultiplicationResult).start();

        System.out.println("\nMultiplication took " + (endTime - startTime) + " nanoseconds.");
    }
}
