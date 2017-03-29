package ex4;

import java.util.Scanner;

public class CheckingAccount extends Account{
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	public CheckingAccount(double balance,double credit_limit,double interest,double loan_interest){
		super(balance);
		this.credit_limit=credit_limit;
		this.interest=interest;
		this.loan_interest=loan_interest;
	}
	
	@Override public void debit(double money){
		super.debit(money);
	}
	
	@Override
	public double getWithdrawableAccount(){
		double x;
		x= getBalance()+credit_limit;
		if(x>0){
			return x;
		}else{
			return 0.0;
		}
	}
	
	@Override
	public void passTime(int month){
		if(getBalance()>0){
			double x=(getBalance()+getBalance()*interest)*month;
			setBalance(x);
		}else if(getBalance()<0){
			double x=(getBalance()+getBalance()*loan_interest)*month;
 			setBalance(x);
		}
	}
	
	public boolean isBankrupted(){
		if(getBalance()<-50){
			return false;
		}
		return true;
	}
}
