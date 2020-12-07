import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        fillSquareMatrix(n, matrix);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillSquareMatrix(int n, int[][] matrix) {
        int matrixRowMax = n - 1;
        int matrixColMax = n - 1;
        int matrixRowMin = 0;
        int matrixColMin = 0;
        int direction = 1;
        int num = 0;
        int nSquare = n * n;

        while (num < nSquare) {
            // direction % 4 == 1: right
            if (direction % 4 == 1 && num == 0) {
                for (int col = matrixColMin; col <= matrixColMax; col++) {
                    num++;
                    matrix[matrixRowMin][col] = num;
                }
                matrixRowMin++;
                direction++;
            }
            // direction % 4 == 1: right
            if (direction % 4 == 1) {
                for (int col = matrixColMin; col <= matrixColMax; col++) {
                    num++;
                    matrix[matrixRowMin][col] = num;
                }
                matrixRowMin++;
                direction++;
            } else if (direction % 4 == 2) { // direction % 4 == 2: down
                for (int row = matrixRowMin; row <= matrixRowMax; row++) {
                    num++;
                    matrix[row][matrixColMax] = num;
                }
                matrixColMax--;
                direction++;
            } else if (direction % 4 == 3) { // direction % 4 == 3: left
                for (int col = matrixColMax; col >= matrixColMin; col--) {
                    num++;
                    matrix[matrixRowMax][col] = num;
                }
                matrixRowMax--;
                direction++;
            } else if (direction % 4 == 0) { // direction % 4 == 0: up
                for (int row = matrixRowMax; row >= matrixRowMin; row--) {
                    num++;
                    matrix[row][matrixColMin] = num;
                }
                matrixColMin++;
                direction++;
            }
        }
    }
}