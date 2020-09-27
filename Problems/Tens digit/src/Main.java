import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();

        if (num.length() >= 2) {
            System.out.println(num.charAt(num.length() - 2));
        } else {
            System.out.println(0);
        }
    }
}