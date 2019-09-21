package sauceda_PA2;
import java.util.Scanner;
public class BMI_p2 {

	public static void main(String[] args) {
		final double BMI_CONSTANT = 703;
		Scanner scnr = new Scanner(System.in);
		int selection;
		double weightInPounds, heightInInches, weightInKilograms, heightInMeters, bmi;
		
		System.out.println("This program will calculate your BMI using either standard or metric measures.");
		System.out.print("To use standard measurements press 1 or press 2 for metric measurements> ");
		
		selection = scnr.nextInt();
		if (selection == 1) {
			System.out.println("Please, enter your weight in pounds> ");
			weightInPounds = scnr.nextDouble();
			System.out.println();
			System.out.println("Please, enter your height in inches> ");
			heightInInches = scnr.nextDouble();
			bmi = (BMI_CONSTANT * weightInPounds) / (heightInInches * heightInInches);
			System.out.printf("Your BMI is %.1f.\n\n", bmi);
		}
		else if (selection == 2){
			System.out.println("Please, enter your weight in kilograms> ");
			weightInKilograms = scnr.nextDouble();
			System.out.println();
			System.out.println("Please, enter your height in meters> ");
			heightInMeters = scnr.nextDouble();
			bmi = (weightInKilograms) / (heightInMeters * heightInMeters);
			System.out.printf("Your BMI is %.21\n\n", bmi);
		}
		else {
			System.out.print("Invalid selection!\n\n");	
		}
		
		System.out.println("BMI Categories:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5–24.9");
		System.out.println("Overweight = 25–29.9");
		System.out.println("Obesity = BMI of 30 or greater");
	}

}
