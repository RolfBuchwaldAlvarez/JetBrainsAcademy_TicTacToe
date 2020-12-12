import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[][] matrix = new String[4][4];

        for (int i = 0; i < 4; i++) {
            String seq = sc.next();
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = String.valueOf(seq.charAt(j));
            }
        }

        boolean pretty = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String color = matrix[i][j];
                if (color.equals(matrix[i][j + 1]) && color.equals(matrix[i + 1][j])
                    && color.equals(matrix[i + 1][j + 1])) {
                    pretty = false;
                    break;
                }
            }
        }

        System.out.println(pretty ? "YES" : "NO");

    }
}