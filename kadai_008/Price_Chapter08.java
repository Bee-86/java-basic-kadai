package kadai_008;

public class Price_Chapter08 {

	public static void main(String[] args) {
		
		/*
		 * 年代と、サービスの使用料金を表す変数を宣言し、初期化します。
		 * 変数名は、ローワーキャメルケースで記述します。
		 * 年代を表す変数は、int型の「userAge」としましょう。
		 * サービスの使用料金を表す変数は、int型の「serviceCost」としましょう。
		 * 複数の条件分岐により導き出された料金を取得できるように、switch式を使いましょう。
		 */
		
		int userAge = 30;
		int servicecCost = 3000;
		
		switch(userAge) {
			case 10,20,30,40,50,60,70,80 -> System.out.println(userAge + "代の料金は" + servicecCost + "円");
			default -> System.out.println(userAge + "代の料金は500円");
		}

	}

}
