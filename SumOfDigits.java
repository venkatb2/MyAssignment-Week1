package week1.day1.homework;

public class SumOfDigits {

	public static void main(String[] args) {

		int a = 1234;

		int b = a;

		int c;

		int s = 0;

		while (b > 0)

		{
			c = b % 10;
			b = b / 10;

			s = s + c;

		}

		System.out.println(s);

	}

}
