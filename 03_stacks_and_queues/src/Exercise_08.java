import java.util.ArrayDeque;
import java.util.Scanner;

public class Exercise_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayDeque<String> historyBack = new ArrayDeque<String>();
		ArrayDeque<String> historyForward = new ArrayDeque<String>();
		
		String line = input.nextLine();
		String output = "";
		while (!"Home".equals(line)) {
			if ("back".equals(line)) {
				if(historyBack.size()<=1) {
					output ="no previous URLs";
				}else {
					historyForward.push(historyBack.pop());
					output = historyBack.peek();
				}
			}else if("forward".equals(line)){
				if(historyForward.size()<=0) {
					output ="no next URLs";
				}else {
					output = historyForward.pop();
					historyBack.push(output);
				}
			}
			else {
				output=line;
				historyBack.push(line);
			}

			System.out.println(output);
				line = input.nextLine();
		}
	}
}
