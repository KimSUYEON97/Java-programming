package ex3;

import java.util.Scanner;

public class Account {
	private double balance;
	
	public Account(double balance){
		this.balance=balance;
	}
	public void credit (double money){
		balance+=money;
	}
	public void debit (double money){
		balance-=money;
	}
	public double getBalance(){
		return balance;
	}
	protected void setBalance(double money){
		balance=money;
	}
}
