package opgave03;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        /*Lav et program der kan beregne BMI (Body Mass Index).
        Programmet skal promte brugeren for vægt og højde og
        derefter udskrive BMI. BMI beregnes med formlen
        BMI = vægt i kg / (højde i meter * højde i meter)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hvad er din vægt i KG: ");
        double vægt = scanner.nextDouble();


        System.out.print("Hvad er din højde i meter: ");
        double højde = scanner.nextDouble();

        double bmi = (vægt / (højde * højde));

        System.out.printf("Din BMI er: %.2f%n", + bmi);

        if (bmi < 18.5){
            System.out.println("Du er undervægtig");
        }
        else if (bmi > 18.5 && bmi < 24.9){
            System.out.println("Du er normalvægtig!");
        }
        else if (bmi > 25.0 && bmi < 29.9){
            System.out.println("Du er overvægtig! Løb en tur!");
        }
        else{
            System.out.println("Du er svært overvægtig! Løb en tur!!");
        }

    }
}
