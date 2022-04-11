package ClassMethod.human;

public class ClassMethod4 {
	public static void main(String[] args) {
		Method4 yamada = new Method4("山田");
		
		Method4.staticMethodPrint();
		System.out.println(Method4.GREETING);
		
		yamada.instanceMethodPrint();
	}

}
