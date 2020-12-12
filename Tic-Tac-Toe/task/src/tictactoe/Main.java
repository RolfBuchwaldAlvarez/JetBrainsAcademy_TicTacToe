package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println("---------");
        System.out.println("| " + input.charAt(0) + " " + input.charAt(1) + " " + input.charAt(2) + " |");
        System.out.println("| " + input.charAt(3) + " " + input.charAt(4) + " " + input.charAt(5) + " |");
        System.out.println("| "+ input.charAt(6) + " " + input.charAt(7) + " " + input.charAt(8) + " |");
        System.out.println("---------");

        boolean xHasWon = false;
        boolean oHasWon = false;
        boolean impossible = false;
        int xCount = 0;
        int oCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'X') {
                xCount++;
            } else if (input.charAt(i) == 'O') {
                oCount++;
            }
        }

        if (Math.abs(xCount - oCount) >= 2) {
            impossible = true;
        }

        // X wins
         if (input.charAt(0) == 'X' && input.charAt(1) == 'X' && input.charAt(2) == 'X' ||
            input.charAt(3) == 'X' && input.charAt(4) == 'X' && input.charAt(5) == 'X' ||
            input.charAt(6) == 'X' && input.charAt(7) == 'X' && input.charAt(8) == 'X' ||
            input.charAt(0) == 'X' && input.charAt(3) == 'X' && input.charAt(6) == 'X' ||
            input.charAt(1) == 'X' && input.charAt(4) == 'X' && input.charAt(7) == 'X' ||
            input.charAt(2) == 'X' && input.charAt(5) == 'X' && input.charAt(8) == 'X' ||
            input.charAt(0) == 'X' && input.charAt(4) == 'X' && input.charAt(8) == 'X' ||
            input.charAt(2) == 'X' && input.charAt(4) == 'X' && input.charAt(6) == 'X') {
            xHasWon = true;
         }

         if ( // O wins
            input.charAt(0) == 'O' && input.charAt(1) == 'O' && input.charAt(2) == 'O' ||
            input.charAt(3) == 'O' && input.charAt(4) == 'O' && input.charAt(5) == 'O' ||
            input.charAt(6) == 'O' && input.charAt(7) == 'O' && input.charAt(8) == 'O' ||
            input.charAt(0) == 'O' && input.charAt(3) == 'O' && input.charAt(6) == 'O' ||
            input.charAt(1) == 'O' && input.charAt(4) == 'O' && input.charAt(7) == 'O' ||
            input.charAt(2) == 'O' && input.charAt(5) == 'O' && input.charAt(8) == 'O' ||
            input.charAt(0) == 'O' && input.charAt(4) == 'O' && input.charAt(8) == 'O' ||
            input.charAt(2) == 'O' && input.charAt(4) == 'O' && input.charAt(6) == 'O') {
            oHasWon = true;
         }

         if (xHasWon && !oHasWon) {
             System.out.println("X wins");
         } else if (oHasWon && !xHasWon) {
             System.out.println("O wins");
         } else if (input.contains("_") && !xHasWon && !oHasWon && !impossible) {
            System.out.println("Game not finished");
        } else if (!input.contains("_") && !xHasWon && !oHasWon) {
            System.out.println("Draw");
        } else if ((xHasWon && oHasWon) || impossible) {
            System.out.println("Impossible");
        }

    }
}
