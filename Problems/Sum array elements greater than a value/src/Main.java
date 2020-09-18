import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        int sum = 0;

        for (int numInArray : array) {
            if (numInArray > num) {
                sum += numInArray;
            }
        }

        System.out.println(sum);
    }
}