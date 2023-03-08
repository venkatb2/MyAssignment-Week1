package week1.day1.homework;

public class SwitchOperator {

	public static void main(String[] args) {

		int a = 6;

		int b = 2;

		String s = "div";

		switch (s) {
		case "add":
			System.out.println(a + b);
			break;
		case "sub":
			System.out.println(a - b);
			break;

		case "mul":
			System.out.println(a * b);
			break;
		case "div":
			System.out.println(a / b);
			break;

		}

	}
}
