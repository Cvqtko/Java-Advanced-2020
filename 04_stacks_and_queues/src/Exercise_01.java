import java.util.ArrayDeque;
import java.util.Scanner;

public class Exercise_01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] array = scanner.nextLine().split("\\s+");
		ArrayDeque<String> deque = new ArrayDeque<>();
		for (int i = 0; i < array.length; i++) {
			deque.push(array[i]);
		}
		while (!deque.isEmpty()) {
			System.out.print(deque.pop() + " ");
		}
		scanner.close();
	}

}
