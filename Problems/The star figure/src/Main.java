import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = n - 1;
        String[][] starArray = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n / 2 || j + i == num || i == n / 2) {
                    starArray[i][j] = "*";
                } else {
                    starArray[i][j] = ".";
                }
            }
        }

        for (String[] row : starArray) {
            System.out.println(String.join(" ", row));
        }
    }
}