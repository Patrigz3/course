package hackerrank;

import java.io.*;
import java.util.Scanner;

public class DiagonalDifference {

    // Complete the diagonalDifference function below.
    public static int DiagonalDifference(int[][] arr) {
        int firstDiagonal = 0;
        int secondDiagonal = 0;
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());;

        for (int i = 0; i < n; i++) { //for (initialization; termination; increment)
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    firstDiagonal += arr[i][j]; // if i=j incrementa la first diagonal
                }
                if (i + j == n - 1) {
                    secondDiagonal += arr[i][j]; // if i+j = n-1 incrementa la segunda
                }
            }
        }

        return Math.abs(firstDiagonal-secondDiagonal);
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = DiagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

