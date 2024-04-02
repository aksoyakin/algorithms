package bmi;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        BodyMassIndex bmi = new BodyMassIndex();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your height: ");
        double height = scanner.nextDouble();
        System.out.print("Please enter your weight as a kilogram: ");
        double weight = scanner.nextDouble();

        double result = bmi.calculateBmi(height,weight);
        System.out.println("Your BMI is " + result);
        System.out.println(bmi.printWeightRange(result));

    }
}
