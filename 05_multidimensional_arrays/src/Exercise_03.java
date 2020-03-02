import java.util.Arrays;
import java.util.Scanner;

public class Exercise_03 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int rows = Integer.parseInt(scanner.nextLine());
		int cols = Integer.parseInt(scanner.nextLine());

		String[][] firstMatrix = new String[rows][cols];
		String[][] secondMatrix = new String[rows][cols];

		firstMatrix = readMatrix(firstMatrix);
		secondMatrix = readMatrix(secondMatrix);

		if (firstMatrix.length != secondMatrix.length || firstMatrix[0].length != secondMatrix[0].length) {
			System.out.println("not equal");
			return;
		}
		for (int row = 0; row < firstMatrix.length; row++) {
			for (int column = 0; column < firstMatrix[0].length; column++) {
				if (!firstMatrix[row][column].equals(secondMatrix[row][column])) {
					firstMatrix[row][column] = "*";
				}
			}
		}
		printMatrix(firstMatrix);

	}

	public static String[][] readMatrix(String[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			String[] inputTokens = scanner.nextLine().split(" ");
			for (int column = 0; column < matrix[1].length; column++) {
				matrix[row][column] = inputTokens[column];
			}
		}
		return matrix;
	}

	public static void printMatrix(Object mat[][]) {
		// Loop through all rows
		for (Object[] row : mat) {

			// Loop through all columns of current row
			for (Object x : row) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}

}
