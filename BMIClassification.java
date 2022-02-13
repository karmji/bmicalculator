import java.util.Scanner;

public class BMIClassification {
	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in)) {
			System.out.println("Enter your weight in pounds: ");
			double weight = reader.nextDouble();
			weight = weight / 2.2;
			try (Scanner reader2 = new Scanner(System.in)) {
				System.out.println("Enter your height in inches: ");
				double height = reader2.nextDouble();
				height = height * 0.0254;
				double bmi = weight / (Math.pow(height, 2));
				String health = "";
				if(bmi < 18.5) {
					health = "underweight";
				}
				if(bmi > 18.5 && bmi < 25) {
					health = "normal";
				}
				if(bmi > 25 && bmi < 30) {
					health = "overweight";
				}
				if(bmi > 30) {
					health = "obese";
				}
				System.out.println("Your BMI is " + bmi);
				System.out.println("Your risk category is " + health);
			}
		}
	}
}
