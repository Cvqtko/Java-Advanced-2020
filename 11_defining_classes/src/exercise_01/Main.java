package exercise_01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numberOfCars = Integer.parseInt(scanner.nextLine());

		while (numberOfCars-- > 0) {
			String[] tokens = scanner.nextLine().split("\\s+");
			Car car = new Car();

			car.setBrand(tokens[0]);
			car.setModel(tokens[1]);
			car.setHorsePower(Integer.parseInt(tokens[2]));

			System.out.println(car.carInfo());
		}

	}
}
