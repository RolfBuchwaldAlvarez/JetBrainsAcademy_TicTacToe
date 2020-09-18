import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int numInArray = array[i];
            if (numInArray > max) {
                max = numInArray;
                index = i;
            }
        }
        System.out.println(index);
    }
}