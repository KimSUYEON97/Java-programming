package ex5;

import java.util.Scanner;

public class CheckingAccount implements Valuable{
	private double credit_limit;
	private double interest;
	private double loan_interest;
	private double balance;
	
	public CheckingAccount(double balance,double credit_limit,double interest,double loan_interest){
		this.balance=balance;
		this.credit_limit=credit_limit;
		this.interest=interest;
		this.loan_interest=loan_interest;
	}
	

	public String toString(){
		return String.format("CheckingAccount_Balance: %.2f",balance);
	}
	
	@Override public double EstimateValue(int month){
		if(balance>0){
			double x=balance+(balance*interest)*month;
			balance=x;
		}else if(balance<0){
			double x=balance+(balance*loan_interest)*month;
 			balance=x;
		}
		return balance;
	}
}
