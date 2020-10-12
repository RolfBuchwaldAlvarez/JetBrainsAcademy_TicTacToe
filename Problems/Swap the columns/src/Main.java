import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix1 = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        int swap1 = scanner.nextInt();
        int swap2 = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            int num1 = matrix1[i][swap2];
            int num2 = matrix1[i][swap1];
            matrix1[i][swap1] = num1;
            matrix1[i][swap2] = num2;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }
}