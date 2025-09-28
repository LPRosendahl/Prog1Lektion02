package opgave04;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast månedlig indkomst ");
        int income = scanner.nextInt();
        int tax = calculateTax(income);
        System.out.println("Månedlige skat er " + tax);
    }

    public static int calculateTax(int monthlyIncome) {
        int BASEDECUTION = 48_000;
        int yearlyIncome = monthlyIncome * 12; //30.000 * 12 = 360.000
        int taxableIncome = yearlyIncome - BASEDECUTION;
        int tax2 = (int) ((taxableIncome * 0.37) / 12);
        int topskatgrænse = 568_900;
        if (yearlyIncome <= BASEDECUTION) {
            return 0;
        }
        else if (yearlyIncome > topskatgrænse){
            int topskat = (int) (yearlyIncome - 568_900);
            double payTopSkat = topskat * 0.15;

            System.out.println("Årsløn: " + yearlyIncome);
            System.out.println("Skattepligtig indkomst " + taxableIncome);
            System.out.println("Løn over topskat grænse: " + topskat);
            System.out.println("Topskat: " + payTopSkat);

        }
        return tax2;
    }
}
