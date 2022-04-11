package ClassMethod.human;

public class Method4 {
	
	static public int humanCount = 0;
	public String name;
	
	public static final String GREETING = "こんにちは";
	
	public Method4(String name) {
		this.name = name;
		Method4.humanCount++;
	}
	
	static public void staticMethodPrint() {
		System.out.println("人の数は" + Method4.humanCount);
	}
	
	public void instanceMethodPrint() {
		System.out.println("名前は" + name);
	}
}
