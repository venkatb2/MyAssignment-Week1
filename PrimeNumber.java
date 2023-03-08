package week1.day1.homework;

public class PrimeNumber {

	public void isPrime(int a)

	{

		if (a < 2)

		{

			System.out.println(" please type number greater than 2");
		}

		if (a >= 2) {
			boolean primeFlag = true;

			for (int i = 2; i < a; i++)

			{
				if (a % i == 0) {

					primeFlag = false;
					break;

				}

			}

			if (primeFlag) {

				System.out.println(a + " is prime number");
			}

			else {

				System.out.println(a + " is not a prime number");

			}

		}

	}

	public static void main(String[] args)

	{
		PrimeNumber obj = new PrimeNumber();

		obj.isPrime(-1);

	}

}
