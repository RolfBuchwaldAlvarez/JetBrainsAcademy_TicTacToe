import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int seats = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            int counter = 0;
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    counter++;
                    if (counter == seats) {
                        System.out.println(i + 1);
                        return;
                    }
                } else {
                    counter = 0;
                }
            }
        }

        System.out.println(0);
    }
}