import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();
        int squareNum = dimension * dimension;
        boolean isSolved = true;

        if (dimension != 1) {
            int[][] matrix = new int[squareNum][squareNum];
            for (int i = 0; i < squareNum; i++) {
                for (int j = 0; j < squareNum; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            int sumOfArray = 0;
            int compareValue = 0;
            for (int i = 1; i <= squareNum; i++) {
                compareValue += i;
            }

            for (int i = 0; i < squareNum; i++) {
                for (int x : matrix[i]) {
                    sumOfArray += x;
                }
                if (sumOfArray != compareValue) {
                    isSolved = false;
                    break;
                }
                sumOfArray = 0;
            }

            for (int i = 0; i < squareNum; i++) {
                for (int j = 0; j < squareNum; j++) {
                    sumOfArray += matrix[j][i];
                }
                if (sumOfArray != compareValue) {
                    isSolved = false;
                    break;
                }
                sumOfArray = 0;
            }

            int limitI = dimension;
            int limitJ = dimension;
            for (int i = 0; i < limitI; i++) {
                for (int j = 0; j < limitJ; j++) {
                    sumOfArray += matrix[i][j];
                    if (i == squareNum - 1 && j == squareNum - 1) {
                        if (sumOfArray != compareValue) {
                            isSolved = false;
                            break;
                        }
                        break;
                    } else if (i == limitI - 1 && j == limitJ - 1 && limitI == squareNum && limitJ != squareNum) {
                        if (sumOfArray != compareValue) {
                            isSolved = false;
                            break;
                        }
                        i = squareNum - dimension;
                        limitJ += dimension;
                        sumOfArray = 0;
                    } else if (i == limitI - 1 && j == limitJ - 1 && limitI != squareNum && limitJ == squareNum) {
                        if (sumOfArray != compareValue) {
                            isSolved = false;
                            break;
                        }
                        j = 0;
                        limitI += dimension;
                        sumOfArray = 0;
                    } else if ( i == limitI - 1 && j == limitJ - 1 && limitI != squareNum - 1 && limitJ != squareNum - 1) {
                        if (sumOfArray != compareValue) {
                            isSolved = false;
                            break;
                        }
                        i = squareNum - dimension;
                        limitJ += dimension;
                        sumOfArray = 0;
                    }
                }
            }
        } else {
            int num = scanner.nextInt();
            if (num != 1) {
                isSolved = false;
            }
        }

        System.out.println(isSolved ? "YES" : "NO");
    }
}