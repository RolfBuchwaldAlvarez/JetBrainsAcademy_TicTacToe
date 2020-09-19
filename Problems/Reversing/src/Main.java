import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();

        String newNum = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            String charAtIndex = Character.toString(num.charAt(i));
            if (charAtIndex.equals("0") && i == num.length() - 1) {
                continue;
            } else {
                newNum = newNum + num.charAt(i);
            }
        }
        System.out.println(newNum);
    }
}