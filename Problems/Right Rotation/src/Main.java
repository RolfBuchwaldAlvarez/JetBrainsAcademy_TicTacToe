import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        int numRotations = scanner.nextInt();

        String[] result = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[(i + numRotations) % numbers.length] = numbers[i];
        }

        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}