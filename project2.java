package project2; 
import java.util.Scanner;

public class project2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double income = 0;
		double tax = 0;
		double enteredDeduction = 0;
		double deduction = 0;
		double taxableincome = 0;

		System.out.println("Please , Enter income and deductions  (0 to quit):");
		double input = scanner.nextDouble();

		while (input != 0) {
			if (input > 0) {
				income += input;
			} else {
				enteredDeduction += input;
			}

			System.out.println("Please , Enter income and deductions  (0 to quit):");
			input = scanner.nextDouble();
		}

		if (enteredDeduction < -12950) {
			deduction = enteredDeduction;
		} else {
			deduction = -12950;

		}
		System.out.println("Reporting . . .");

		taxableincome = income + deduction;

		if (taxableincome <= 0) {
			tax = 0;
		} else if (taxableincome <= 10275) {
			tax = taxableincome * 0.1;
		} else if (taxableincome <= 41775) {
			tax = 1027.5 + (taxableincome - 10275) * 0.12;
		} else if (taxableincome <= 89075) {
			tax = 4807.5 + (taxableincome - 41775) * 0.22;
		} else if (taxableincome <= 170050) {
			tax = 15213.5 + (taxableincome - 89075) * 0.24;
		} else if (taxableincome <= 215950) {
			tax = 34647.5 + (taxableincome - 170050) * 0.32;
		} else if (taxableincome <= 539900) {
			tax = 49335.5 + (taxableincome - 215950) * 0.35;
		} else {
			tax = 162718 + (taxableincome - 539900) * 0.37;
		}

		System.out.println("Incomes = $" + income);
		System.out.println("Deductions: $" + deduction);
		System.out.println("Taxable Income: $" + taxableincome);
		System.out.println("Tax amount: $" + tax);

	}
}