package ex5;

import java.util.Scanner;

public class SavingsAccount implements Valuable{
	private double interest;
	private int month;
	private double balance;
	
	public SavingsAccount(double balance, double interest){
		this.balance=balance;
		this.interest=interest;
	}
	
	public String toString(){
		return String.format("SavingsAccount_Balance: %.2f",balance);
	}
	
	@Override public double EstimateValue(int month){
		if(this.month<12){
			double x=balance*Math.pow((1+interest),month);
			balance=x;
		}
		this.month+=month;
		return balance;
	}
}
