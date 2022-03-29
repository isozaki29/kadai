package kadai3;

public class Main {

	public static void main(String[] args) throws IllegalArgumentTime {

		// アンケートクラスのインスタンス化
		Questionare questionare = new Questionare();
		// 携帯の使用時間を引数にして、usageTimeメソッドを呼ぶ
		questionare.usageTime(1);
		questionare.usageTime(5);
		questionare.usageTime(-1);

	}

}
