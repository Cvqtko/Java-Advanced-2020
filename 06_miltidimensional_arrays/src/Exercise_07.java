import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int rows = scanner.nextInt();
		int cols = scanner.nextInt();
		scanner.nextLine();

		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		int counter = 1;

		for (int row = 0; row < rows; row++) {
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			for (int col = 0; col < cols; col++) {
				numbers.add(counter++);
			}
			matrix.add(numbers);
		}

		String input = scanner.nextLine();
		while (!"Nuke it from orbit".equals(input)) {
			int[] tokens = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();

			int row = tokens[0];
			int col = tokens[1];
			int radius = tokens[2];

			ArrayList<Integer> currentRow = matrix.get(row);

			for (int i = Math.max(0, col - radius); i <= Math.min(col + radius, currentRow.size() - 1); i++) {
				currentRow.set(i, -1);
			}

			for (int i = Math.max(0, row - radius); i <= Math.min(row + radius, matrix.size() - 1); i++) {
				if (col < matrix.get(i).size())
					matrix.get(i).set(col, -1);
			}

			matrix.set(row, currentRow);

			for (ArrayList<Integer> removeZeros : matrix) {
				removeZeros.removeAll(Arrays.asList(-1));
			}

			matrix.removeIf(ArrayList::isEmpty);

			input = scanner.nextLine();
		}

		printMatrix(matrix);
	}

	private static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
		for (ArrayList<Integer> integers : matrix) {
			integers.forEach(s -> System.out.print(s + " "));
			System.out.println();
		}

	}
}
