package ex3;

import java.util.Scanner;

public class CheckingAccount extends Account{
	
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	public CheckingAccount(double credit_limit,double interest,double loan_interest,double balance){
		super(balance);
		this.credit_limit=credit_limit;
		this.interest=interest;
		this.loan_interest=loan_interest;
	}
	
	@Override public void debit(double money){
		if(getBalance()<credit_limit){
			System.out.printf("Debit amount exceeded account balance\n");
		}
		else {
			super.debit(money);
			if(getBalance()<0){
				System.out.printf("account balance is lower than 0\n");
			}
		}
	}
	
	public void nextMonth(){
		if(getBalance()>0){
			double x=getBalance()+getBalance()*interest;
			setBalance(x);
		}else if(getBalance()<0){
			double x=getBalance()+getBalance()*loan_interest;
 			setBalance(x);
		}
	}

}
