package assignment1;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num, originalNum, remainder, n = 0;
		double result = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
		num = scanner.nextInt();
		originalNum = num;
		while (originalNum != 0) {
			originalNum /= 10;
			++n;
		}
        originalNum = num;
        while (originalNum != 0) {
			remainder = originalNum % 10;
			result += Math.pow(remainder, n);
			originalNum /= 10;
		}
		if ((int) result == num)
			System.out.println(num + " is an Armstrong number.");
		else
			System.out.println(num + " is not an Armstrong number.");
	}
}
