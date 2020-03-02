import java.util.Scanner;

public class Exercise_06 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] matrix = readMatrix();
		int mistakenNumber = getMistakenNumber(matrix);

		matrix = correctMatrix(mistakenNumber, matrix);
		printMatrix(matrix);

	}

	private static int[][] correctMatrix(int mistakenNumber, int[][] matrix) {
		int[][] correctMatrix = copyMatrix(matrix);

		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == mistakenNumber) {
					correctMatrix[row][col] = getCorrectNumber(mistakenNumber, matrix, row, col);
				}
			}

		}
		return correctMatrix;
	}

	private static int getCorrectNumber(int mistakenNumber, int[][] matrix, int row, int col) {

		int correctNumber = 0;
		boolean corrected = false;
		for (int rowDirection = -1; rowDirection <= 1; rowDirection++) {
			for (int colDirection = -1; colDirection <= 1; colDirection++) {
				if ((rowDirection == 0 && colDirection == 0) 
						|| rowDirection == colDirection 
						|| rowDirection==colDirection+2
						|| rowDirection==colDirection-2) {
					continue;
				}

				int currentRow = row + rowDirection;
				int currentCol = col + colDirection;

				if (isValidPosition(matrix, currentRow, currentCol)) {
					if (matrix[currentRow][currentCol] != mistakenNumber) {
						corrected = true;
						correctNumber += matrix[currentRow][currentCol];
					}

				}
			}
		}
		if(corrected) {
			return correctNumber;
		}else {
			return mistakenNumber;
		}
		
	}

	private static boolean isValidPosition(int[][] matrix, int currentRow, int currentCol) {
		boolean validPosition = currentRow >= 0 && currentRow < matrix.length && currentCol >= 0
				&& currentCol < matrix[currentRow].length;
		return validPosition;
	}

	private static int getMistakenNumber(int[][] matrix) {
		String line = scanner.nextLine();
		String[] split = line.split("\\s+");
		int rows = Integer.parseInt(split[0]);
		int cols = Integer.parseInt(split[1]);
		return matrix[rows][cols];
	}

	public static int[][] readMatrix() {
		int rows = Integer.parseInt(scanner.nextLine());
		int[][] matrix = new int[rows][];
		for (int row = 0; row < rows; row++) {
			String[] inputTokens = scanner.nextLine().split(" ");
			matrix[row] = new int[inputTokens.length];
			for (int column = 0; column < inputTokens.length; column++) {

				matrix[row][column] = Integer.parseInt(inputTokens[column]);
			}
		}
		return matrix;
	}
	
	private static int[][] copyMatrix(int[][] matrix){
		int[][] CloneMatrix = new int[matrix.length][];
		for (int i = 0; i < matrix.length; i++) {
			CloneMatrix[i] = new int[matrix[i].length];
		    System.arraycopy(matrix[i], 0, CloneMatrix[i], 0, CloneMatrix[i].length);
		}
		return CloneMatrix;
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}