import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int numInArray = array[0];
        int counter = 1;
        for (int num : array) {
            if (num > numInArray) {
                numInArray = num;
                counter++;
            }
        }
        System.out.println(counter == array.length);
    }
}