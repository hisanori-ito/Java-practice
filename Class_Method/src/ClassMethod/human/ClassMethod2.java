package ClassMethod.human;

public class ClassMethod2 {
	public static void main(String[] args) {
		Method2 yamada = new Method2();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");
		
		Method2 sato = new Method2("佐藤", 25);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	}
}
