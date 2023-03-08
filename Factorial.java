package week1.day1.homework;

public class Factorial {

	public void factorialNumber(int n)

	{

		int fact = 1;

		for (int i = 1; i <= n; i++)

		{
			fact = fact * i;

		}

		System.out.println(fact);

	}

	public static void main(String[] args) {

		Factorial obj = new Factorial();

		obj.factorialNumber(5);

	}

}
