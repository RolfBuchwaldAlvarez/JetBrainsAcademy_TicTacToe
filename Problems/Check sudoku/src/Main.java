import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nSquare = n * n;
        int sum1ToNSquare = nSquare * (nSquare + 1) / 2;
        int[][] matrix = new int[nSquare][nSquare];
        for (int i = 0; i < nSquare; i++) {
            for (int j = 0; j < nSquare; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        boolean isSolved = checkRowsNCols(matrix, nSquare, sum1ToNSquare)
            && checkSquares(n, matrix, nSquare, sum1ToNSquare);
        System.out.println(isSolved ? "YES" : "NO");
    }

    private static boolean checkRowsNCols(int[][] matrix, int nSquare, int sum1ToNSquare) {
        boolean isSolved = true;
        for (int i = 0; i < nSquare && isSolved; i++) {
            int sumRow = 0;
            int sumColumn = 0;
            for (int j = 0; j < nSquare; j++) {
                sumRow += matrix[i][j];
                sumColumn += matrix[j][i];
            }
            if (sumRow != sum1ToNSquare || sumColumn != sum1ToNSquare) {
                isSolved = false;
            }
        }
        return isSolved;
    }

    private static boolean checkSquares(int n, int[][] matrix, int nSquare, int sum1ToNSquare) {
        boolean isSolved = true;
        for (int l = 0; l < nSquare && isSolved; l += n) {
            for (int k = 0; k < nSquare && isSolved; k += n) {
                int sumSquare = 0;
                for (int i = l; i < l + n; i++) {
                    for (int j = k; j < k + n; j++) {
                        sumSquare += matrix[i][j];
                    }
                }
                if (sumSquare != sum1ToNSquare) {
                    isSolved = false;
                }
            }
        }
        return isSolved;
    }
}