package kadai2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Collection {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		// ArrayListに選手の名前を追加します
		names.add("吉川尚輝");
		names.add("坂本勇人");
		names.add("ポランコ");
		names.add("岡本和真");
		names.add("丸佳浩");
		names.add("中田翔");
		names.add("ウィーラー");
		names.add("大城卓三");
		names.add("菅野智之");

		// ArrayListの内容を出力します
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		Map<String, Integer> number = new HashMap<>();
		// Mapに選手名をキー、背番号を値に追加します
		number.put("吉川尚輝", 2);

		// キーをもとに背番号を出力します
		int yoshikawa = number.get("吉川尚輝");
		System.out.println("吉川選手の背番号は" + yoshikawa);
	}
}
