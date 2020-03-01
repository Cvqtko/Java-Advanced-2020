import java.util.ArrayDeque;
import java.util.Scanner;

public class Exercise_01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayDeque<String> history = new ArrayDeque<String>();
		
		String line = input.nextLine();
		String output = "";
		while (!"Home".equals(line)) {
			if ("back".equals(line)) {
				if(history.size()<=1) {
					output ="no previous URLs";
				}else {
					history.pop();
					output = history.peek();
				}
			}else {
				output=line;
				history.push(line);
			}

			System.out.println(output);
				line = input.nextLine();
		}
	}
}
