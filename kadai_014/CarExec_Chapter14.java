package kadai_014;

import java.util.Scanner;

public class CarExec_Chapter14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ギア変更 →");
		int gear = scanner.nextInt();
		
		Car_Chapter14 car = new Car_Chapter14();
		car.gearChange(gear);
		car.run();

	}

}
