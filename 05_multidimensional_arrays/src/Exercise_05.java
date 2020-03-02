import java.util.Scanner;

public class Exercise_05 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] matrix = readMatrix();

		for (int row = 0; row < matrix.length; row++) {
			int col = row;
			System.out.print(matrix[row][col] + " ");
		}
		System.out.println();

		for (int row = matrix[0].length - 1; row >= 0; row--) {
			int col = matrix[0].length - 1- row;
			System.out.print(matrix[row][col] + " ");
		}

	}

	public static int[][] readMatrix() {
		int rows = Integer.parseInt(scanner.nextLine());
		int cols = rows;
		int[][] matrix = new int[rows][cols];
		for (int row = 0; row < rows; row++) {
			String[] inputTokens = scanner.nextLine().split(" ");
			for (int column = 0; column < cols; column++) {
				matrix[row][column] = Integer.parseInt(inputTokens[column]);
			}
		}
		return matrix;
	}
}
