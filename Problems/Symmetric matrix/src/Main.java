import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] array = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        boolean isSymmetric = true;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                // j > i: compare symmetry of elements only once!
                if (j > i && array[i][j] != array[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        System.out.println(isSymmetric ? "YES" : "NO");
    }
}