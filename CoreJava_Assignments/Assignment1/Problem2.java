package Assignment1;

public class Problem2 {

	public static void main(String[] args) {
		int from = 100, to = 999;

		for (int number = from + 1; number < to; ++number) {
			int digits = 0;
			int result = 0;
			int originalNumber = number;

			while (originalNumber != 0) {
				originalNumber /= 10;
				++digits;
			}
			originalNumber = number;

			while (originalNumber != 0) {
				int remainder = originalNumber % 10;
				result += Math.pow(remainder, digits);
				originalNumber /= 10;
			}
			if (result == number) {
				System.out.print(number + " ");
			}
		}
	}
}
