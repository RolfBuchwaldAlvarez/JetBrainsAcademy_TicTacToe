import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int sequence = 0;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            int restLengthOfArray = array.length - i;
            if (array[i] < num && restLengthOfArray > sequence) {
                num = array[i];
                sequence = 1;
            } else if (array[i] > num) {
                num = array[i];
                sequence++;
            }
        }
        System.out.println(sequence);
    }
}