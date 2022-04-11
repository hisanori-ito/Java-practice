package ClassMethod.human;

public class ClassMethod3 {
	public static void main(String[] args) {
		Method3 yamada = new Method3();
		
		System.out.println("私の名前は、" + yamada.name + "です。");
		String profile = yamada.getProfile();
		System.out.println(profile + "です。");
		
		yamada.greet("田辺");
		yamada.greet(null);
	}
}
