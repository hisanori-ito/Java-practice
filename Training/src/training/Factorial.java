package training;

public class Factorial {
	public static void main(String[] args) {
		int result = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "! = ");
			for (int j = 1; j <= i; j++) {
				result *= j;
			}
			System.out.println(result);
			result = 1;
		}
	}
}
