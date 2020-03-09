package exercise_03;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String line = scanner.nextLine();
		HashMap<Integer, BankAccount> bankAccounts = new HashMap<>();

		while (!"End".equals(line)) {
			String[] tokens = line.split("\\s+");
			switch (tokens[0]) {
			case "Create":
				bankAccounts.put(BankAccount.getBankAccountCount(), new BankAccount());
				System.out.printf("Account ID%s created\n",BankAccount.getBankAccountCount()-1);
				break;
			case "Deposit":
				if (bankAccounts.containsKey(Integer.parseInt(tokens[1]))) {
					bankAccounts.get(Integer.parseInt(tokens[1])).deposit(Double.parseDouble(tokens[2]));
					System.out.printf("Deposited %s to ID%s\n",tokens[2],tokens[1]);
					
				} else {
					System.out.println("Account does not exist");
				}
				break;
			case "SetInterest":
				BankAccount.setInterestRate(Double.parseDouble(tokens[1]));
				break;
			case "GetInterest":
				if (bankAccounts.containsKey(Integer.parseInt(tokens[1]))) {
					System.out.printf("%.2f\n",bankAccounts.get(Integer.parseInt(tokens[1])).getInterest(Integer.parseInt(tokens[2])));
				}else {
					System.out.println("Account does not exist");
				}
				break;
			}
			line = scanner.nextLine();
		}
	}
}
