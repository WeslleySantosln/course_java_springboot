package application;


import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
	List<Account> list = new ArrayList<>();	
	double sum = 0.0;
	
	
	list.add(new SavingsAccount(1001, "Weslley", 500.00, 0.01));
	list.add(new BusinessAccount(1002, "Islanny", 1000.00, 1000.00));
	list.add(new SavingsAccount(1003, "Hellen", 500.00, 0.01));
	list.add(new BusinessAccount(1004, "Erickson", 1000.00, 1000.00));
	
	for(Account li : list) {
		sum += li.getBalance();
	}

	System.out.println(sum);
	
	
	for(Account li : list) {
		li.deposit(10.00);
		System.out.println(li);
	}
	
	
	
	}

}
