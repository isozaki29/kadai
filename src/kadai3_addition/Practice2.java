package kadai3_addition;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数a
		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a * b % 2 == 0) {
			System.out.println("2つの整数の積" + a * b + "は偶数です");
		} else {
			System.out.println("2つの整数の積" + a * b + "は奇数です");
		}

	}

}
