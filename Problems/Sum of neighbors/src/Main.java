import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seq = sc.nextLine().split(" ");
        int[][] matrix = new int[1][seq.length];
        int rows = 2;

        for (int i = 0; i < seq.length; i++) {
            matrix[0][i] = Integer.parseInt(seq[i]);
        }

        for (int i = 1; i < rows; i++) {
            seq = sc.nextLine().split(" ");
            if (String.join("", seq).equals("end")) {
                break;
            }
            int prevRowCount = matrix.length;
            int[][] withExtraRow = new int[prevRowCount + 1][seq.length];
            for (int k = 0; k < matrix.length; k++) {
                System.arraycopy(matrix[k], 0, withExtraRow[k], 0, seq.length);
            }
            for (int j = 0; j < seq.length; j++) {
                withExtraRow[i][j] = Integer.parseInt(seq[j]);
            }
            matrix = withExtraRow;
            rows++;
        }

        int[][] finalMatrix = sumOfNeighbors(matrix);

        for (int[] ints : finalMatrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

    }

    private static int[][] sumOfNeighbors(int[][] matrix) {
        int iPlusOne;
        int iMinusOne;
        int jPlusOne;
        int jMinusOne;
        int sumOfNeighbors;
        int[][] finalMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                iMinusOne = matrix[i - 1 < 0 ? matrix.length - 1 : i - 1][j];
                iPlusOne = matrix[i + 1 == matrix.length ? 0 : i + 1][j];
                jMinusOne = matrix[i][j - 1 < 0 ? matrix[0].length - 1 : j - 1];
                jPlusOne = matrix[i][j + 1 == matrix[0].length ? 0 : j + 1];

                sumOfNeighbors = iMinusOne + iPlusOne + jMinusOne + jPlusOne;
                finalMatrix[i][j] = sumOfNeighbors;
            }
        }
        return finalMatrix;
    }
}
