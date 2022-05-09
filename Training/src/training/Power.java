package training;

public class Power {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				double result = Math.pow(i, j);
				System.out.print(i + "の" + j + "乗は");
				System.out.println((int)result);
			}
		}
	}
}
