package opgave01;

import java.util.Scanner;

public class CalculateVat {
    public static void main(String[] args) {
        //Lav en metode hvor man kan indtaste et beløb i hele kroner og udskriv momsbeløbet.
        //intast beløb * 0,25;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Indtast beløb du vil have regnet momsbeløbet på: ");
        double beløb = scanner.nextDouble();

        double moms = beløb * 0.25;

        System.out.printf("Dit momsbeløb er: %.3f", moms);

        scanner.close();


    }
}
