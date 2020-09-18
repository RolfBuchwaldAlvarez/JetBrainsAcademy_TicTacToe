import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int numOfTriples = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int num1 = array[i];
            int num2 = array[i + 1];
            int num3 = array[i + 2];
            if (num3 == num2 + 1 && num2 == num1 + 1) {
                numOfTriples++;
            }
        }
        System.out.println(numOfTriples);
    }
}