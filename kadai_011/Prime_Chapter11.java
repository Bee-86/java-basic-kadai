package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		/*
		 * 整数の1から100までにある素数のみをEclipseのコンソールに出力するプログラムを作成しましょう。
		 * 素数とは1より大きい数で、1かその数でしか割り切れない数のことです。例えば5は1か5でしか割り切れないので素数です。
		 * ※「割り切れない」とは、余りが正数のこと。
		 */
		
		//調べる最大値
		boolean[] num = new boolean[101];
		
		//「全て素数かもしれない」ので、numの全ての値をtrueに初期化する。
		for(int i = 2; i < num.length; i++) {
			num[i] = true;
		}
		
		//2～100を繰り返す
		for(int i = 2; i < num.length; i++) {
			if(num[i]) {
				System.out.println(i);
				//num[i]の倍数をfalseにする
				for(int j = 2; j * i < num.length; j++) {
					num[j * i] = false;
				}
			}
		}
			
	}

}
