//Lab 1 by Alex Farley, Ryan Gray, Ajay Mani, Brian Turnbull, and Samantha White
package MainPackage;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		input();

	}

	public static void input() {
		// Create Scanner
		Scanner input = new Scanner(System.in);
		// Years to Work
		System.out.println("How many years do you plan on working?");
		double workyears = input.nextDouble();
		// Annual Return
		System.out.println("What is your expected average ROI?");
		double roi = input.nextDouble();
		// Years Retired
		System.out.println("How long would you like to draw?");
		double retiredyears = input.nextDouble();
		// Annual Retirement
		System.out.println("What is your annual retirement?");
		double annret = input.nextDouble();
		// Required Income
		System.out.println("What is your required income?");
		double reqinc = input.nextDouble();
		// Monthly SSI
		System.out.println("What is your expected SSI income?");
		double ssi = input.nextDouble();
		
		
		double TotalSaving = totalsavings(reqinc, ssi, annret, retiredyears);
		savemonthly(roi, workyears, TotalSaving);
	}

	public static double totalsavings(double reqinc, double ssi, double annret, double retiredyears) {
		double TotalSaving = (reqinc - ssi) * ((1 - (1 / (Math.pow(1 + (annret / 100) / 12, retiredyears * 12)))))
				/ ((annret / 100) / 12);
		System.out.println("Total Saving: $" + TotalSaving);
		return TotalSaving;
	}

	public static void savemonthly(double roi, double workyears, double TotalSaving) {
		double SaveMonthly = TotalSaving
				* (((roi / 100) / 12) / ((Math.pow(1 + (roi / 100) / 12, workyears * 12)) - 1));
		System.out.println("Save Monthly: $" + SaveMonthly);
	}

}

