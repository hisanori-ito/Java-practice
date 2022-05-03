package practice;

public class If {
	public static void main(String[] args) {
		int number = 7;
		if (number < 7) {
			System.out.println(number + "は5未満です。");
		} else if (number < 10) {
			System.out.println(number + "は5以上,10未満です。");
		} else  if (number < 15) {
			System.out.println(number + "は10以上,15未満です。");
		} else {
			System.out.println(number + "は15未満ではないです。");
		}
		
		String word = "May";
		switch (word) {
		case "April":
			System.out.println("4月");
			break;
		case "May":
			System.out.println("5月");
			break;
		default:
			System.out.println("わからん！");
		}
		
		int distance = 20;
		if (distance <= 5) {
			System.out.println("とても近いです");
		} else if (distance <= 10) {
			System.out.println("近いです");
		} else if (distance <= 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
		
		String color = "red";
		switch (color) {
		case "red":
			System.out.println("危険！");
			break;
		case "yellow":
			System.out.println("気をつけて！");
			break;
		case "blue":
			System.out.println("渡れます！");
			break;
		default:
			System.out.println("わかりません");
		}
	}
}
