package kadai3;

public class Questionare {

	public void usageTime(int time) throws IllegalArgumentTime {
		if (time < 0) {
			throw new IllegalArgumentTime("0以上の時間を入力してください。");
		} else if (time < 4) {
			System.out.println("正常な使用時間です。");
		} else if (time >= 4) {
			System.out.println("使用しすぎです。");
		}
	}
}
