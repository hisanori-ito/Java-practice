package src;

public class gcd_practice {
	public static void main(String[] args) {
		int a = 1778;
		int b = 224;
		System.out.println(a + " と " + b + " の最大公約数は、" + gcd(a, b) + "です。");
		
		static int gcd(int a, int b) {
			if ( b == 0) {
				return a;
			}
			
			return gcd(b, a % b);
		}
	}
}
