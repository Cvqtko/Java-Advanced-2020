import java.util.Scanner;

public class FindTheRealQueen {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		char[][] board = readMatrix();

		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				if (board[row][col] == 'q' && isValidQueen(row, col, board)) {
					System.out.println(row + " " + col);
				}
			}
		}
	}

	private static boolean isValidQueen(int row, int col, char[][] board) {

		for (int rowDirection = -1; rowDirection <= 1; rowDirection++) {
			for (int colDirection = -1; colDirection <= 1; colDirection++) {

				if (rowDirection == 0 && colDirection == 0) {
					continue;
				}

				int currentRow = row + rowDirection;
				int currentCol = col + colDirection;

				boolean validPosition = isValidPosition(board, currentRow, currentCol);

				while (validPosition) {
					if ('q' == board[currentRow][currentCol]) {
						return false;
					}

					currentRow = currentRow + rowDirection;
					currentCol = currentCol + colDirection;

					validPosition = isValidPosition(board, currentRow, currentCol);
				}
			}
		}

		return true;
	}

	private static boolean isValidPosition(char[][] board, int currentRow, int currentCol) {
		boolean validPosition = currentRow >= 0 && currentRow < board.length && currentCol >= 0
				&& currentCol < board[currentRow].length;
		return validPosition;
	}

	public static char[][] readMatrix() {
		int rows = 8;
		int cols = 8;
		char[][] matrix = new char[rows][cols];
		for (int row = 0; row < rows; row++) {
			String[] inputTokens = scanner.nextLine().split(" ");
			for (int column = 0; column < cols; column++) {
				matrix[row][column] = inputTokens[column].charAt(0);
			}
		}
		return matrix;
	}
}
