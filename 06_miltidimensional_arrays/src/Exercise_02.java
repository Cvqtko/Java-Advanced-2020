import java.util.Scanner;

public class Exercise_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] line = scanner.nextLine().split(" ");
		scanner.close();
		String[][] matrix = new String[Integer.parseInt(line[0])][Integer.parseInt(line[1])];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = getPalindromes(i, i + j);
			}
		}
		printMatrix(matrix);
	}

	public static String getPalindromes(int firstLetter, int secondLetter) {
		return ((char) (firstLetter + 97) + "" + (char) (secondLetter + 97) + "" + (char) (firstLetter + 97) + "");
	}

	public static void printMatrix(Object[][] matrix) {
		for (Object[] line : matrix) {
			for (Object cell : line) {
				System.out.print(cell + " ");
			}
			System.out.println();
		}
	}
}