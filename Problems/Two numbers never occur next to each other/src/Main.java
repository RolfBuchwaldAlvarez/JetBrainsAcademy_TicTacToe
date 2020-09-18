import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[scanner.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next();
        }
        String num1 = scanner.next();
        String num2 = scanner.next();
        String numberComboNormal = num1 + num2;
        String numberComboReverse = num2 + num1;
        String arrayAsAString = "";

        for (String s : array) {
            arrayAsAString = arrayAsAString + s;
        }

        if (arrayAsAString.contains(numberComboNormal) || arrayAsAString.contains(numberComboReverse)) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

    }
}