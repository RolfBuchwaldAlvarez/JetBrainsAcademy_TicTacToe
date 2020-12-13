import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int aCounter = 0;
        int bCounter = 0;
        int cCounter = 0;
        int dCounter = 0;

        for (int i = 0; i < n; i++) {
            String userInputAsAString = sc.next();
            switch (userInputAsAString) {
                case "5":
                    aCounter++;
                    break;
                case "4":
                    bCounter++;
                    break;
                case "3":
                    cCounter++;
                    break;
                case "2":
                    dCounter++;
                    break;
                default:
                    break;
            }
        }

        System.out.println(dCounter + " " + cCounter + " " + bCounter + " " + aCounter);

    }
}