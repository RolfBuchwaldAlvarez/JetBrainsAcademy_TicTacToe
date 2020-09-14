import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        boolean numbersOccurInOrder = false;

        for (int i = 0; i < array.length - 1; i++) {
            int j = i + 1;
            if (array[i] == num1 && array[j] == num2 || array[i] == num2 && array[j] == num1) {
                numbersOccurInOrder = true;
                break;
            }
        }
        System.out.println(numbersOccurInOrder);
    }
}
