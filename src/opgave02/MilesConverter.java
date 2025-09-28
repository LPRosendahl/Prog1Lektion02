package opgave02;

import java.util.Formatter;
import java.util.Scanner;

public class MilesConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv et antal mil: ");
        double mil = scanner.nextDouble();
        System.out.printf(mil + " mil er: %.1f", + (mil * 1.6));

    }
}
