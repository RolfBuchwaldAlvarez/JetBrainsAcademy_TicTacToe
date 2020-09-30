import javax.swing.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int squareNum = num * num;
        boolean isSolved = true;
        int[] subMatrixAsArray = new int[squareNum];
        int[] compareArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] rowArray;
        int[] columnArray = new int[squareNum];

        int sumOfCompareArray = 0;

        for (int k : compareArray) {
            sumOfCompareArray += k;
        }

        if (num != 1) {
            int[][] matrix = new int[squareNum][squareNum];
            for (int i = 0; i < squareNum; i++) {
                for (int j = 0; j < squareNum; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            int limit = num;
            int sumOfSubmatrix = 0;
            for (int i = 0; i < limit; i++) {
                for (int j = 0; j < limit; j++) {
                    sumOfSubmatrix += matrix[i][j];
                }
                if (i == limit - 1 && limit != squareNum) {
                    if (sumOfSubmatrix != sumOfCompareArray) {
                        isSolved = false;
                        break;
                    } else {
                        sumOfSubmatrix = 0;
                        limit += num;
                        i += num;
                        j += num;
                    }
                }
            }

            /*vector[0] = matrix[0][0];
            vector[1] = matrix[0][1];
            vector[2] = matrix[0][2];
            vector[3] = matrix[1][0];
            vector[4] = matrix[1][1];
            vector[5] = matrix[1][2];
            vector[6] = matrix[2][0];
            vector[7] = matrix[2][1];
            vector[8] = matrix[2][2];*/

            /*int limit = num;*/

                /*if (i == limit - 1) {
                    Arrays.sort(subMatrixAsArray);
                    System.out.println(Arrays.toString(subMatrixAsArray));
                    if (!Arrays.equals(subMatrixAsArray, compareArray)) {
                        isSolved = false;
                        break;
                    }
                    i += num;
                    limit += num;
                } else {
                    break;
                }
            }*/

            for (int i = 0; i < squareNum; i++) {
                rowArray = matrix[i];
                Arrays.sort(rowArray);
                if (!Arrays.equals(rowArray, compareArray)) {
                    isSolved = false;
                    break;
                }
            }

            for (int i = 0; i < squareNum; i++) {
                System.arraycopy(matrix[i], 0, columnArray, 0, squareNum);
                Arrays.sort(columnArray);
                if (!Arrays.equals(columnArray, compareArray)) {
                    isSolved = false;
                    break;
                }
            }

            System.out.println(Arrays.toString(subMatrixAsArray));
        }

        System.out.println(isSolved ? "YES" : "NO");
    }
}