import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int num = scanner.nextInt();
        boolean arrayContainsNum = false;

        for (int numInArray : array) {
            if (numInArray == num) {
                arrayContainsNum = true;
                break;
            }
        }

        System.out.println(arrayContainsNum);
    }
}