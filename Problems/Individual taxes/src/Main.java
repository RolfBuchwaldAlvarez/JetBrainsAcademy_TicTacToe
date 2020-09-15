import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int numberOfCompanies = scanner.nextInt();
        double[] companyIncome = new double[numberOfCompanies];
        double[] individualTaxRates = new double[numberOfCompanies];

        for (int i = 0; i < numberOfCompanies; i++) {
            companyIncome[i] = scanner.nextDouble();
        }

        for (int i = 0; i < numberOfCompanies; i++) {
            individualTaxRates[i] = scanner.nextDouble();
        }

        double highestTax = 0.0;
        int companyWithHighestTaxPaid = 0;

        for (int i = 0; i < numberOfCompanies; i++) {
            double value = companyIncome[i];
            double tax = individualTaxRates[i];
            double taxPaid = value * (tax / 100);
            if (taxPaid > highestTax) {
                highestTax = taxPaid;
                companyWithHighestTaxPaid = i + 1;
            }
        }

        System.out.println(companyWithHighestTaxPaid);
    }
}