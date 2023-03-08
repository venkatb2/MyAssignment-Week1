package week1.day2.homework;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 7, 6, 8,10 };

		Arrays.sort(arr);

		int sum = 1;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != sum) {
				System.out.println(sum);

				break;
			}

			sum++;

		}

	}

}
