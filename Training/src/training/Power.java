package training;

public class Power {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			int result = i;
			for (int j = 1; j <= 10; j++) {
				System.out.print(i + "の" + j + "乗は");
				result *= j;
				System.out.println(result);
			}
		}
	}
}
