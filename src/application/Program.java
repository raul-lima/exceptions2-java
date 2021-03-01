package application;

import java.util.Scanner;

import entities.Account;
import exceptions.BalanceException;
import exceptions.WithdrawLimitException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.println("Number: ");
		Integer number = sc.nextInt();
		System.out.println("Holder:");
		sc.next();
		String holder = sc.nextLine();
		System.out.println("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.println("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		try {
			System.out.println("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			account.withdraw(amount);
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
			
		}
		catch(WithdrawLimitException e) {
			System.out.println(e.getMessage());
		}
		catch(BalanceException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
	}

}
