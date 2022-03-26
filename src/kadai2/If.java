package kadai2;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		scan.close();
		if (Integer.parseInt(str) == 0) {
			System.out.println("真");
		} else if (Integer.parseInt(str) == 1) {
			System.out.println("偽");
		} else {
			System.out.println("0か1を入力してください");
		}
	}

}
