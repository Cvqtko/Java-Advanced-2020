package exercise_02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numberOfCars = Integer.parseInt(scanner.nextLine());
		Car car;
		while (numberOfCars-- > 0) {
			String[] tokens = scanner.nextLine().split("\\s+");
			if (tokens.length > 1) {
				car = new Car(tokens[0], tokens[1], Integer.parseInt(tokens[2]));
			} else {
				car = new Car(tokens[0]);
			}

			System.out.println(car.carInfo());
		}

	}
}
