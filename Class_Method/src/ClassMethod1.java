
public class ClassMethod1 {
	public static void main(String[] args) {
		Method1 yamada = new Method1();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age+"です。");
		
		Method1 sato = new Method1("佐藤", 20);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	}
}
