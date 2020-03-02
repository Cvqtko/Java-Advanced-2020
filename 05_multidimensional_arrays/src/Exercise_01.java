import java.util.Scanner;

public class Exercise_01 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		int[][] firstMatrix = readMatrix();
		int[][] secondMatrix = readMatrix();
		
		if(firstMatrix.length != secondMatrix.length ||
				firstMatrix[0].length != secondMatrix[0].length) {
			System.out.println("not equal");
			return;
		}
		for (int row = 0; row < firstMatrix.length; row++) {
			for (int column = 0; column < firstMatrix[0].length; column++) {
				if(firstMatrix[row][column] != secondMatrix[row][column]) {
					System.out.println("not equal");
					return;
				}
			}
		}
		System.out.println("equal");

	}

	public static int[][] readMatrix() {
		String line = scanner.nextLine();
		String[] split = line.split("\\s+");
		int rows = Integer.parseInt(split[0]);
		int cols = Integer.parseInt(split[1]);
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
