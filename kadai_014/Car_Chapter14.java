package kadai_014;

public class Car_Chapter14 {
	
	/*
	 * 車クラスは、ギアチェンジすると速度が変わり、走行した時に変わった速度が表示されます。
	 */
	
	private int gear = 1;
	private int speed = 10;

	//ギア値により速度を変えるメソッド
	public void gearChange(int afterGear) {
		System.out.print("ギア" + this.gear + "から");
		this.gear = afterGear;
		System.out.println(this.gear + "に切り替えました");
	}
	
	//ギアチェンジ後の速度を表示する
	public void run() {
		switch(this.gear) {
			case 1,2,3,4,5 -> System.out.println("速度は時速" + (this.speed * this.gear)  + "です");
			default -> System.out.println("速度は時速10kmです");
		}


	}
	

}
