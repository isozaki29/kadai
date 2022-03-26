package kadai2;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Week_Threeyear {

	public static void main(String[] args) {
		// 現在時刻を取得
		LocalDateTime ldt = LocalDateTime.now();
		// 現在時刻から3年後を取得
		ldt = ldt.plusMonths(36);
		// 取得した時刻から曜日を取得する
		DayOfWeek week = ldt.getDayOfWeek();
		System.out.println(week);
	}

}
