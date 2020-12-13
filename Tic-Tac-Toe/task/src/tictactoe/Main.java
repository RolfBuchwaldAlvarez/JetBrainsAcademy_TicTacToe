package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        boolean gameOver = false;

        System.out.println("Enter cells: " + input);

        System.out.println("---------");
        System.out.println("| " + input.charAt(0) + " " + input.charAt(1) + " " + input.charAt(2) + " |");
        System.out.println("| " + input.charAt(3) + " " + input.charAt(4) + " " + input.charAt(5) + " |");
        System.out.println("| "+ input.charAt(6) + " " + input.charAt(7) + " " + input.charAt(8) + " |");
        System.out.println("---------");

        boolean inputCorrect = false;

        String x = "";
        String y = "";

        while(!inputCorrect) {
            x = sc.next();
            y = sc.next();
            System.out.println("Enter the coordinates: " + x + " " + y);
            int indexForCharAt = userInputTransformedToCharAt(x, y);

            if (input.charAt(indexForCharAt) == 'X' || input.charAt(indexForCharAt) == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
            } else if (Integer.parseInt(x) > 3 || Integer.parseInt(y) > 3) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if (userInputIsNonNumeric(x, y)) {
                System.out.println("You should enter numbers!");
            } else {
                inputCorrect = true;
            }
        }

        input = replaceChar(input, 'X', userInputTransformedToCharAt(x, y));

        System.out.println("---------");
        System.out.println("| " + input.charAt(0) + " " + input.charAt(1) + " " + input.charAt(2) + " |");
        System.out.println("| " + input.charAt(3) + " " + input.charAt(4) + " " + input.charAt(5) + " |");
        System.out.println("| "+ input.charAt(6) + " " + input.charAt(7) + " " + input.charAt(8) + " |");
        System.out.println("---------");

    }

    public static int userInputTransformedToCharAt(String x, String y) {
        String userInputAsAString = x + y;
        int indexForCharAt = 0;
        switch (userInputAsAString) {
            case "11":
                indexForCharAt = 0;
                break;
            case "12":
                indexForCharAt = 1;
                break;
            case "13":
                indexForCharAt = 2;
                break;
            case "21":
                indexForCharAt = 3;
                break;
            case "22":
                indexForCharAt = 4;
                break;
            case "23":
                indexForCharAt = 5;
                break;
            case "31":
                indexForCharAt = 6;
                break;
            case "32":
                indexForCharAt = 7;
                break;
            case "33":
                indexForCharAt = 8;
                break;
        }
        return indexForCharAt;
    }

    public static String replaceChar(String str, char ch, int index) {
        StringBuilder myString = new StringBuilder(str);
        myString.setCharAt(index, ch);
        return myString.toString();
    }

    public static boolean userInputIsNonNumeric(String x, String y) {
        final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
        boolean isNonNumeric = false;

        if (ALPHABET.contains(x) || ALPHABET.contains(y)) {
            isNonNumeric = true;
        }

        return isNonNumeric;
    }

    public static void checkForWinner(String input) {
        boolean xWins = false;
        boolean oWins = false;
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
            xWins = true;
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
            oWins = true;
         }

         if (xWins && !oWins) {
             System.out.println("X wins");
         } else if (oWins && !xWins) {
             System.out.println("O wins");
         } else if (input.contains("_") && !xWins && !oWins && !impossible) {
            System.out.println("Game not finished");
        } else if (!input.contains("_") && !xWins && !oWins) {
            System.out.println("Draw");
        } else if ((xWins && oWins) || impossible) {
            System.out.println("Impossible");
        }
    }
}
