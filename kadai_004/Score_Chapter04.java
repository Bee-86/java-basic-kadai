package kadai_004;

public class Score_Chapter04 {

	public static void main(String[] args) {
		
		/*
		 * テストを受けた人の点数と、テストの平均点をEclipseのコンソールに出力するプログラムを作成しましょう。
		 * 作業手順は後述の各Stepを参考にしてください。
		 * 
		 * Aさんの点数は10点
		 * Bさんの点数は20点
		 * Cさんの点数は30点
		 * Dさんの点数は40点
		 * Eさんの点数は50点
		 * Fさんの点数は60点
		 * Gさんの点数は70点
		 * Hさんの点数は80点
		 * Iさんの点数は90点
		 * Jさんの点数は100点
		 * 
		 * テストの平均点は55点
		 */
		
		String [] name = {"A","B","C","D","E","F","G","H","I","J"};
		int [] score = {10,20,30,40,50,60,70,80,90,100};
		int sum = 0;
		int avg = 0;
		
		for(int i = 0; i < name.length; i++) {
			sum += score[i];
			System.out.println(name[i] + "さんの点数は" + score[i] + "点");
		}
		
		avg = sum / score.length;
		System.out.println("テストの平均点は" + avg + "点");

	}

}
